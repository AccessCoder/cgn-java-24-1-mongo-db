package de.neuefische.cgnjava241mongodb.controller;

import de.neuefische.cgnjava241mongodb.Student;
import de.neuefische.cgnjava241mongodb.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//wlVOUFIfBRQBqhpP
@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class TestController {

    //Dependency Injection
    private final TestRepository repo;

    @GetMapping
    public List<Student> getAllStudents(){
        return repo.findAll();
    }

    @GetMapping("/find/{age}/{name}")
    public List<Student> findByAgeAndName(@PathVariable int age, @PathVariable String name){
        return repo.findAllByAgeAndName(age, name);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable String id){
        return repo.findById(id)
                .orElseThrow();
    }

    @PostMapping
    public void saveNewStudent(@RequestBody Student student){
        repo.save(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable String id){
        repo.deleteById(id);

    }
}
