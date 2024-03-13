package mulakat.entity;

import java.util.ArrayList;
import java.util.List;

public class Slot {
	private int id;
	private Shelf parent;
	private List<Card> cards = new ArrayList<>();

	public Slot(int id, Shelf parent) {
		this.id = id;
		this.parent = parent;
	}

	public void addCards(int... cardId) {
		for (int i = 0; i < cardId.length; i++) {
			cards.add(new Card(cardId[i], this));
		}
	}

	public List<Card> getChildInventories() {
		return cards;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Shelf getParent() {
		return parent;
	}

}
