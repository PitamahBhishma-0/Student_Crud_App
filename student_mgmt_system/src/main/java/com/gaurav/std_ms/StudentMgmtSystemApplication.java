package com.gaurav.std_ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.gaurav.std_ms.entity.Student;
import com.gaurav.std_ms.repository.StudentRepo;
@SuppressWarnings("unused")
@SpringBootApplication
public class StudentMgmtSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentMgmtSystemApplication.class, args);
	}
	@Autowired
	StudentRepo studentRepo;
    
	@Override
	public void run(String... args) throws Exception {
//			Student student1=new Student("Gaurav","Basyal","laurav@gmail.com","Kathmandu");
//			studentRepo.save(student1);
//			
//			Student student2=new Student("Saurav","Basyal","maurav@gmail.com","Sydney");
//			studentRepo.save(student2);
//			
//			Student student3=new Student("Ramesh","Basyal","namesh@gmail.com","Baneshwor");
//			studentRepo.save(student3);
//					
										
		
	}

}
