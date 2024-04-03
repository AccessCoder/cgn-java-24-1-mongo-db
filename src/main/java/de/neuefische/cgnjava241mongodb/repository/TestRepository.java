package de.neuefische.cgnjava241mongodb.repository;

import de.neuefische.cgnjava241mongodb.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TestRepository extends MongoRepository<Student, String> {

    List<Student> findAllByAgeAndName(int age, String name);
}
