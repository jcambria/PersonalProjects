package com.wcci.reviews.repository;

import com.wcci.reviews.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category, String> {

}
