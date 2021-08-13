package com.nice.bankms.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("central-bank")
public class BankController {

    @GetMapping("regional-info/evaluate")
    public ResponseEntity<?> evaluateCity(@RequestParam(value = "city", required = true) String city){
        System.out.println(city);
        int sum = 0;
        for (int i=0; i<city.length(); i++){
            int asciiValue = city.charAt(i);
            sum+=asciiValue;
        }
        return ResponseEntity.ok().body(sum);
    }

    @GetMapping("regional-info/evaluate/{city}")
    public ResponseEntity<?> evaluateCity2(@PathVariable String city){
        int sum = 0;
        for (int i=0; i<city.length(); i++){
            int asciiValue = city.charAt(i);
            sum+=asciiValue;
        }
        return ResponseEntity.ok().body(sum);
    }

    @GetMapping("wealth-threshold")
    public ResponseEntity<?> evaluateCity(){
        return ResponseEntity.ok().body(500000);
    }
}
