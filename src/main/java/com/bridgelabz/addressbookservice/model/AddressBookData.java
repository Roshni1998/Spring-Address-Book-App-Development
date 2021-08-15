package com.bridgelabz.addressbookservice.model;

import com.bridgelabz.addressbookservice.dto.AddressBookDTO;
import lombok.Data;

public @Data class AddressBookData {
    private int personId;
    private String firstName;
    private String lastName;
    private String address;
    private String mobileNo;

    public AddressBookData(int personId, AddressBookDTO addressBookDTO) {
        this.personId = personId;
        this.firstName = addressBookDTO.firstName;
        this.lastName = addressBookDTO.lastName;
        this.address = addressBookDTO.address;
        this.mobileNo = addressBookDTO.mobileNo;
    }

    public AddressBookData() {
    }
}
