package cz.burj.jpa.pattern;

import org.springframework.data.repository.CrudRepository;

import cz.burj.jpa.pattern.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {



}
