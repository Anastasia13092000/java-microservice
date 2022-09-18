package com.example.radiculitis.controller;

import com.example.radiculitis.model.Radiculitis;
import com.example.radiculitis.service.RadiculitisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="hospitals/{hospitalName}/Radiculitis")
public class RadiculitisController {
    @Autowired
    private RadiculitisService RadiculitisService;
    @GetMapping(value="/{spineSegment}/{patientsNumber}")
    public ResponseEntity<Radiculitis> getRadiculitis(
            @PathVariable("hospitalName") String hospitalName,
            @PathVariable("spineSegment") String spineSegment,
            @PathVariable("patientsNumber") int patientsNumber) {
        Radiculitis Radiculitis = RadiculitisService.getRadiculitis(hospitalName, spineSegment, patientsNumber);
        return ResponseEntity.ok(Radiculitis);
    }
    @PostMapping
    public ResponseEntity<String> createRadiculitis(
            @PathVariable("hospitalName") String hospitalName,
            @RequestBody Radiculitis request) {
        return ResponseEntity.ok(RadiculitisService.createRadiculitis(request, hospitalName));
    }
}
