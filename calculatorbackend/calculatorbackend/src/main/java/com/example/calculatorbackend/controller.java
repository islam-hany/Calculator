package com.example.calculatorbackend;

import com.example.calculatorbackend.component.expression;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/calculate")
public class controller {

    @PostMapping("/expression")
    @ResponseBody
    float expressionHandler(@RequestBody expression exp)
    {
        return exp.getResult();
    }
}
