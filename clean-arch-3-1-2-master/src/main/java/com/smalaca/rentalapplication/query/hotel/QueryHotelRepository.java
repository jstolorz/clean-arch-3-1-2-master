package com.smalaca.rentalapplication.query.hotel;

import org.springframework.stereotype.Repository;

@Repository
public class QueryHotelRepository {
    // spring test 2
    private final SpringJpaQueryHotelRepository repository;

    public QueryHotelRepository(SpringJpaQueryHotelRepository repository) {
        this.repository = repository;
    }

    public Iterable<HotelReadModel> findAll() {
        return repository.findAll();
    }
}
