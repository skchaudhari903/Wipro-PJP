package com.wipro.sales.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.wipro.sales.bean.Sales;
import com.wipro.sales.bean.Stock;
import com.wipro.sales.service.Administrator;

public class SalesApplication {

	
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		Administrator admin = new Administrator();
		
		int choice = 0;
		
		do {
			System.out.println("1. Insert Stock");
			System.out.println("2. Delete Stock");
			System.out.println("3. Insert Sales");
			System.out.println("4. View Sales Report");
			System.out.print("Enter your Choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				Stock stock = new Stock();
				System.out.print("Enter product ID: ");
				stock.setProductID(sc.nextLine());
				System.out.print("Enter product name: ");
				stock.setProductName(sc.nextLine());
				System.out.print("Enter quantity on hand: ");
				stock.setQuantityOnHand(sc.nextInt());
				sc.nextLine();
				System.out.print("Enter product unit price: ");
				stock.setProductUnitPrice(sc.nextDouble());
				System.out.print("Enter product reorder level: ");
				stock.setReorderLevel(sc.nextInt());
				sc.nextLine();
				admin.insertStock(stock);
				break;
			case 2:
				System.out.print("Enter product id to be deleted: ");
				String removeId = sc.nextLine();
				removeId = admin.deleteStock(removeId);
				if (removeId != null) System.out.println(removeId + " removed successfully");
				break;
			case 3:
				Sales sales = new Sales();
				System.out.print("Enter sales id: ");
				sales.setSalesID(sc.nextLine());
				System.out.print("Enter date (dd-mm-yyyy): ");
				String sDate = sc.nextLine();  
			    Date date = new SimpleDateFormat("dd-mm-yyyy").parse(sDate); 
				sales.setSalesDate(date);
				System.out.print("Enter product id: ");
				sales.setProductID(sc.nextLine());
				System.out.print("Enter quantity sold: ");
				sales.setQuantitySold(sc.nextInt());
				sc.nextLine();
				System.out.print("Enter sales price per unit: ");
				sales.setSalesPricePerUnit(sc.nextDouble());
				admin.insertSales(sales);
				break;
			case 4:
				admin.getSalesReport();
				break;
			default:
				System.out.println("Exiting...");
				choice = 0;
				break;
			}
		} while (choice >= 1 && choice <= 4);
		
		sc.close();
	}

}