package org.davide.vegas.controller;

import org.springframework.stereotype.Service;

/**
 * Created by dave on 17/06/17.
 */
@Service
public class BridgeServiceImpl implements BridgeService {

    private native String helloFromC();

    @Override
    public String hello() {
        return helloFromC();
    }

    static {
        System.loadLibrary("BridgeServiceImpl");
    }
}
