package ir.net.nicico.spl.rest;

import ir.net.nicico.spl.types.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
@RequestMapping("/generate")
public class GeneratorRestService {

    @GetMapping("/pure-structure-json")
    public SystemDefinition createPureStructureJson() {
        SystemDefinition systemDefinition = new SystemDefinition();
        systemDefinition.setBackendDefinition(new BackendDefinition());
        systemDefinition.getBackendDefinition().setEntityDefinitionList(new ArrayList<>());
        systemDefinition.getBackendDefinition().getEntityDefinitionList().add(new EntityDefinition());
        systemDefinition.getBackendDefinition().getEntityDefinitionList().get(0).setEntityFieldDefinitionList(new ArrayList<>());
        systemDefinition.getBackendDefinition().getEntityDefinitionList().get(0).getEntityFieldDefinitionList().add(new EntityFieldDefinition());
        systemDefinition.getBackendDefinition().getEntityDefinitionList().get(0).getEntityFieldDefinitionList().get(0).setName(new GlobalizedName());
        systemDefinition.getBackendDefinition().getEntityDefinitionList().get(0).getEntityFieldDefinitionList().get(0).getName().setNames(new HashMap<>());
        systemDefinition.getBackendDefinition().getEntityDefinitionList().get(0).getEntityFieldDefinitionList().get(0).getName().getNames().put("fa", "نام");
        systemDefinition.getBackendDefinition().getEntityDefinitionList().get(0).getEntityFieldDefinitionList().get(0).setFieldType(new FieldType());
        systemDefinition.getBackendDefinition().getEntityDefinitionList().get(0).getEntityFieldDefinitionList().add(new EntityFieldDefinition());
        systemDefinition.getBackendDefinition().setMavenConfig(new MavenConfig());
        systemDefinition.getBackendDefinition().setSecurityConfig(new SecurityConfig());

        systemDefinition.setFrontendDefinition(new FrontendDefinition());
        systemDefinition.getFrontendDefinition().setEntityDefinitionList(new ArrayList<>());
        systemDefinition.getFrontendDefinition().getEntityDefinitionList().add(new EntityDefinition());
        systemDefinition.getFrontendDefinition().getEntityDefinitionList().get(0).setEntityFieldDefinitionList(new ArrayList<>());
        systemDefinition.getFrontendDefinition().getEntityDefinitionList().get(0).getEntityFieldDefinitionList().add(new EntityFieldDefinition());

        return systemDefinition;
    }


}
