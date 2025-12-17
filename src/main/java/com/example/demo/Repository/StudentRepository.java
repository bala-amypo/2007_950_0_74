package com.example.demo.repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.jpa.repository;
import org.springframework.sterotype.repository;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{
    
}