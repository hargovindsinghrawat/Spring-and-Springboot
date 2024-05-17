package com.learning.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learning.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository repository;

//	@Autowired
//	private CourseJpaRepository repository;

	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {

		repository.save(new Course(1, "Learn Spring Data JPA", "youtube"));
		repository.save(new Course(2, "Learn Java", "youtube"));
		repository.save(new Course(3, "Learn Spring", "Ranga"));
		repository.save(new Course(4, "Learn Springboot", "youtube"));

		repository.deleteById(2l);

		System.out.println(repository.findById(1l));
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("Ranga"));
		System.out.println(repository.findByAuthor(""));
	}

}
