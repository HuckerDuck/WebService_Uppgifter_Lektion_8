package webservice_uppgifter_lektion_8.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import webservice_uppgifter_lektion_8.Model.Student;

import java.util.Optional;

interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findById(Long id);
}
