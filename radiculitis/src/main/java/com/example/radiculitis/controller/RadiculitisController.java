package com.example.radiculitis.controller;

import com.example.radiculitis.model.Radiculitis;
import com.example.radiculitis.service.RadiculitisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="hospitals/{hospitalName}/radiculitis")
public class RadiculitisController {
    @Autowired
    private RadiculitisService RadiculitisService;
    @GetMapping(value="/{patientsNumber}")
    public ResponseEntity<Radiculitis> getRadiculitis(
            @PathVariable("hospitalName") String hospitalName,
            @PathVariable("patientsNumber") int patientsNumber) {
        Radiculitis Radiculitis = RadiculitisService.getRadiculitis(hospitalName, patientsNumber);
        return ResponseEntity.ok(Radiculitis);
    }
    @PostMapping
    public ResponseEntity<String> createRadiculitis(
            @PathVariable("hospitalName") String hospitalName,
            @RequestBody Radiculitis request) {
        return ResponseEntity.ok(RadiculitisService.createRadiculitis(request, hospitalName));
    }

    @PutMapping(value="/{patientsNumber}")
    public ResponseEntity<Radiculitis> updateRadiculitis(
            @PathVariable("hospitalName") String hospitalName,
            @PathVariable("patientsNumber") int patientsNumber,
            @RequestBody Radiculitis request) {
        Radiculitis Radiculitis = RadiculitisService.updateRadiculitis(request, hospitalName, patientsNumber);
        return ResponseEntity.ok(Radiculitis);
    }

    @DeleteMapping(value="/{patientsNumber}")
    public ResponseEntity<String> deleteRadiculitis(
            @PathVariable("hospitalName") String hospitalName,
            @PathVariable("patientsNumber") int patientsNumber,
            @RequestBody Radiculitis request) {
        String response = RadiculitisService.deleteRadiculitis(request, hospitalName, patientsNumber);
        return ResponseEntity.ok(response);
    }
}
