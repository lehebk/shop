package book.shop.Entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private String country;
    private String city;
    private int zipcode;
}
