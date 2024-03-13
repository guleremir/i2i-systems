package mulakat;

import mulakat.entity.Shelf;

public class Main {

	public static void main(String[] args) {

		Shelf shelf1 = new Shelf(1);

		shelf1.addSlot(2);
		shelf1.getChildInventories().forEach(slot -> {
			System.out.println(String.format("Shelf ID: %s -> Slot ID: %s",
					slot.getParent().getId(), slot.getId()));
			slot.addCards(10);
			slot.getChildInventories().forEach(card -> {
				System.out.println(
						String.format("\t\t Slot ID: %s -> Card ID: %s",
								card.getParent().getId(), card.getId()));
				card.addPort(100, 101, 102);
				card.getChildInventories().forEach(port -> {
					System.out.println(
							String.format("\t\t\t\t Card ID: %s -> Port ID: %s",
									port.getParent().getId(), port.getId()));
				});
			});
		});

	}
}
