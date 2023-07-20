package com.gunin.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@ToString
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer studentId;


    private String name;
    private String birthDate;
    private String gender;

    private Integer pinCode;
    private String identityType;
    private String identityNumber;

    private String emailId;
    private String mobileNumber;
    private String twelfthExamRollNum;
    private String examPaperType;
    private String examLanguage;
}
