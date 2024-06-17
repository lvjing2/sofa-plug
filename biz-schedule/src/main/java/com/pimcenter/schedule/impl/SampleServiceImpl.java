package com.pimcenter.schedule.impl;


import com.pimcenter.schedule.facade.SampleService;
import org.springframework.stereotype.Component;

@Component
public class SampleServiceImpl implements SampleService {

    @Override
    public String service() {
        return "A Sample Service";
    }
}
