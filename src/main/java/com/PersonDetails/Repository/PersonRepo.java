package com.PersonDetails.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.PersonDetails.model.Person;
@Repository
public interface PersonRepo extends MongoRepository<Person, String>{
	   public Person findByFirstName(String firstName);
	   public List<Person> findByAge(int age);
}
