package net.hibernate.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student_profiles")
public class StudentProfile {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(name = "phone_number", nullable = false)
   private String phoneNumber;

   @Column(name = "address", nullable = false)
   private String address;

   @Enumerated(EnumType.STRING)
   @Column(name = "gender")
   private Gender gender;

   @Column(name = "date_of_birth")
   private LocalDate dateOfBirth;

   @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "studentProfile")
   private Student student;

   public StudentProfile(String phoneNumber, String address, Gender gender, LocalDate dateOfBirth) {
      super();
      this.phoneNumber = phoneNumber;
      this.address = address;
      this.gender = gender;
      this.dateOfBirth = dateOfBirth;
   }

}
