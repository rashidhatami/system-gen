package ir.net.nicico.spl.service;

import com.aef3.data.api.GenericEntityDAO;
import ir.net.nicico.spl.dao.ProjectDao;
import ir.net.nicico.spl.dto.ProjectDto;
import ir.net.nicico.spl.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService extends GeneralServiceImpl<ProjectDto, Project, Long> {


    private final ProjectDao projectDao;

    @Autowired
    public ProjectService(ProjectDao projectDao) {
        this.projectDao = projectDao;
    }

    @Override
    protected GenericEntityDAO getDAO() {
        return projectDao;
    }

    @Override
    public ProjectDto getDtoInstance() {
        return new ProjectDto();
    }
}
