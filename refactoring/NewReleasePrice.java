package org.pris2.refactoring;

class NewReleasePrice extends Price {
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
	double getCharge(int daysRented) {
		return daysRented * 3;
	}
}