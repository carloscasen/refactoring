package org.pris2.refactoring;

public class Rental {

private Movie movie;
private int daysRented;

public Rental(Movie inmovie, int indaysRented) {
	movie = inmovie;
	daysRented = indaysRented;
}

public int getDaysRented() {
	return daysRented;
}

public Movie getMovie() {
	return movie;
}
}