package wild.yellow.tasktrackerapi.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import wild.yellow.tasktrackerapi.store.entities.TaskStateEntity;

public interface TaskStateRepository extends JpaRepository<TaskStateEntity, Long> {
}
