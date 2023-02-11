package com.stock.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO You need to change the CORS policy on the server-side to allow the browser to make cross-origin requests to the API. (Response from OpenAI)
 * The type of the response is 'opaque' which is a security issue
 **/
@RestController
@RequestMapping("stock-prediction")
public class StockPredictionsController {
    @GetMapping
    public ResponseEntity<String> getStockPrediction() {
        return ResponseEntity.ok("A string");
    }
}
