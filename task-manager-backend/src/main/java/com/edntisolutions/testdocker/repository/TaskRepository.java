package com.edntisolutions.testdocker.repository;

import com.edntisolutions.testdocker.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
