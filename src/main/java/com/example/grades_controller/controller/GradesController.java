package com.example.grades_controller.controller;

import com.example.grades_controller.service.GradesService;
import com.example.grades_controller.util.EndpointsConstant;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GradesController {

    GradesService gradesService;

    @PostMapping(value = EndpointsConstant.GET_GRADES_BY_ID)
    public Flux<GetGradesByIdResponse> getGradesById(
            @Validated @ResponseBody Flux<GetGradesByIdRequest> requests) {
        return gradesService.getGradesById(requests);
    }

    @PostMapping(value = EndpointsConstant.GET_ALL_COURSE_GRADES_FOR_STUDENT_ID)
    public Flux<GetAllGradesForStudentIdResponse> getGradesById(
            @Validated @ResponseBody Flux<GetAllGradesForStudentIdRequest> requests) {
        return gradesService.getGradesById(requests);
    }

}
