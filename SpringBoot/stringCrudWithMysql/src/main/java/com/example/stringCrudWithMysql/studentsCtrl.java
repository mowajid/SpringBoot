package com.example.stringCrudWithMysql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("example/v1/students") // localhost:8080/example/v1/students
public class studentsCtrl { // this for curd operation
	@Autowired
	StudentService studentService;

	@RequestMapping(value="/allStudents" , method=RequestMethod.GET)
	public List<Student> students() {
		return studentService.getAllStudent();
	}

	@RequestMapping(value = "/addStudenst", method = RequestMethod.POST) // insert record start here
	public void addStudent(@RequestBody Student std) {
		studentService.addStudent(std);
	}

	@RequestMapping(value = "find/{id}", method = RequestMethod.GET) // http://localhost:8080/example/v1/students/101
	public Student getStudent(@PathVariable("id") int id) {
		return this.studentService.getStudentById(id);
	}

	@RequestMapping(value = "update/{id}", method = RequestMethod.PUT) // update record
	public void updatetStudent(@PathVariable("id") int id, @RequestBody Student std) {
	 this.studentService.update(std);
	}

	@RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE) // update record
	public void deletStudent(@PathVariable("id") int id) {
		this.studentService.deletStd(id);
	}

}
