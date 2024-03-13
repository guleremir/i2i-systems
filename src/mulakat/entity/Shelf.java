package mulakat.entity;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
	private int id;
	private List<Slot> slots = new ArrayList<>();;

	public Shelf(int id) {
		this.id = id;
	}

	public void addSlot(int... slotId) {
		for (int i = 0; i < slotId.length; i++) {
			slots.add(new Slot(slotId[i], this));
		}
	}

	public List<Slot> getChildInventories() {
		return slots;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
