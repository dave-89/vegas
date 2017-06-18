package org.davide.vegas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dave on 17/06/17.
 */
@RestController
public class Controller {

    private final BridgeService bridgeService;

    public Controller(final BridgeService bridgeService) {
        this.bridgeService = bridgeService;
    }


    @RequestMapping(method = RequestMethod.GET, value = "/lol")
    public String helloWorld() {
        return bridgeService.hello();
    }
}
