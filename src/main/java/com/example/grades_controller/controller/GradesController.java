package com.example.grades_controller.controller;

import com.example.grades_controller.service.GradesService;
import com.example.grades_controller.util.EndpointsConstant;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class GradesController {

    GradesService gradesService;

    @PostMapping(value = EndpointsConstant.GET_GRADES)
    public Flux<GetGradesByIdResponse> getGradesById(
            @Validated @ResponseBody Flux<GetGradesByIdRequest> requests) {
        return gradesService.getGrades(requests);
    }

    @PostMapping(value = EndpointsConstant.GET_GRADES)
    public Flux<GetAllGradesForStudentIdResponse> getGradesById(
            @Validated @ResponseBody Flux<GetAllGradesForStudentIdRequest> requests) {
        return gradesService.getGradesById(requests);
    }

    @PutMapping(value = EndpointsConstant.UPDATE_GRADES_FOR_STUDENT_BY_COURSE_ID)
    public Flux<> updateGrades(@Validated @ResponseBody Flux<> requests) {
        return gradesService.updateGrades(requests);
    }

    @PostMapping(value = EndpointsConstant.ADD_GRADES_FOR_STUDENTS_BY_COURSE_ID)
    public Flux<GetAllGradesForStudentIdResponse> addGradesForStudentById(
            @Validated @ResponseBody Flux<GetAllGradesForStudentIdRequest> requests) {
        return gradesService.addGrades(requests);
    }

    @DeleteMapping(value = EndpointsConstant.DELETE_GRADE_FOR_STUDENT_BY_COURSE_ID)
    public Flux<GetAllGradesForStudentIdResponse> deleteGradesForStudentById(
            @Validated @ResponseBody Flux<GetAllGradesForStudentIdRequest> requests) {
        return gradesService.deleteGrades(requests);
    }

}
