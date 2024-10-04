package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.Student;
import repository.StudentRepository;

@Service
public class StudentService {

@Autowired	
StudentRepository repository;	
	
	
public void addStudent(Student student)
{
	
	repository.save(student);
	
	
}
public List<Student> getAllStudents()
{
	return repository.getAll();
	
}
	
}
