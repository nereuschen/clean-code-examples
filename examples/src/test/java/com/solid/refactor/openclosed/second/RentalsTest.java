package com.solid.refactor.openclosed.second;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RentalsTest {

    @Test
    public void calculate_total_charge_for_rentals() throws Exception {
        Rentals rentals = new Rentals();
        Movie regularMovie = new Movie("Matrix", Movie.REGULAR);
        Movie newReleaseMovie = new Movie("Shrek", Movie.NEW_RELEASE);
        Movie childMovie = new Movie("Shrek", Movie.CHILDREN);

        rentals.add(new Rental(newReleaseMovie, 2));
        rentals.add(new Rental(regularMovie, 3));
        rentals.add(new Rental(childMovie, 3));

        Assertions.assertThat(rentals.getTotalCharge()).isEqualTo(15.5);
    }
}
