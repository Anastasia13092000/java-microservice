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
    private int patientsNumber;

    private String spineSegment; // cervical, thoracic, lumbar, cervical-thoracic, thoracolumbar, lumbosacral
    private String painType; // sharp, dull
    private int painLevel; // 1 to 10
    private int sensitivityLossLevel; // 1 to 10
    private int muscleWeaknessLevel; // 1 to 10
    private boolean infection;

}
