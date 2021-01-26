package classpart;

public class Order {
	String orderCode;
	String orderID;
	String orderDate;
	String orderName;
	String productCode;
	String orderAddress;
	
	public void setOrder(String orderCode, String orderID, String orderDate, String orderName, String productCode, String orderAddress) {
		this.orderCode = orderCode;
		this.orderID = orderID;
		this.orderDate = orderDate;
		this.orderName = orderName;
		this.productCode = productCode;
		this.orderAddress = orderAddress;
	}
	
	public void getOrder() {
		System.out.println(orderCode);
		System.out.println(orderID);
		System.out.println(orderDate);
		System.out.println(orderName);
		System.out.println(productCode);
		System.out.println(orderAddress);
	}
}
