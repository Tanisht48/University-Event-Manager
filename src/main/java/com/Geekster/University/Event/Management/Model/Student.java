package com.Geekster.University.Event.Management.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Student")
public class Student {
    @Id
    private Integer studentId;
    @Pattern(regexp = "^[A-Z][a-z]*$")
    private String firstName;
    @Pattern(regexp = "^[A-Z][a-z]*$")
    private String lastName;

    @Min(value = 18)
    @Max(value = 25)
    private Integer age;

    @Enumerated(EnumType.STRING)
    private Department studentDepartment;

}







/*Student model will have-
StudentId
first name
last name
age
department


department(datatype of variable department should be Enum and not string
  Enum should support department names line ME , ECE , civil , CSE).
You have add validation on age(between 18 -25) ,
first name(first letter should be capital)

*/