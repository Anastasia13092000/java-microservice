package com.example.radiculitis.service;

import java.util.Random;
import org.springframework.stereotype.Service;
import com.example.radiculitis.model.Radiculitis;

@Service
public class RadiculitisService {
    public Radiculitis getRadiculitis(String hospitalName, String spineSegment, int patientsNumber) {
        Radiculitis Radiculitis = new Radiculitis();
        Radiculitis.setId(new Random().nextInt(1000));
        Radiculitis.setHospitalName(hospitalName);
        Radiculitis.setSpineSegment(spineSegment);
        Radiculitis.setDegree("Hard");
        Radiculitis.setInfection(false);
        Radiculitis.setPatientsNumber(patientsNumber);
        return Radiculitis;
    }

    public String createRadiculitis(Radiculitis Radiculitis, String hospitalName){
        String responseMessage = null;
        if(Radiculitis != null) {
            Radiculitis.setHospitalName(hospitalName);
            responseMessage = String.format("This is the post and the object is: %s", Radiculitis.toString());
        }
        return responseMessage;
    }

}