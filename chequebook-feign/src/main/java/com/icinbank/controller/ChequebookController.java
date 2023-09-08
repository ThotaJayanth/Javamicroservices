package com.icinbank.controller;

import com.icinbank.model.ChequebookRequest;
import com.icinbank.response.ChequeResponse;
import com.icinbank.proxy.ChequebookServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chequebook")
public class ChequebookController {

    @Autowired
    private ChequebookServiceProxy chequebookServiceProxy;

    @PostMapping("/request")
    public ChequeResponse createRequest(@RequestBody ChequebookRequest chequebook) {
        return chequebookServiceProxy.createRequest(chequebook);
    }

    @GetMapping("/requests/{account}")
    public List<ChequebookRequest> getRequests(@PathVariable long account) {
        return chequebookServiceProxy.getRequests(account);
    }
}

