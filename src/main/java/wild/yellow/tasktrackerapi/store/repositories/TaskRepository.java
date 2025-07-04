package wild.yellow.tasktrackerapi.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import wild.yellow.tasktrackerapi.store.entities.TaskEntity;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
}
