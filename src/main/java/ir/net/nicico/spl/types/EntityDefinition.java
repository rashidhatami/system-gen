package ir.net.nicico.spl.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EntityDefinition implements Serializable {

    private GlobalizedName name;
    private String farsiName;
    private String label;
    private List<EntityFieldDefinition> entityFieldDefinitionList;
    private Boolean hasForm;

    public GlobalizedName getName() {
        return name;
    }

    public void setName(GlobalizedName name) {
        this.name = name;
    }

    public String getFarsiName() {
        return farsiName;
    }

    public void setFarsiName(String farsiName) {
        this.farsiName = farsiName;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<EntityFieldDefinition> getEntityFieldDefinitionList() {
        return entityFieldDefinitionList;
    }

    public void setEntityFieldDefinitionList(List<EntityFieldDefinition> entityFieldDefinitionList) {
        this.entityFieldDefinitionList = entityFieldDefinitionList;
    }

    public Boolean getHasForm() {
        return hasForm;
    }

    public void setHasForm(Boolean hasForm) {
        this.hasForm = hasForm;
    }
}
