package base;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;

public class PersonTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		LocalDate Date_D = LocalDate.of(1996, 1, 16);
		PersonDomainModel per = new PersonDomainModel();
		per.setFirstName("Russ");
		per.setLastName("Stump");
		per.setStreet("1192 Evan Court");
		per.setCity("West Chester");
		per.setPostalCode(19380);
		per.setBirthday(Date_D);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		PersonDomainModel pers = new PersonDomainModel();	
		PersonDAL.deletePerson(pers.getPersonID());
		pers = PersonDAL.getPerson(pers.getPersonID());
		assertNull("The Person shouldn't have been in the database",pers);	
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void AddPersonTest() {
		PersonDomainModel person = new PersonDomainModel();
		person = PersonDAL.getPerson(person.getPersonID());
		PersonDAL.addPerson(person);
	}
	@Test
	public void DeletePersonTest()
	{
		PersonDomainModel person = new PersonDomainModel();
		person = PersonDAL.getPerson(person.getPersonID());
		PersonDAL.addPerson(person);			
		
		PersonDAL.deletePerson(person.getPersonID());
		person = PersonDAL.getPerson(person.getPersonID());
	}
	@Test
	public void UpdatePersonTest()
	{
		PersonDomainModel person = new PersonDomainModel();
		final String C_LASTNAME = "Stump";
		
		person = PersonDAL.getPerson(person.getPersonID());			
		PersonDAL.addPerson(person);	
		
		person.setLastName(C_LASTNAME);
		PersonDAL.updatePerson(person);
		
		person = PersonDAL.getPerson(person.getPersonID());

		assertTrue("No Name Changing",person.getLastName() == C_LASTNAME);
	}
	}


