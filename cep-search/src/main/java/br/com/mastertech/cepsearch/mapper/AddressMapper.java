package br.com.mastertech.cepsearch.mapper;

import br.com.mastertech.cepsearch.client.ViaCepResponse;
import br.com.mastertech.cepsearch.model.Address;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {

    public Address toAddress(ViaCepResponse viaCepResponse){
        Address address = new Address();

        address.setPostalCode(viaCepResponse.getCep());
        address.setStreet(viaCepResponse.getLogradouro());
        address.setCity(viaCepResponse.getLocalidade());
        address.setNeighbourhood(viaCepResponse.getBairro());
        address.setState(viaCepResponse.getUf());

        return address;
    }
}
