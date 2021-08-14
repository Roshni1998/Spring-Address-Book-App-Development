/* Address Book Service Layer */
package com.bridgelabz.addressbookservice.service;

import com.bridgelabz.addressbookservice.dto.AddressBookDTO;
import com.bridgelabz.addressbookservice.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService{
    @Override
    public List<AddressBookData> getAddressBookData() {
        List<AddressBookData> contactList = new ArrayList<>();
        contactList.add(new AddressBookData(1, new AddressBookDTO("Raj",
                                    "Malhotra", "Shastri Villa", "9797979797")));
        return contactList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int personId) {
        AddressBookData contact = null;
        contact = new AddressBookData(1, new AddressBookDTO("Avni",
                              "Verma", "Karol Bagh", "9879879879"));
        return contact;
    }

    @Override
    public AddressBookData addNewContact(AddressBookDTO addressBookDTO) {
        AddressBookData contact = null;
        contact = new AddressBookData(1, addressBookDTO);
        return contact;
    }

    @Override
    public AddressBookData updateContact(AddressBookDTO addressBookDTO) {
        AddressBookData contact = null;
        contact = new AddressBookData(1, addressBookDTO);
        return contact;
    }

    @Override
    public void deleteContact(int personId) {

    }
}
