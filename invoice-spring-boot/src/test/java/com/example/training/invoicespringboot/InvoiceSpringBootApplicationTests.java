package com.example.training.invoicespringboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.training.invoicespringboot.components.AddressDAO;
import com.example.training.invoicespringboot.components.CustomerDAO;
import com.example.training.invoicespringboot.components.ItemsDAO;
import com.example.training.invoicespringboot.components.OrderDescriptionDAO;
import com.example.training.invoicespringboot.components.OrdersDAO;
import com.example.training.invoicespringboot.components.VendorsDAO;
import com.example.training.invoicespringboot.entities.Address;
import com.example.training.invoicespringboot.entities.Customer;
import com.example.training.invoicespringboot.entities.Items;
import com.example.training.invoicespringboot.entities.OrderDescription;
import com.example.training.invoicespringboot.entities.Orders;
import com.example.training.invoicespringboot.entities.Vendors;

@SpringBootTest
class InvoiceSpringBootApplicationTests {

	@Autowired
	public CustomerDAO customerDao;

	@Autowired
	public AddressDAO addressDao;

	@Autowired
	public OrdersDAO ordersDao;

	@Autowired
	public OrderDescriptionDAO orderDescDao;

	@Autowired
	public ItemsDAO itemsDao;

	@Autowired
	public VendorsDAO vendorDao;

	@Test
	void testCustomerDoa() {
		// creation of customer
//		Customer cus = new Customer("Gagana","CM",953595215,"gagan@gmail.com",1);
//		customerDao.createCustomer(cus);
//		assertEquals(1, customerDao.count());

		// Get all customer
//		List<Customer> customer = customerDao.getAllCustomer();
//		System.out.println(customer);
//		
//		//Get customer
//		Customer cus =customerDao.getCustomer(1);
//		System.out.println(customer);

		// delete customer
//		customerDao.deleteCustomer(1);
//		assertEquals(0,customerDao.count());
		// update customer
//		Customer cus1 = new Customer();
//		customerDao.updateCustomer(cus1);
//		cus1.setCustomerId(1);
//		cus1.setCustomerFirstName("Gagan");

	}

	@Test
	void testAddressDao() {
		// create address
//		Address add = new Address(12,"JP nagar","Banglore","Karnataka","India",560090);
//		addressDao.createAddress(add);
//		assertEquals(1, addressDao.count());

		// get all address;
//		List<Address> address= addressDao.getAllAddress();
//		System.out.println(address);

		// get address
//		Address add= addressDao.getAddress(1);
//		System.out.println(add);
		// delete address
//		addressDao.deleteAddress(1);
//		assertEquals(0, addressDao.count());

		// update address
//		Address add= new Address(1,45,"Hesarghatta","Banglore","Karnataka","India",560089,1);
//		addressDao.updateAddress(add);

	}

	@Test
	void testOrdersDao() {
		// create orders
//		Orders odd = new Orders("15/11/2023", 1, 1);
//		ordersDao.createOrder(odd);
//		assertEquals(1, ordersDao.count());

		// get all orderDescription
//			List<Orders> orders= ordersDao.getAllOrders();
//			System.out.println(orders);

		// get oderDescription
//			Orders odd= ordersDao.getOrders(1);
//			System.out.println(odd);

		// delete oder Description
//			orderDescDao.deleteOrderDescription(1);
//			assertEquals(0, orderDescDao.count());

	}

	@Test
	void testOrderDescriptionDao() {
		// creation of orderdescription
//		OrderDescription orderdesc = new OrderDescription(1,2);
//		orderDescDao.createOrderDescription(orderdesc);
//		assertEquals(1, orderDescDao.count());

		// get all orderDescription
		List<OrderDescription> orderDesc= orderDescDao.getAllOrderDescription();
		System.out.println(orderDesc);

		// get oderDescription
		OrderDescription odd= orderDescDao.getOrderDescription(1);
		System.out.println(odd);

		// delete oder Description
//		orderDescDao.deleteOrderDescription(1);
//		assertEquals(0, orderDescDao.count());

	}

	@Test
	void testItems() {
		// Item Creation
//		Items item = new Items(" Story Books","fairy tale stories",500,1);
//		itemsDao.createItem(item);
//		assertEquals(1, itemsDao.count());
//	
		// get all items
//		List<Items> items=itemsDao.getAllItems();
//		System.out.println(items);

		// get items
//		Items item1 =itemsDao.getItems(1);
//		System.out.println(item1);

		// delete items;
//		itemsDao.deleteItem(1);
//		assertEquals(0, itemsDao.count());

	}

	@Test
	void testVendors() {

		// create vendor
//		Vendors vendor=new Vendors("Kiran",953621458,"kiran@gmail.com",1);
//		vendorDao.createVendor(vendor);
//		assertEquals(1, vendorDao.count());

		// get all vendors
//		List<Vendors> vendors = vendorDao.getAllVendors();
//		System.out.println(vendors);
		
		// get vendor
//		Vendors ven = vendorDao.getVendor(1);
//		System.out.println(ven);

		// delete vendor
//		vendorDao.deleteVendor(1);
//		assertEquals(0,vendorDao.count());

	}
}
