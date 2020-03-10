package com.example.stringCrudWithMysql;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Integer> {

	Object findAll = null; // this for curd operation

}
