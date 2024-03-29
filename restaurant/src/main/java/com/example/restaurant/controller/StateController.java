package com.example.restaurant.controller;

import com.example.restaurant.model.State;
import com.example.restaurant.service.CountryService;
import com.example.restaurant.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
@CrossOrigin("http://localhost:4200" )

public class StateController {
    private StateService stateService;

    @Autowired
    public StateController(StateService stateService) {
        this.stateService = stateService;
    }

    @GetMapping("states")
    public List<State> getStates()
    {
        return stateService.getAllStates();
    }

    // http://localhost:8080/api/statescode?code={value}
    @GetMapping("/statescode")
    public List<State> getStatesByCode(@RequestParam String code){
        return stateService.getStatesByCountryCode(code);
    }
}
