package wild.yellow.tasktrackerapi.api.factories;

import org.springframework.stereotype.Component;
import wild.yellow.tasktrackerapi.api.dto.ProjectDto;
import wild.yellow.tasktrackerapi.store.entities.ProjectEntity;

@Component
public class ProjectDtoFactory {

    public ProjectDto makeProjectDto(ProjectEntity projectEntity) {
        return ProjectDto.builder()
                .id(projectEntity.getId())
                .name(projectEntity.getName())
                .createdAt(projectEntity.getCreatedAt())
                .build();
    }
}
