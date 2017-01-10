// ***************************************************************
//   Shop.java
//
//   Uses the Item class to create items and add them to a shopping
//   cart stored in an ArrayList.
// ***************************************************************

import java.util.ArrayList;
import java.text.NumberFormat;
import java.util.Scanner;

public class Shop
{
    public static void main (String[] args)
    {

	ArrayList<String> cart = new ArrayList<String>();

	Item item;
	String itemName;
	double itemPrice;
	int quantity;

	Scanner scan = new Scanner (System.in);

	String keepShopping = "y";

	do
	    {
		System.out.print ("Enter the name of the item: ");
		itemName = scan.nextLine();

		System.out.print ("Enter the unit price: ");
		itemPrice = scan.nextDouble();

		System.out.print ("Enter the quantity: ");
		quantity = scan.nextInt();

		// *** create a new item and add it to the cart
		cart.add(itemName);


		// *** print the contents of the cart object
		double totalPrice = 0;

		item = new Item(itemName, itemPrice, quantity);



		for (int i = 0; i < cart.size(); i++)
		{
			totalPrice += item.getPrice() * item.getQuantity();
		}

			System.out.println("");
			System.out.println("Shopping cart: ");
			System.out.println("");
			System.out.println(cart);
			System.out.println("Total: " + totalPrice);

			System.out.println();
			System.out.print ("Continue shopping (y/n)? ");
			scan.nextLine();
			keepShopping = scan.nextLine();
	    }
	while (keepShopping.equals("y"));

    }
}

