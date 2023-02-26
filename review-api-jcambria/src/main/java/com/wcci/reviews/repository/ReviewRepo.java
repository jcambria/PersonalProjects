package com.wcci.reviews.repository;

import com.wcci.reviews.entities.PizzaReview;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepo extends CrudRepository<PizzaReview, String> {


}
