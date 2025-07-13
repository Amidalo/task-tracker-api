package wild.yellow.tasktrackerapi.api.factories;

import org.springframework.stereotype.Component;
import wild.yellow.tasktrackerapi.api.dto.TaskStateDto;
import wild.yellow.tasktrackerapi.store.entities.TaskStateEntity;

@Component
public class TaskStateDtoFactory {

    public TaskStateDto makeTaskStateDto(TaskStateEntity taskStateEntity) {
        return TaskStateDto.builder()
                .id(taskStateEntity.getId())
                .name(taskStateEntity.getName())
                .createdAt(taskStateEntity.getCreatedAt())
                .ordinal(taskStateEntity.getOrdinal())
                .build();
    }
}
