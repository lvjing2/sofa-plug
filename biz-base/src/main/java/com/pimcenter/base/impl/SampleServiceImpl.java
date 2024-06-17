package com.pimcenter.base.impl;

import com.pimcenter.base.facade.SampleService;
import org.springframework.stereotype.Component;

@Component
public class SampleServiceImpl implements SampleService {

    @Override
    public String service() {
        return "A Sample Service";
    }
}
