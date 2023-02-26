package com.wcci.reviews.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
public class PizzaReview {
    @Id
    @GeneratedValue
    private long id;
    private int rating;

    private String reviewerName;
    private String reviewDescription;
    private String pizzaName;

    @ManyToMany(mappedBy = "reviews")
    private Collection<HashTag> hashTags;

    public Collection<HashTag> getHashTags(){
        return hashTags;
    }


    public PizzaReview(long id,String reviewerName, String reviewText, String pizzaName, int rating){
        this.id = id;
        this.reviewerName = reviewerName;
        this.reviewDescription = reviewText;
        this.pizzaName = pizzaName;
        this.rating = rating;


    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }


    public String getReviewDescription(PizzaReview Review) {
        return reviewDescription;
    }

    public void setReviewDescription(String reviewDescription) {
        this.reviewDescription = reviewDescription;
    }


    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }





    }





