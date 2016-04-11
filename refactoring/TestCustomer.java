package org.pris2.refactoring;

import junit.framework.TestCase;

public class TestCustomer extends TestCase {
	
	public void test() {
	//PELICULAS DE ALQUILER
			Movie movie1=new Movie("La sirenita",2);
			Movie movie2=new Movie("Origen",0);
			Movie movie3=new Movie("Batman v Superman",1);
			
			//ALQUILERES
			Rental rental1=new Rental(movie1,4);
			Rental rental2=new Rental(movie2,2);
			Rental rental3=new Rental(movie3,2);
			
			//CLIENTES
			Customer customer1=new Customer("Carlos");
			Customer customer2=new Customer("Maria");
			
			
			customer1.addRental(rental1);
			customer2.addRental(rental2);
			customer2.addRental(rental3);
			
			assertEquals(customer2.statement(),"Rental Record for Maria"+"\n"+"	Origen	2.0"+"\n"+"	Batman v Superman	6.0"+"\n"+"Amount owed is 8.0"+"\n"+"You earned 3 frequent renter points");
			assertEquals(customer1.statement(),"Rental Record for Carlos"+"\n"+"	La sirenita	3.0"+"\n"+"Amount owed is 3.0"+"\n"+"You earned 1 frequent renter points");
		
			assertEquals(customer1.htmlStatement(),"<H1>Rentals for <EM>Carlos</EM></H1><P>"+"\n"+"La sirenita: 3.0<BR>"+"\n"+"<P>You owe <EM>3.0</EM><P>"+"\n"+"On this rental rental you earned <EM>1</EM> frequent renter points<P>");

			movie1.getFrequentRenterPoints(7);
			
			assertEquals(movie1.getFrequentRenterPoints(7),1);
			
		}

}
