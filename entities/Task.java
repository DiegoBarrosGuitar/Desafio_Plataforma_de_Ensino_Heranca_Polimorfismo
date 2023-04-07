package entities;

public class Task extends Lesson {

	private String description;
	private int quastionCount;
	
	public Task() {
	}
	
	public Task(String title, String description, int quastionCount) {
		super(title);
		this.description = description;
		this.quastionCount = quastionCount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuastionCount() {
		return quastionCount;
	}

	public void setQuastionCount(int quastionCount) {
		this.quastionCount = quastionCount;
	}

	@Override
	public int duration() {
	    return quastionCount * 5 * 60;
	}

}
