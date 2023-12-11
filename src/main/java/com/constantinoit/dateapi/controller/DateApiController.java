package com.constantinoit.dateapi.controller;

import com.constantinoit.dateapi.json.CountDaysRequest;
import com.constantinoit.dateapi.json.CountDaysResponse;
import com.constantinoit.dateapi.service.DateApiService;
import com.constantinoit.dateapi.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateApiController {

    @Autowired
    private DateApiService service;

    @GetMapping("/countDays")
    public CountDaysResponse countDays(CountDaysRequest request) {
        CountDaysResponse response = new CountDaysResponse();
        response.setResponse(String.valueOf(service.countDays(DateUtils.toZonedDateTime(request.getStartDate()),
                DateUtils.toZonedDateTime(request.getEndDate()))));
        return response;
    }

    public DateApiService getService() {
        return service;
    }

    public void setService(DateApiService service) {
        this.service = service;
    }

}