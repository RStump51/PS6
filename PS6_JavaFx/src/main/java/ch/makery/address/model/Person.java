package ch.makery.address.model;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import ch.makery.address.util.LocalDateAdapter;
import domain.PersonDomainModel;

public class Person extends PersonDomainModel {

    public Person() {
        this(null, null, null, (Integer) null, null, null);
    }

    public Person(String firstName, String lastName, String street, int postalCode, String city, Object birthday ) {
        this.setFirstName(firstName);
        this.setLastName(lastName);

        // Some initial dummy data, just for convenient testing.
        this.setStreet(street);
        this.setPostalCode(postalCode);
        this.setCity(city);
        this.setBirthday((LocalDate.of(1996, 1, 16)));
    }

	public StringProperty getFirstNameProp()
	{
		SimpleStringProperty simpleStringProperty = new SimpleStringProperty(firstName);
		return simpleStringProperty;
	}
	public StringProperty getLastNameProperty()
	{
		return new SimpleStringProperty(lastName);
	}
	public StringProperty getStreetProperty()
	{
		return new SimpleStringProperty(street);
	}
	public IntegerProperty getPostalProperty()
	{
		return new SimpleIntegerProperty(postalCode);
	}
	public StringProperty getCityProperty()
	{
		return new SimpleStringProperty(city);
	}
	}

