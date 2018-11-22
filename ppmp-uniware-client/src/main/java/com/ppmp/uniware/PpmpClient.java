package com.ppmp.uniware;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.Response;

import org.springframework.http.HttpStatus;

import com.ppmp.uniware.api.PosExceptionResponse;

/**
 * @author ankurpratik on 21/11/18.
 */
public abstract class PpmpClient {
    private Client client;

    private String endpoint;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public <T> T invoke(Invocation invocation, Class<T> returnType) throws PosClientException {
        Response response = null;
        try {
            response = invocation.invoke();
            switch (response.getStatusInfo().getFamily()) {
                case SUCCESSFUL:
                    return returnType != null ? response.readEntity(returnType) : null;
                case SERVER_ERROR:
                    String serviceResponse = response.readEntity(String.class);
                    throw new PosClientException(response.getStatusInfo().getStatusCode(), HttpStatus.INTERNAL_SERVER_ERROR.toString(), serviceResponse);
                default:
                    try {
                        PosExceptionResponse exceptionResponse = response.readEntity(PosExceptionResponse.class);
                        throw new PosClientException(response.getStatusInfo().getStatusCode(), exceptionResponse.getMessage(), exceptionResponse);
                    } catch (ProcessingException e) {
                        throw new PosClientException(response.getStatusInfo().getStatusCode(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), null);
                    }
            }
        } catch (ProcessingException e) {
            throw new PosClientException(HttpStatus.INTERNAL_SERVER_ERROR.value(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), null);
        } finally {
            if (response != null) {
                response.close();
            }
        }
    }
}
