//Author Name: Marian Farah
//Date:  Sunday, March 27, 2022
//Course ID: CS-320-T4517 

//Description: This is the task class. 

public class Task {
	private String taskId;
	private String name;
	private String description;
	Task() {
	taskId = "Initial";
	name = "Initial";
	description = "Description";
	}
		Task(String taskId) {
		checkTaskId(taskId);
		name = "Initial";
		description = "Description";
	}
		Task(String taskId, String name) {
		checkTaskId(taskId);
		setName(name);
		description = "Description";
	}
		Task(String taskId, String name, String desc) {
		checkTaskId(taskId);
		setName(name);
		setDescription(desc);
	}
	public final String getTaskId() { return taskId; }
	public final String getName() { return name; }
	protected void setName(String name) {
	if (name == null || name.length() > 20) {
	throw new IllegalArgumentException(
	"Invalid name. The name must be shorter than 20 characters and not empty.");
	} else {
	this.name = name;
	}
	}
	public final String getDescription() { return description; }
	protected void setDescription(String taskDescription) {
	if (taskDescription == null || taskDescription.length() > 50) 
	{throw new IllegalArgumentException("Invalid task description. The task description must be shorter than 50 characters and not empty.");
	} else {
	this.description = taskDescription;
	}
	}
	private void checkTaskId(String taskId) {
	if (taskId == null || taskId.length() > 10) {
	throw new IllegalArgumentException(
	"Invalid Task Id: The Task Id was empty or the task Id must not be longer than 10 characters");
	} else {
	this.taskId = taskId;
	}
	}
}
