package com.jenkins_web_api.jenkins_rest_api.controller;


import com.jenkins_web_api.jenkins_rest_api.model.DataModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/data")
public class DataContoller {

    @GetMapping("/")
    public ResponseEntity<List<DataModel>> getData(){

          List<DataModel> dataModelList = Arrays.asList(
        new DataModel(1,"dataname1","data coming from jpos"),
        new DataModel(2,"dataName2","data coming from jpos pipeline two"),
        new DataModel(3,"dataName3","data coming from jpos pipeline three"),
        new DataModel(4,"dataName4","data coming from jpos pipeline four"),
        new DataModel(5,"dataName5","data coming from jpos pipeline five"));
        return ResponseEntity.ok().body(dataModelList);
    }
}
