package com.javatpoint;  
import org.springframework.data.repository.CrudRepository;  
public interface UserRepository extends CrudRepository<UserRecord, String> {  
	
}
