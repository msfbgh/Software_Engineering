//Author Name: Marian Farah
//Date:  Sunday, April 10, 2022
//Course ID: CS-320-T4517 

//Description: This is the contact service class.

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
public class ContactService {
	private String uniqueId;
	private List<Contact> contactList = new ArrayList<>();
	
	{
	uniqueId = UUID.randomUUID().toString().substring(
	0, Math.min(toString().length(), 10));
	}
	public void newContact() {
	Contact contact = new Contact(newId());
	contactList.add(contact);
	}
	public void newContact(String firstname) {
	Contact contact = new Contact(newId(), firstname);
	contactList.add(contact);
	}
	public void newContact(String firstname, String lastname) {
	Contact contact = new Contact(newId(), firstname, lastname);
	contactList.add(contact);
	}
	public void newContact(String firstname, String lastname, String phonenumber) {
	Contact contact =
	new Contact(newId(), firstname, lastname, phonenumber);
	contactList.add(contact);
	}
	public void newContact(String firstname, String lastname, String phonenumber, String address) {
	Contact contact =
	new Contact(newId(), firstname, lastname, phonenumber, address);
	contactList.add(contact);
	}
	public void deleteContact(String id) throws Exception {
	contactList.remove(searchForContact(id));
	}
	public void updateFirstName(String id, String firstName) throws Exception {
	searchForContact(id).updateFirstName(firstName);
	}
	public void updateLastName(String id, String lastName) throws Exception {
	searchForContact(id).updateLastName(lastName);
	}
	public void updatePhoneNumber(String id, String phoneNumber)
	throws Exception {
	searchForContact(id).updatePhoneNumber(phoneNumber);
	}
	
	public void updateAddress(String id, String address) throws Exception {
	searchForContact(id).updateAddress(address);
	}
	protected List<Contact> getContactList() { return contactList; }
	private String newId() {
	return uniqueId = UUID.randomUUID().toString().substring(
	0, Math.min(toString().length(), 10));
	}
	private Contact searchForContact(String id) throws Exception {
	int index = 0;
	while (index < contactList.size()) {
	if (id.equals(contactList.get(index).getContactId())) {
	return contactList.get(index);
	}
	index++;
	}
	throw new Exception("The Task does not exist!");
	}
}
