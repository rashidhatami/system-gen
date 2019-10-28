package ir.net.nicico.spl.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SystemDefinition implements Serializable {

    private BackendDefinition backendDefinition;
    private FrontendDefinition frontendDefinition;
    private Boolean generateBackend;
    private Boolean generateFrontend;

    public BackendDefinition getBackendDefinition() {
        return backendDefinition;
    }

    public void setBackendDefinition(BackendDefinition backendDefinition) {
        this.backendDefinition = backendDefinition;
    }

    public FrontendDefinition getFrontendDefinition() {
        return frontendDefinition;
    }

    public void setFrontendDefinition(FrontendDefinition frontendDefinition) {
        this.frontendDefinition = frontendDefinition;
    }

    public Boolean getGenerateBackend() {
        return generateBackend;
    }

    public void setGenerateBackend(Boolean generateBackend) {
        this.generateBackend = generateBackend;
    }

    public Boolean getGenerateFrontend() {
        return generateFrontend;
    }

    public void setGenerateFrontend(Boolean generateFrontend) {
        this.generateFrontend = generateFrontend;
    }
}
