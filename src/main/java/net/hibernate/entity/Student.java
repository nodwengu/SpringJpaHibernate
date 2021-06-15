package net.hibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "students")
public class Student {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;

   @Column(name = "name", nullable = false)
   private String name;

   @Column(name = "surname", nullable = false)
   private String surname;

   @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
   @JoinTable(name = "student_subjects",
           joinColumns = {@JoinColumn(name = "student_id")},
           inverseJoinColumns = {@JoinColumn(name = "subject_id")} )
   private List<Subject> subjects = new ArrayList<>();

   @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
   @JoinColumn(name = "sp_id")
   private StudentProfile studentProfile;

   @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
   @JoinColumn(name = "grade_id")
   private Grade grade;

   public Student(String name, String surname) {
      this.name = name;
      this.surname = surname;
   }

//   public static void main(String ...agrs) {
//      Student student = new Student("Thando", "Nodwengu");
//      System.out.println(student.getName());
//      System.out.println(student.getSurname());
//   }

}
