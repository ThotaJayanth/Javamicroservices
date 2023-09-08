package com.icinbank.proxy;
import com.icinbank.model.ChequebookRequest;
import com.icinbank.response.ChequeResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "online-banking")
public interface ChequebookServiceProxy {

    @PostMapping("/chequebook/request")
    ChequeResponse createRequest(@RequestBody ChequebookRequest chequebook);

    @GetMapping("/chequebook/requests/{account}")
    List<ChequebookRequest> getRequests(@PathVariable("account") long account);
}
