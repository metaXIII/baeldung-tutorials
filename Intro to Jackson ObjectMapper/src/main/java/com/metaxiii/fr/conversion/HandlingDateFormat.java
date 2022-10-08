package com.metaxiii.fr.conversion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.metaxiii.fr.model.Car;
import com.metaxiii.fr.model.Request;
import lombok.extern.slf4j.Slf4j;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
public class HandlingDateFormat {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm a z");
        objectMapper.setDateFormat(df);
        Request request = new Request();
        request.setCar(new Car("green", "twingo"));
        request.setDatePurcharsed(new Date());
        String carAsString = objectMapper.writeValueAsString(request);
        log.info(carAsString);
    }
}