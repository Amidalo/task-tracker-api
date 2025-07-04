package wild.yellow.tasktrackerapi.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import wild.yellow.tasktrackerapi.store.entities.ProjectEntity;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {
}
