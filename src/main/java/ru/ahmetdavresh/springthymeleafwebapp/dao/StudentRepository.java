package ru.ahmetdavresh.springthymeleafwebapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ahmetdavresh.springthymeleafwebapp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}