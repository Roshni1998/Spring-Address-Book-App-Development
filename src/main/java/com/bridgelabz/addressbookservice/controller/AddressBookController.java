package com.bridgelabz.addressbookservice.controller;

/*
* @author ROSHNI MALI
* @version 0.0.1-SNAPSHOT
* @since 14 August 2021
* AddressBookController
* */

import com.bridgelabz.addressbookservice.dto.AddressBookDTO;
import com.bridgelabz.addressbookservice.dto.ResponseDTO;
import com.bridgelabz.addressbookservice.model.AddressBookData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {

    /*
    * Purpose: To get all the contact details from the address book
    * @return returns ResponseEntity which is holding ResponseDTO and HttpStatus
    * */
    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getAddressBookData() {
        AddressBookData personData = null;
        personData = new AddressBookData(1, new AddressBookDTO
                     ("Roshni", "Mali", "Malviya Nagar", "9898989898"));
        ResponseDTO responseDTO = new ResponseDTO("Get Call Successful", personData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    /*
     * Purpose: To get the contact details from the address book using its personId
     * @return returns ResponseEntity which is holding ResponseDTO and HttpStatus
     * */
    @GetMapping("/get/{personId}")
    public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("personId") int personId) {
        AddressBookData personData = null;
        personData = new AddressBookData(1, new AddressBookDTO
                ("Rohit", "Sharma", "Shastri Nagar", "9898989898"));
        ResponseDTO responseDTO = new ResponseDTO("Get Call For ID Successful", personData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    /*
     * Purpose: To add new contact details to the address book
     * @return returns ResponseEntity which is holding ResponseDTO and HttpStatus
     * */
    @PostMapping("/addnewcontact")
    public ResponseEntity<ResponseDTO> addNewContact(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData personData = null;
        personData = new AddressBookData(1, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("New Contact Added Sucessfully", personData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    /*
     * Purpose: To update existing contact details to the address book
     * @return returns ResponseEntity which is holding ResponseDTO and HttpStatus
     * */
    @PutMapping("/updatecontact")
    public ResponseEntity<ResponseDTO> updateContact(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData personData = null;
        personData = new AddressBookData(1, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Contact Updated Sucessfully", personData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    /*
     * Purpose: To update existing contact details to the address book
     * @return returns ResponseEntity which is holding ResponseDTO and HttpStatus
     * */
    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<ResponseDTO> deleteContact(@PathVariable("personId") int personId) {
        ResponseDTO responseDTO = new ResponseDTO("Deleted Contact Sucessfully", "Deleted Id: "+ personId);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
}
