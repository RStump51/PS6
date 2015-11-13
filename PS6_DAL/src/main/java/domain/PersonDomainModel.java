package domain;


import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import util.LocalDateAdapter;

public class PersonDomainModel {

    protected  String firstName;
    protected  String lastName;
    protected  String street;
    protected  Integer postalCode;
    protected  String city;
    protected  LocalDate birthday;
    protected UUID PersonID;

    public UUID getPersonID() {
		return PersonID;
	}

	public void setPersonID(UUID personID) {
		PersonID = personID;
	}

	public void setBirthday(LocalDate localDate) {
		this.birthday = localDate;
	}

	/**
     * Default constructor.
     */


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String firstNameProperty() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = (lastName);
    }

    public String lastNameProperty() {
        return lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = (street);
    }

    public String streetProperty() {
        return street;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = (postalCode);
    }

    public Integer postalCodeProperty() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String cityProperty() {
        return city;
    }

    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public LocalDate getBirthday() {
        return birthday;
    }

    public LocalDate birthdayProperty() {
        return birthday;
    }
}