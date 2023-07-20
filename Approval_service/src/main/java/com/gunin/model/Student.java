package com.gunin.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.annotation.Generated;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="Pending_applications")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer studentId;

    @Column(name = "name",unique = true,nullable = false)
    private String name;
    private String birthDate;
    private String gender;

    private Integer pinCode;
    private String identityType;
    private String identityNumber;

    private String emailId;
    private String mobileNumber;
    private String ExamPaperType;
    private String ExamLanguage;
    private String twelfthExamRollNum;

}
