package com.wcci.reviews.entities;

import javax.persistence.Entity;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
@Entity
public class HashTag {
private long id;
private String description;

private Collection<PizzaReview> reviews;
public HashTag(String description, PizzaReview... reviews){
    this.description = description;
    this.reviews = Arrays.asList(reviews);
}

public void addHashTagToReview(PizzaReview review){
    review.getHashTags();
}

public String getDescription(){
    return description;
}
public Collection<PizzaReview> getReviews(){
    return reviews;
}
}
