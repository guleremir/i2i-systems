package mulakat.entity;

public class Port {
	private int id;
	private Card parent;

	public Port(int id, Card card) {
		this.id = id;
		this.parent = card;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Card getParent() {
		return parent;
	}

}
