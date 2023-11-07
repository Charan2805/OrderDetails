
public class DriverCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ORDER1 a1;
OEDER2 a2;
ORDER3 a3;
ORDER4 a4;
ORDER5 a5;
a1 = new ORDER1();
a2 = new OEDER2();
a3 = new ORDER3();
a4 = new ORDER4();
a5 = new ORDER5();
//order1
a1.setOrder_id(301);
a1.setOrder_name("shirt");
a1.setCustomer_name("sravan");
a1.setOrder_dloc("kothirampur");
a1.setOrder_price("550rs");
a1.setOrder_qty("1kg");
//order2
a2.setOrder_id(302);
a2.setOrder_name("pant");
a2.setCustomer_name("sravan");
a2.setOrder_dloc("kothirampur");
a2.setOrder_price("850rs");
a2.setOrder_qty("3kg");
//order3
a3.setOrder_id(303);
a3.setOrder_name("hoodie");
a3.setCustomer_name("sravan");
a3.setOrder_dloc("kothirampur");
a3.setOrder_price("1050rs");
a3.setOrder_qty("2kg");
//order4
a4.setOrder_id(304);
a4.setOrder_name("lower");
a4.setCustomer_name("sravan");
a4.setOrder_dloc("kothirampur");
a4.setOrder_price("250rs");
a4.setOrder_qty("250grams");
//order5
a5.setOrder_id(305);
a5.setOrder_name("inner");
a5.setCustomer_name("sravan");
a5.setOrder_dloc("kothirampur");
a5.setOrder_price("150rs");
a5.setOrder_qty("100grams");

a1.func();
System.out.println("order id : " + a1.getOrder_id());
System.out.println("order name : " + a1.getOrder_name() );
System.out.println("customer name : " + a1.getCustomer_name());
System.out.println("delivery location : " + a1.getOrder_dloc());
System.out.println("order price : " + a1.getOrder_price());
System.out.println("order quantity : " + a1.getOrder_qty());
System.out.println("  ");

a2.func();
System.out.println("order id : " + a2.getOrder_id());
System.out.println("order name : " + a2.getOrder_name() );
System.out.println("customer name : " + a2.getCustomer_name());
System.out.println("delivery location : " + a2.getOrder_dloc());
System.out.println("order price : " + a2.getOrder_price());
System.out.println("order quantity : " + a2.getOrder_qty());
System.out.println("  ");

a3.func();
System.out.println("order id : " + a3.getOrder_id());
System.out.println("order name : " + a3.getOrder_name() );
System.out.println("customer name : " + a3.getCustomer_name());
System.out.println("delivery location : " + a3.getOrder_dloc());
System.out.println("order price : " + a3.getOrder_price());
System.out.println("order quantity : " + a3.getOrder_qty());
System.out.println("  ");

a4.func();
System.out.println("order id : " + a4.getOrder_id());
System.out.println("order name : " + a4.getOrder_name() );
System.out.println("customer name : " + a4.getCustomer_name());
System.out.println("delivery location : " + a4.getOrder_dloc());
System.out.println("order price : " + a4.getOrder_price());
System.out.println("order quantity : " + a4.getOrder_qty());
System.out.println("  ");

a5.func();
System.out.println("order id : " + a5.getOrder_id());
System.out.println("order name : " + a5.getOrder_name() );
System.out.println("customer name : " + a5.getCustomer_name());
System.out.println("delivery location : " + a5.getOrder_dloc());
System.out.println("order price : " + a5.getOrder_price());
System.out.println("order quantity : " + a5.getOrder_qty());

	}

}
