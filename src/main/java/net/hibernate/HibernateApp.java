package net.hibernate;

import net.hibernate.entity.*;
import net.hibernate.repository.StudentProfileRepository;
import net.hibernate.repository.StudentRepository;
import net.hibernate.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class HibernateApp implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;


	@Autowired
	private StudentProfileRepository studentProfileRepository;

	@Autowired
	private SubjectRepository subjectRepository;

	public static void main(String[] args) {

		SpringApplication.run(HibernateApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("We are ready to do some stuff...");
//
//		Student student = new Student("Busi", "Mva");
//		StudentProfile studentProfile = new StudentProfile("1234500", "Corana", Gender.FEMALE, LocalDate.of(1983, 9, 23));
//		Grade grade  = new Grade("Grade 50");
//
//
//		student.setStudentProfile(studentProfile);
//		studentProfile.setStudent(student);
//
//		grade.getStudents().add(student);
//		student.setGrade(grade);
//
//		studentRepository.save(student);

//		System.out.println(studentRepository.findAll());

		


//		Student student = new Student("Vuyo", "Bathembu");
//		StudentProfile studentProfile = new StudentProfile("1234500", "Willian Street 232", Gender.FEMALE, LocalDate.of(2006, 9, 23));
//
//		student.setStudentProfile(studentProfile);
//		studentProfile.setStudent(student);
//
//		studentRepository.save(student);


//		Student student1 = new Student("Thando", "Nodwengu");
//
//		Subject maths = new Subject("Mathemathics");
//		Subject english = new Subject("English");
//
//		student1.getSubjects().add(maths);
//		student1.getSubjects().add(english);
//
//		maths.getStudents().add(student1);
//		maths.getStudents().add(student1);
//
//		studentRepository.save(student1);

	}
}
