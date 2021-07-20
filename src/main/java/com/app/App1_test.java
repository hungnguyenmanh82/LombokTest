package com.app;
import com.model.Student;
import com.model.User;

import lombok.extern.log4j.Log4j2;

/**
 * Step1: add lombok pom.xml
 * Step2: click maven lib => lombok.jar => run Java App 
 * Step3: chỉ định folder chứa Eclipse cho Lombok app
 * Step4: them 2 dòng code sau vào cuối file eclipse.ini:
 * 				-Xbootclasspath/a:lombok.jar
 * 				-javaagent:lombok.jar
 * Step5: sau đó thi restart lại eclipse,  rebuild Maven là ok.
 * 
 * lombok dựa vào @annotation để auto gen class có chứa setter/getter/constructor/log (log4j2,slf4j...)/.toString()
 */
/**
 * dùng Lombok có nhược điểm là khi debug, hoặc muốn add thêm log vào getter/setter/constructor để debug sẽ ko làm đc
 * Giải pháp thay đế: là dùng Eclipse gencode, Eclipse Template (snippet) để sinh code tự động cho log4j2
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
