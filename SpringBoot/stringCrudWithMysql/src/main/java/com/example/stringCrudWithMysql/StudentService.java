package com.example.stringCrudWithMysql;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService { // this for curd operation
	@Autowired
	StudentRepo studentrepo;

	public List<Student> getAllStudent() {

		List allStudent = new ArrayList<Student>();

		studentrepo.findAll().forEach(s -> allStudent.add(s));
		
		return allStudent;

	}

	// how to insert record

	public void addStudent(Student std) {
		studentrepo.save(std);
	}

	// how to coll id

	public Student getStudentById(int id) {

		return studentrepo.findOne(id);

	}

	public void update(Student std) { // update record

		studentrepo.save(std);
	}

	public void deletStd(int id) {

		studentrepo.delete(id);
	}

}
