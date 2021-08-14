/* IAddressBookService.java */
package com.bridgelabz.addressbookservice.service;

import com.bridgelabz.addressbookservice.dto.AddressBookDTO;
import com.bridgelabz.addressbookservice.model.AddressBookData;

import java.util.List;

public interface IAddressBookService {
    List<AddressBookData> getAddressBookData();

    AddressBookData getAddressBookDataById(int personId);

    AddressBookData addNewContact(AddressBookDTO addressBookDTO);

    AddressBookData updateContact(int personId, AddressBookDTO addressBookDTO);

    void deleteContact(int personId);
}
