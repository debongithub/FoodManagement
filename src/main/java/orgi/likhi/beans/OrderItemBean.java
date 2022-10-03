package orgi.likhi.beans;

public class OrderItemBean {
	
	private String itemName;
	private String numberOfItems;
	private String restaurantName;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getNumberOfItems() {
		return numberOfItems;
	}
	public void setNumberOfItems(String numberOfItems) {
		this.numberOfItems = numberOfItems;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	@Override
	public String toString() {
		return "OrderItemBean [itemName=" + itemName + ", numberOfItems=" + numberOfItems + ", restaurantName="
				+ restaurantName + "]";
	}
	
	
}
