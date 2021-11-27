package com.app.com.app.util;

import org.springframework.beans.factory.FactoryBean;

import java.util.Calendar;

public class CalenderFactory implements FactoryBean<Calendar> {

    private Calendar calendarInstance = Calendar.getInstance();

    @Override
    public Calendar getObject() throws Exception {
        return calendarInstance;
    }

    @Override
    public Class<?> getObjectType() {
        return Calendar.class;
    }

    public void addDays(int numDay){
        calendarInstance.add(Calendar.DAY_OF_YEAR,numDay);
    }
}
