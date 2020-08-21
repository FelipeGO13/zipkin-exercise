package br.com.mastertech.cepsearch.service;

import br.com.mastertech.cepsearch.client.ViaCepClient;
import br.com.mastertech.cepsearch.client.ViaCepResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CepSearchService {

    @Autowired
    public ViaCepClient viaCepClient;

    public ViaCepResponse getAddress(String cep){
        return viaCepClient.getAddressByCep(cep);
    }
}
