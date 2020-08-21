package br.com.mastertech.cepsearch.service;

import br.com.mastertech.cepsearch.client.ViaCepClient;
import br.com.mastertech.cepsearch.client.ViaCepResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.cloud.sleuth.annotation.SpanTag;
import org.springframework.stereotype.Service;

@Service
public class CepSearchService {

    @Autowired
    public ViaCepClient viaCepClient;

    @NewSpan("get-address")
    public ViaCepResponse getAddress(@SpanTag("cep") String cep){
        return viaCepClient.getAddressByCep(cep);
    }
}
