package wild.yellow.tasktrackerapi.api.factories;

import org.springframework.stereotype.Component;
import wild.yellow.tasktrackerapi.api.dto.TaskDto;
import wild.yellow.tasktrackerapi.store.entities.TaskEntity;

@Component
public class TaskDtoFactory {

    public TaskDto makeTaskDto(TaskEntity taskEntity) {
        return TaskDto.builder()
                .id(taskEntity.getId())
                .name(taskEntity.getName())
                .createdAt(taskEntity.getCreatedAt())
                .description(taskEntity.getDescription())
                .build();
    }
}
