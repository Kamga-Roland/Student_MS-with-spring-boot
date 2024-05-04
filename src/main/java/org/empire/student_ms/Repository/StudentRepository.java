package org.empire.student_ms.Repository;

import org.empire.student_ms.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
