//Author Name: Marian Farah
//Date:  Sunday, April 3, 2022
//Course ID: CS-320-T4517 

//Description: This is the appointment class. 

import java.util.Date;
public class Appointment {
	final private byte Appointment_Id_Length;
	final private byte Appointment_Description_Length;
	final private String Initializer;
	private String appointmentId;
	private Date appointmentDate;
	private String description;
	{
	Appointment_Id_Length = 10;
	Appointment_Description_Length = 50;
	Initializer = "Initial";
	}
		Appointment() {
		Date today = new Date();
		appointmentId = Initializer;
		appointmentDate = today;
		description = Initializer;
	}
		Appointment(String id) {
		Date today = new Date();
		updateAppointmentId(id);
		appointmentDate = today;
		description = Initializer;
	}
		Appointment(String id, Date date) {
		updateAppointmentId(id);
		updateDate(date);
		description = Initializer;
	}
		Appointment(String id, Date date, String description) {
		updateAppointmentId(id);
		updateDate(date);
		updateDescription(description);
	}
	public void updateAppointmentId(String id) {
	if (id == null) {
	throw new IllegalArgumentException("Appointment ID cannot be null.");
	} else if (id.length() > Appointment_Id_Length) {
	throw new IllegalArgumentException("Appointment ID cannot exceed " + Appointment_Id_Length + " characters.");
	} 
	else {
	this.appointmentId = id;
	}
	}
	public String getAppointmentId() { return appointmentId; }
	public void updateDate(Date date) {
	if (date == null) {
	throw new IllegalArgumentException("Appointment date cannot be null.");
	} else if (date.before(new Date())) {
	throw new IllegalArgumentException(
	"Cannot make appointment in the past.");
	} 
	else {
	this.appointmentDate = date;
	}
	}
	public Date getAppointmentDate() { return appointmentDate; }
	public void updateDescription(String description) {
	if (description == null) {
	throw new IllegalArgumentException(
	"Appointment description cannot be null.");
	} else if (description.length() > Appointment_Description_Length) {
	throw new IllegalArgumentException(
	"Appointment description cannot exceed " +
			Appointment_Description_Length + " characters.");
	} else {
	this.description = description;
	}
	}
	public String getDescription() { return description; }
	}