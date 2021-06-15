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
@Table(name = "subjects")
public class Subject {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(name = "subject_name")
   private String subjectName;

   @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "subjects")
   private List<Student> students = new ArrayList<>();

   public Subject(String subjectName) {
      this.subjectName = subjectName;
   }
}
