package com.example.spring_fundamentals.controller;

import com.example.spring_fundamentals.entity.Student;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
//Bu Anatation  Jenerik yani sabit olarak bir URL ile başlamasını istiyorsak bu şekilde tanımlarız
// Aynı zamanda SPRİNG localhost:8080/student dersek direkt olarak bu Controlleri arayacaktır.
public class StudentController {

   private Map<Long, Student> students = new HashMap<>();


   @PostMapping("/")
   public  Student  save(@RequestBody Student student){
       students.put(student.getId(), student);
       return student;
   }

   @GetMapping("/")
    public List<Student> findAll(){
       return students.values().stream().toList();
   }

   //Burada ek olarak GetMapping{id} kullanıldı update işlemi için
    //id Parametrede tanımlandığında @PathVariable tanımladık.
    //Son olarak Map kullandığımız için aynı id ye sahip yani aynı keyE sahip
   // baska bir value olamayacağı için eskisi gider yenisi gelir.
   @PutMapping("/{id}")
    public Student update(@PathVariable long id, @RequestBody Student student){
       students.put(id, new Student(id, student.getFirstName(), student.getGrade(), student.isSuccessfull()));
       return students.get(id);
   }

   @DeleteMapping
    public Student delete(@PathVariable long id) {
       Student student = students.get(id);
       students.remove(student);
       return student;
   }

}
