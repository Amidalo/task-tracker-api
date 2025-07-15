package wild.yellow.tasktrackerapi.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import wild.yellow.tasktrackerapi.store.entities.ProjectEntity;

import java.util.Optional;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {

    Optional<ProjectEntity> findByName(String projectName);
}
