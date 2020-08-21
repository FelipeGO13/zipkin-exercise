package br.com.mastertech.cepsearch.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "cep", url = "https://viacep.com.br/")
public interface ViaCepClient {

    @GetMapping("/ws/{cep}/json")
    ViaCepResponse getAddressByCep(@PathVariable String cep);
}
