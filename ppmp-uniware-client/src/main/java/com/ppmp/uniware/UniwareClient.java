package com.ppmp.uniware;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.Response;

import org.springframework.http.HttpStatus;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;

import com.ppmp.uniware.api.GetSaleOrderRequest;
import com.ppmp.uniware.api.GetSaleOrderResponse;
import com.ppmp.uniware.base.ServiceResponse;

/**
 * @author ankurpratik on 21/11/18.
 */
public class UniwareClient extends PpmpClient {


    private static final String UNIWARE_CLIENT_TOKEN_PREFIX = "U55C";
    private static final String UNIWARE_CLIENT_TOKEN_SECRET = "5308fc4e-8cf8-8040-2d2ecf51ccd6";
    private static final String AUTHORIZATION_HEADER_PREFIX = "bearer ";

    private static final String POS_REST_PREFIX             = "services/rest/pos/v1";
    private static final String REST_PREFIX                 = "services/rest/v1";
    private static final String REST_MOBILE_PREFIX          = "services/rest/mobile/v1";
    private static final String CONTENT_TYPE_HEADER         = "Content-Type";
    private static final String CONTENT_TYPE_VALUE          = "application/json";
    private static final String AUTHORIZATION_HEADER        = "Authorization";
    private static final String FACILITY_HEADER             = "Facility";

    private String              servicesEndpoint            = "https://titan.unicommerce.com";

    public UniwareClient() {
    }

    public UniwareClient(Client client, String servicesEndpoint) {
        setClient(client);
        this.servicesEndpoint = servicesEndpoint;
    }

    public DefaultOAuth2AccessToken getAuthToken() throws PosClientException {
        Invocation invocation = getClient().target("https://titan.unicommerce.com").path("oauth/token").queryParam("grant_type", "password").queryParam("client_id",
                "my-trusted-client").queryParam("username", "Cwhpew%2B15%40titan.co.in").queryParam("password", "nov%402018").request().buildGet();
        return invoke(invocation, DefaultOAuth2AccessToken.class);
    }

    public GetSaleOrderResponse getXmlResponse(GetSaleOrderRequest request) throws PosClientException {
        //Invocation invocation ;

        System.out.println( Entity.entity(request, MediaType.TEXT_XML));
        Response post = getClient().target("https://brandstudio.unicommerce.com:443/services/soap/?version=1.8").
                request(MediaType.TEXT_XML).
                accept(MediaType.TEXT_XML).
                post(Entity.entity(request, MediaType.TEXT_XML));

        //  post(
               // Entity.entity(request, MediaType.APPLICATION_XML));
        //Response r =invocation.invoke();


        System.out.println(post.toString());
        return new GetSaleOrderResponse();
    }

    public <T extends ServiceResponse> T invokeAndGetServiceResponse(Invocation invocation, Class<T> returnType) throws PosClientException {
        return invokeAndGetServiceResponse(invocation, returnType, true);
    }

    public <T extends ServiceResponse> T invokeAndGetServiceResponse(Invocation invocation, Class<T> returnType, boolean fetchSuccessfulOnly) throws PosClientException {
        Response response = null;
        try {
            response = invocation.invoke();
            switch (response.getStatusInfo().getFamily()) {
                case SUCCESSFUL:
                    T serviceResponse = response.readEntity(returnType);
                    System.out.println("response is successful");
                    if (serviceResponse.isSuccessful() || !fetchSuccessfulOnly) {
                        return serviceResponse;
                    } else {
                        String message = HttpStatus.BAD_REQUEST.getReasonPhrase();
                        if (serviceResponse.getErrors() != null && serviceResponse.getErrors().size() > 0) {
                            message = serviceResponse.getErrors().get(0).getDescription();
                        }
                        throw new PosClientException(HttpStatus.BAD_REQUEST.value(), message, serviceResponse);
                    }
                default:
                    throw new PosClientException(response.getStatusInfo().getStatusCode(), HttpStatus.INTERNAL_SERVER_ERROR.toString(), response.readEntity(String.class));
            }
        } catch (ProcessingException e) {
            throw new PosClientException(HttpStatus.INTERNAL_SERVER_ERROR.value(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), null);
        } finally {
            if (response != null) {
                response.close();
            }
        }
    }

    private MultivaluedHashMap<String, Object> prepareDefaultHeaders() {
        MultivaluedHashMap headers = new MultivaluedHashMap<String, Object>();
        headers.add(CONTENT_TYPE_HEADER, CONTENT_TYPE_VALUE);
        return headers;
    }

    private MultivaluedHashMap<String, Object> prepareDefaultXMLHeaders() {
        MultivaluedHashMap headers = new MultivaluedHashMap<String, Object>();
        headers.add(CONTENT_TYPE_HEADER, "text/xml");
        return headers;
    }
}
