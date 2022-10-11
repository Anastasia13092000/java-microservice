package com.example.radiculitis.service;

import java.util.Random;
import org.springframework.stereotype.Service;
import com.example.radiculitis.model.Radiculitis;

@Service
public class RadiculitisService {
    public Radiculitis getRadiculitis(String hospitalName, int patientsNumber) {
        Radiculitis radiculitis = new Radiculitis();
        radiculitis.setId(new Random().nextInt(1000));
        radiculitis.setHospitalName(hospitalName);

        String[] segments = {"cervical", "thoracic", "lumbar", "cervical-thoracic", "thoracolumbar", "lumbosacral"};
        radiculitis.setSpineSegment(segments[new Random().nextInt(segments.length)]);

        if (new Random().nextBoolean())
            radiculitis.setPainType("Dull");
        else
            radiculitis.setPainType("Sharp");

        radiculitis.setPainLevel(new Random().nextInt(1,10));
        radiculitis.setSensitivityLossLevel(new Random().nextInt(1,10));
        radiculitis.setMuscleWeaknessLevel(new Random().nextInt(1,10));

        if (new Random().nextInt(100) < 5)
            radiculitis.setInfection(true);
        else
            radiculitis.setInfection(false);

        radiculitis.setPatientsNumber(patientsNumber);
        return radiculitis;
    }

    public String createRadiculitis(Radiculitis radiculitis, String hospitalName){
        String responseMessage = null;
        if(radiculitis != null) {
            radiculitis.setHospitalName(hospitalName);
            responseMessage = String.format("This is post and the object is: %s", radiculitis.toString());
        }
        return responseMessage;
    }

    public Radiculitis updateRadiculitis(Radiculitis radiculitis, String hospitalName, int patientsNumber) {
        //mock find entry by hospitalName, id
        Radiculitis original = new Radiculitis();
        original.setPatientsNumber(patientsNumber);
        original.setId(new Random().nextInt(1000));

        original.setId(radiculitis.getId());
        original.setHospitalName(radiculitis.getHospitalName());
        original.setSpineSegment(radiculitis.getSpineSegment());
        original.setPainType(radiculitis.getPainType());
        original.setPainLevel(radiculitis.getPainLevel());
        original.setSensitivityLossLevel(radiculitis.getSensitivityLossLevel());
        original.setMuscleWeaknessLevel(radiculitis.getMuscleWeaknessLevel());
        original.setInfection(radiculitis.isInfection());

        return original;
    }

    public String deleteRadiculitis(Radiculitis radiculitis, String hospitalName, int patientNumber){
        String responseMessage = null;
        //mock check that entry exists
        if (radiculitis != null) {
            responseMessage = String.format("This is delete and object: { %s } is deleted", radiculitis.toString());
        }
        return responseMessage;
    }

}