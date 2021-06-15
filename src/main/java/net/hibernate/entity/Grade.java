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
@Table(name = "grades")
public class Grade {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(name = "grade_name")
   private String gradeName;

   //ONE GRADE CAN HAVE MANY LEARNERS
   //@OneToMany(cascade = CascadeType.ALL)
   //@JoinColumn(name = "grade_id", referencedColumnName = "id")
   //@OneToMany(mappedBy = "grade")

   @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "grade")
   List<Student> students = new ArrayList<>();


   public Grade(String gradeName) {
      this.gradeName = gradeName;
   }
}
