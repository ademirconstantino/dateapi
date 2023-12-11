package com.constantinoit.dateapi.service;

import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

@Service
public class DateApiService {

    public Long countDays(ZonedDateTime start, ZonedDateTime end) {
        return ChronoUnit.DAYS.between(start, end);
    }

}
