package com.shoppingcart.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shoppingcart.app.main.CustomerMain;
import com.shoppingcart.app.main.EmployeeMain;
import com.shoppingcart.app.main.OfficeMain;
import com.shoppingcart.app.main.OrderDetailMain;
import com.shoppingcart.app.main.OrderMain;
import com.shoppingcart.app.main.PaymentMain;
import com.shoppingcart.app.main.ProductLineMain;
import com.shoppingcart.app.main.ProductMain;

@SpringBootApplication
public class ShoppingcartAppApplication implements CommandLineRunner {

	@Autowired
	private ProductMain productMain;
	
	@Autowired
	private ProductLineMain productLineMain;
	
	@Autowired
	private OrderDetailMain orderDetailMain;
	
	@Autowired
	private OrderMain orderMain;
	
	@Autowired
	private PaymentMain paymentMain;
	
	@Autowired
	private CustomerMain customerMain;
	
	@Autowired
	private EmployeeMain employeeMain;
	
	@Autowired
	private OfficeMain officeMain;

	public static void main(String[] args)  {
		SpringApplication.run(ShoppingcartAppApplication.class, args);
			
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("\n\n **************************** S H O P P I N G - C A R T ******************************\n\n");
		
		System.out.println("\n\n***********************************************************\n");
		System.out.println("\n ProductLine Entity Records :  ");
		productLineMain.productLineRun();
		
		System.out.println("\n\n***********************************************************\n");
		System.out.println("\n Product Entity Records :  ");
		productMain.productRun();

		System.out.println("\n\n***********************************************************\n");
		System.out.println("\n OrderDetail Entity Records :  ");
		orderDetailMain.oderDetailRun();
		
		System.out.println("\n\n***********************************************************\n");
		System.out.println("\n Order Entity Records :  ");
		orderMain.orderRun();
		
		System.out.println("\n\n***********************************************************\n");
		System.out.println("\n Payment Entity Records :  ");
		paymentMain.paymentRun();
		
		System.out.println("\n\n***********************************************************\n");
		System.out.println("\n Customer Entity Records :  ");
		customerMain.customerRun();
		
		System.out.println("\n\n***********************************************************\n");
		System.out.println("\n Employee Entity Records :  ");
		employeeMain.employeeRun();
		
		System.out.println("\n\n***********************************************************\n");
		System.out.println("\n Office Entity Records :  ");
		officeMain.officeRun();

	}

}
