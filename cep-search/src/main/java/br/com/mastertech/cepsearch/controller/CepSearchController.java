package br.com.mastertech.cepsearch.controller;

import br.com.mastertech.cepsearch.mapper.AddressMapper;
import br.com.mastertech.cepsearch.model.Address;
import br.com.mastertech.cepsearch.service.CepSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CepSearchController {

    @Autowired
    private CepSearchService cepSearchService;

    @Autowired
    private AddressMapper addressMapper;

    @GetMapping("/cep/{cep}")
    public Address getAddressByCep(@PathVariable String cep){
        return addressMapper.toAddress(cepSearchService.getAddress(cep));
    }
}
