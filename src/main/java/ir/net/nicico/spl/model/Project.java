package ir.net.nicico.spl.model;

import com.aef3.data.api.DomainEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;


/* Generated By Nicico System Generator ( Powered by Dr.Adldoost :D ) */

@Entity
@Table(name = "project")
public class Project implements DomainEntity {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "jon_message", columnDefinition = "CLOB NOT NULL")
    @Lob
    private String jonMessage;

    @Column(name = "generation_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date generationDate;

    @Column(name = "backend_generation_path", nullable = false)
    private String backendGenerationPath;

    @Column(name = "frontend_generation_path", nullable = false)
    private String frontendGenerationPath;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
       this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
       this.name = name;
    }


    public String getJonMessage() {
        return jonMessage;
    }

    public void setJonMessage(String jonMessage) {
       this.jonMessage = jonMessage;
    }


    public Date getGenerationDate() {
        return generationDate;
    }

    public void setGenerationDate(Date generationDate) {
       this.generationDate = generationDate;
    }


    public String getBackendGenerationPath() {
        return backendGenerationPath;
    }

    public void setBackendGenerationPath(String backendGenerationPath) {
       this.backendGenerationPath = backendGenerationPath;
    }


    public String getFrontendGenerationPath() {
        return frontendGenerationPath;
    }

    public void setFrontendGenerationPath(String frontendGenerationPath) {
       this.frontendGenerationPath = frontendGenerationPath;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Project)) return false;
        Project project = (Project) o;
        return Objects.equals(id, project.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                '}';
    }
}
