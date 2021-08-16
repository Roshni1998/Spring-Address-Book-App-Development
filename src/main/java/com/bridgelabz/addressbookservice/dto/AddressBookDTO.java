/* AddressBookDTO.java */
package com.bridgelabz.addressbookservice.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class AddressBookDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Invalid First Name")
    public String firstName;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Invalid Last Name")
    public String lastName;
    @NotNull(message = "Address Field cannot be empty")
    public String address;
    @Size(max = 10, min = 10, message = "Please Enter a valid phone number")
    public String mobileNo;

    public AddressBookDTO(String firstName, String lastName, String address, String mobileNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "AddressBookDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                '}';
    }
}
