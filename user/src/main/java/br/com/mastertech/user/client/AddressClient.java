package br.com.mastertech.user.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="cepsearch")
public interface AddressClient {

    @GetMapping("/cep/{cep}")
    Address getAddressByCep(@PathVariable String cep);
}
