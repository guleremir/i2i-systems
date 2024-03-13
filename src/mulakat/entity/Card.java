package mulakat.entity;

import java.util.ArrayList;
import java.util.List;

public class Card {
	private int id;
	private Slot parent;
	private List<Port> ports = new ArrayList<>();

	public Card(int id, Slot slot) {
		this.id = id;
		this.parent = slot;
	}

	public void addPort(int... portId) {
		for (int i = 0; i < portId.length; i++) {
			ports.add(new Port(portId[i], this));
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Port> getChildInventories() {
		return ports;
	}

	public Slot getParent() {
		return parent;
	}

}
