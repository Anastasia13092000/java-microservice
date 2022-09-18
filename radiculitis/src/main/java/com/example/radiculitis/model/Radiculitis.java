package com.example.radiculitis.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString

public class Radiculitis {
    private int id;
    private String hospitalName;
    private String spineSegment;
    private String Degree;
    private boolean infection;
    private int patientsNumber;
}
