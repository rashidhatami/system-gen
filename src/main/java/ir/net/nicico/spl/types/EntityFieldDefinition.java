package ir.net.nicico.spl.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EntityFieldDefinition implements Serializable {

    private GlobalizedName name;
    private String farsiName;
    private FieldType fieldType;
    private Boolean nullable;
    private Integer length;
    private Boolean visible;
    private Boolean readOnly;
    private String validationRegex;

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

    public FieldType getFieldType() {
        return fieldType;
    }

    public void setFieldType(FieldType fieldType) {
        this.fieldType = fieldType;
    }

    public Boolean getNullable() {
        return nullable;
    }

    public void setNullable(Boolean nullable) {
        this.nullable = nullable;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public String getValidationRegex() {
        return validationRegex;
    }

    public void setValidationRegex(String validationRegex) {
        this.validationRegex = validationRegex;
    }
}
