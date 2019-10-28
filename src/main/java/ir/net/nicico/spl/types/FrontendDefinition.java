package ir.net.nicico.spl.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FrontendDefinition implements Serializable {

    private String projectName;
    private String projectFarsiName;
    private String targetPath;
    private List<EntityDefinition> entityDefinitionList;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectFarsiName() {
        return projectFarsiName;
    }

    public void setProjectFarsiName(String projectFarsiName) {
        this.projectFarsiName = projectFarsiName;
    }

    public String getTargetPath() {
        return targetPath;
    }

    public void setTargetPath(String targetPath) {
        this.targetPath = targetPath;
    }

    public List<EntityDefinition> getEntityDefinitionList() {
        return entityDefinitionList;
    }

    public void setEntityDefinitionList(List<EntityDefinition> entityDefinitionList) {
        this.entityDefinitionList = entityDefinitionList;
    }
}
