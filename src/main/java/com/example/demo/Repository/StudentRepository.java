package com.example.demo.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.jpa.repository;
import org.springframework.sterotype.repository;
@Repository
public interface StudentRepository extends JpaRepository<StudentEntity>.Integer{
    
}