package com.in.supplementStore.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.supplementStore.Entities.Address;
import com.in.supplementStore.Repositories.AddressRepository;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    public AddressRepository addressRepository;

    /**
     * Address Management Services
     */

    public Address addAddress(Address address) {
        return addressRepository.save(address);
    }

    public Address getAddressById(Long userId) {
        return addressRepository.findById(userId).orElse(null);
    }

    public List<Address> getUserAddresses(Long userId) {
        return addressRepository.findByUserUserId(userId);
    }

    public Address updateAddress(Address address) {
        return addressRepository.save(address);
    }

    public void deleteAddress(Long addressId) {
        addressRepository.deleteById(addressId);
    }

   /* public void setDefaultAddress(Long userId, Long addressId) {
        // First reset all addresses for this user to non-default
        addressRepository.clearDefaultAddresses(userId);

        // Then set the specified address as default
        addressRepository.setDefaultAddress(addressId);
    }*/
}


