package bean;


public class AucBean {
private int itemId;
private String itemName;
private String name;
private String email;
private int bid;
private String status;
public int getItemId() {
	return itemId;
}
public void setItemId(int itemId) {
	this.itemId = itemId;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public AucBean(int itemId, String itemName, String name, String email, int bid, String status) {
	super();
	this.itemId = itemId;
	this.itemName = itemName;
	this.name = name;
	this.email = email;
	this.bid = bid;
	this.status = status;
}



	
}

