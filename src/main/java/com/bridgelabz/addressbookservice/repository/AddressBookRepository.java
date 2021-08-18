package com.bridgelabz.addressbookservice.repository;

import com.bridgelabz.addressbookservice.model.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressBookRepository extends JpaRepository<AddressBookData, Integer> {
}
