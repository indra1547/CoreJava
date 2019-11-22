package com.indra.java.corejava.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FetchTopThreeRatedItems {
	
	private static List<Item> createItems() {
		List<Item> items = new ArrayList<>();
		items.add(new Item(23,"Audi", 3.8f));
		items.add(new Item(13,"BMW", 4.0f));
		items.add(new Item(10,"Tesla", 4.2f));
		items.add(new Item(28,"Honda", 3.9f));
		items.add(new Item(27,"Toyota", 5.0f));
		return items;
	}
	
	static class Item{
		private Integer itemId;
		private String itemName;
		private Float ratings;
		public Item(Integer itemId, String itemName, Float ratings) {
			super();
			this.itemId = itemId;
			this.itemName = itemName;
			this.ratings = ratings;
		}
		public Integer getItemId() {
			return itemId;
		}
		public void setItemId(Integer itemId) {
			this.itemId = itemId;
		}
		public String getItemName() {
			return itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public Float getRatings() {
			return ratings;
		}
		public void setRatings(Float ratings) {
			this.ratings = ratings;
		}
	}

	public static void main(String[] args) {
		List<Item> getItemDetails = createItems();
		
		List<String> res = new ArrayList<>();
		res = getItemDetails.stream()
						.sorted(Comparator.comparing(Item :: getRatings).reversed())
						.limit(3)
						.map(Item::getItemName)
						.collect(Collectors.toList());
		System.out.println(res);
	}

}
