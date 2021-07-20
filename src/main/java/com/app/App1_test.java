package com.app;



import com.model.Student;
import com.model.User;

import lombok.extern.log4j.Log4j2;

/**
 *Lombok setter/getter thì sẽ ko đặt log vào để debug đc => ko nên
 */

@Log4j2
public class App1_test {
	
	public static void main(String[] args) {
		User user = new User(123L,"hung","nguyen manh", 12);
		
		log.debug(user.toString());
		
		//@Equal
		User user2 = new User(123L,"hung","nguyen manh", 12);
		
		if(user2.equals(user)) {
			log.debug("user2 = user");
		}else {
			log.debug("user2 != user");
		}
		//======================================================
		Student student = new Student("Hungbeo",12);
		
		log.debug(student.toString());
		
		//============================================

	}

}
