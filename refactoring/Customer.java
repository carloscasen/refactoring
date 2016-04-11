package org.pris2.refactoring;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Customer {

	private String name;
	private Vector _rentals = new Vector();
	private ArrayList rentals = new ArrayList();

	public Customer(String inname) {
		name = inname;
	};

	public void addRental(Rental arg) {
		rentals.add(arg);
		_rentals.addElement(arg);
	}

	public String getName() {
		return name;
	}

	/*
	 * public String statement() { double totalAmount = 0; int
	 * frequentRenterPoints = 0;
	 * 
	 * Iterator<Rental> itrentals = rentals.iterator();
	 * 
	 * String result = "Rental Record for " + getName() + "\n";
	 * 
	 * while (itrentals.hasNext()) { double thisAmount = 0; Rental each =
	 * itrentals.next(); //determine amounts for each line switch
	 * (each.getMovie().getPriceCode()) { case Movie.REGULAR: thisAmount += 2;
	 * if (each.getDaysRented() > 2) thisAmount += (each.getDaysRented() - 2) *
	 * 1.5; break; case Movie.NEW_RELEASE: thisAmount += each.getDaysRented() *
	 * 3; break; case Movie.CHILDRENS: thisAmount += 1.5; if
	 * (each.getDaysRented() > 3) thisAmount += (each.getDaysRented() - 3) *
	 * 1.5; break; default: break; } // add frequent renter points
	 * frequentRenterPoints ++; // add bonus for a two day new release rental if
	 * ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
	 * each.getDaysRented() > 1) frequentRenterPoints ++; //show figures for
	 * this rental result += "   " + each.getMovie().getTitle()+ " " +
	 * thisAmount + "\n"; totalAmount += thisAmount; } //add footer lines result
	 * += "Amount owed is " + totalAmount + "\n"; result += "You earned " +
	 * frequentRenterPoints + " frequent renter points"; return result; }
	 */
	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()) {
			double thisAmount = 0;
			Rental each = (Rental) rentals.nextElement();
			thisAmount = amountFor(each);
			// add frequent renter points
			frequentRenterPoints++;
			// add bonus for a two day new release rental
			if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1)
				frequentRenterPoints++; // show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
			totalAmount += thisAmount;
		}
		// add footer lines
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
		return result;
	}

	private double amountFor(Rental aRental) {
		return aRental.getCharge();
	}

}