package com.Geekster.University.Event.Management.Repository;

import com.Geekster.University.Event.Management.Model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends CrudRepository<Student,Integer> {
}
