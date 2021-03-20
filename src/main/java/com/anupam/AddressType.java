package com.anupam;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class AddressType {
    @Id @Column(name = "address_type_code")
    int addressTypeCode;
    @Column(name = "address_type_name")
    String addressTypeName;
    @Column(name = "address_type_description")
    String addressTypeDescription;

    public AddressType(int addressTypeCode, String addressTypeName, String addressTypeDescription) {
        this.addressTypeCode = addressTypeCode;
        this.addressTypeName = addressTypeName;
        this.addressTypeDescription = addressTypeDescription;
    }
}
