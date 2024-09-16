package com.example.grades_controller.service;

import com.example.grades_controller.repository.GradesRepository;

public class GradesService {

    GradesRepository gradesRepository;

    public Flux<> getGrades(Flux<> requests) {
        return gradesRepository.findGradesById(requests);
    }

    public Flux<> getGradesById(Flux<> requests) {
        return gradesRepository.findGradesById(requests);
    }
}
