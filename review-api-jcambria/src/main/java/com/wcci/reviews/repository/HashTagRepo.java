package com.wcci.reviews.repository;

import com.wcci.reviews.entities.HashTag;
import org.springframework.data.repository.CrudRepository;

public interface HashTagRepo extends CrudRepository<HashTag, String> {
}
