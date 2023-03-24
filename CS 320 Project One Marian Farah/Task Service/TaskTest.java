//Author Name: Marian Farah
//Date:  Sunday, March 27, 2022
//Course ID: CS-320-T4517 

//Description: This is the task test junit class.

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class TaskTest {
	private String id, name, description;
	private String tooLongId, tooLongName, tooLongDescription;
	
	@BeforeEach
	void setUp() {
		id = "1234567890";
		name = "Twenty Characters";
		description = "The task object must have a description.";
		tooLongId = "12121212121212121212121212121212121212121212";
		tooLongName = "This task name is too long.";
		tooLongDescription = "The task object must have a description String field that cannot be longer than 50 characters. The description field must not be empty.";
	}
	@Test
	void getTaskIdTest() {
		Task task = new Task(id);
		Assertions.assertEquals(id, task.getTaskId());
	}
	@Test
	void getNameTest() {
		Task task = new Task(id, name);
		Assertions.assertEquals(name, task.getName());
	}
	@Test
	void getDescriptionTest() {
		Task task = new Task(id, name, description);
		Assertions.assertEquals(description, task.getDescription());
	}
	@Test
	void setNameTest() {
		Task task = new Task();
		task.setName(name);
		Assertions.assertEquals(name, task.getName());
	}
	@Test
	void setDescriptionTest() {
		Task task = new Task();
		task.setDescription(description);
		Assertions.assertEquals(description, task.getDescription());
	}
	@Test
	void TaskIdTooLongTest() {
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> new Task(tooLongId));
	}
	@Test
	void setTooLongNameTest() {
		Task task = new Task();
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> task.setName(tooLongName));
	}
	@Test
	void setTooLongDescriptionTest() {
		Task task = new Task();
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> task.setDescription(tooLongDescription));
	}
	@Test
	void TaskIdNullTest() {
		Assertions.assertThrows(IllegalArgumentException.class,
		() -> new Task(null));
	}
	@Test
	void TaskNameNullTest() {
		Task task = new Task();
		Assertions.assertThrows(IllegalArgumentException.class,
		() -> task.setName(null));
	}
	@Test
	void TaskDescriptionNullTest() {
		Task task = new Task();
		Assertions.assertThrows(IllegalArgumentException.class,
		() -> task.setDescription(null));
	}
}

