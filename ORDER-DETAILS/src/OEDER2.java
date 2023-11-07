
public class OEDER2 {
	int order_id;
	String order_name;
	String order_qty;
	String order_price;
	String order_dloc;
	String customer_name;
	public int getOrder_id() {
		return order_id;
	}
	public String getOrder_name() {
		return order_name;
	}
	public String getOrder_qty() {
		return order_qty;
	}
	public String getOrder_price() {
		return order_price;
	}
	public String getOrder_dloc() {
		return order_dloc;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}
	public void setOrder_qty(String order_qty) {
		this.order_qty = order_qty;
	}
	public void setOrder_price(String order_price) {
		this.order_price = order_price;
	}
	public void setOrder_dloc(String order_dloc) {
		this.order_dloc = order_dloc;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	void func() {
		System.out.println("order2 details are");
	}
}
