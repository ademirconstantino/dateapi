package com.constantinoit.dateapi.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DateUtils {

    private static Logger LOG = Logger.getLogger(DateUtils.class.getName());
    private static SimpleDateFormat dtFormat = new SimpleDateFormat("dd/MM/yyyy");

    public static ZonedDateTime toZonedDateTime(String date) {
        try {
            ZonedDateTime from = ZonedDateTime.from(dtFormat.parse(date).
                    toInstant().atZone(ZoneId.systemDefault()));
            return from;
        } catch (ParseException ex) {
            LOG.log(Level.SEVERE, ex.getLocalizedMessage());
        }

        return null;
    }

}
