package com.ppmp.uniware.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ankurpratik on 20/11/18.
 */
public class ServiceResponse implements Serializable {

    private static final long serialVersionUID = -1549846444746590813L;
    private boolean           successful;
    private String            message;
    private List<WsError>     errors           = new ArrayList<>();
    private List<WsWarning>   warnings         = new ArrayList<>();

    public ServiceResponse() {

    }

    public ServiceResponse(boolean successful, String message) {
        this.successful = successful;
        this.message = message;
    }

    /**
     * @return the successful
     */
    public boolean isSuccessful() {
        return successful;
    }

    /**
     * @param successful the successful to set
     */
    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    public void setErrors(List<WsError> errors) {
        this.errors = errors;
    }

    public List<WsError> getErrors() {
        return errors;
    }

    public ServiceResponse addError(WsError error) {
        if (this.errors == null) {
            this.errors = new ArrayList<WsError>();
        }
        this.errors.add(error);
        return this;
    }

    public ServiceResponse addErrors(List<WsError> errors) {
        if (errors != null) {
            if (this.errors == null) {
                this.errors = new ArrayList<WsError>();
            }
            this.errors.addAll(errors);
        }
        return this;
    }

    public ServiceResponse addWarning(WsWarning warning) {
        if (this.warnings == null) {
            this.warnings = new ArrayList<WsWarning>();
        }
        this.warnings.add(warning);
        return this;
    }

    public ServiceResponse addWarnings(List<WsWarning> warnings) {
        if (warnings != null) {
            if (this.warnings == null) {
                this.warnings = new ArrayList<WsWarning>();
            }
            this.warnings.addAll(warnings);
        }
        return this;
    }

    public void setWarnings(List<WsWarning> warnings) {
        this.warnings = warnings;
    }

    public List<WsWarning> getWarnings() {
        return warnings;
    }

    public boolean hasErrors() {
        return errors != null && errors.size() > 0;
    }

    public boolean hasWarnings() {
        return warnings != null && warnings.size() > 0;
    }

    public void setResponse(ServiceResponse response) {
        this.successful = response.isSuccessful();
        this.message = response.getMessage();
        this.errors = response.getErrors();
        this.warnings = response.getWarnings();
    }

    @Override
    public String toString() {
        return "ServiceResponse [successful=" + successful + ", message=" + message + ", errors=" + errors + ", warnings=" + warnings + "]";
    }
}
