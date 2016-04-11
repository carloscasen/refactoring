package org.pris2.refactoring;

public class Movie {

public static final int CHILDRENS = 2;
public static final int REGULAR = 0;
public static final int NEW_RELEASE = 1;

private String title;
private int priceCode;

public Movie(String intitle, int inpriceCode) {
	title = intitle;
	priceCode = inpriceCode;
}

public int getPriceCode() {
	return priceCode;
}

public void setPriceCode(int arg) {
	priceCode = arg;
}

public String getTitle (){
	return title;
};

} 