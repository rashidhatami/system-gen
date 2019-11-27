package ir.net.nicico.spl.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OAuthPermissionWrapper implements Serializable {

    private List<OAuthPermission> list = new ArrayList<>();

    public List<OAuthPermission> getList() {
        return list;
    }

    public void setList(List<OAuthPermission> list) {
        this.list = list;
    }
}
