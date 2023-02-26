package com.wcci.reviews.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collection;

public class Category {
    @Id
    @GeneratedValue
    private long id;
    private String categoryName;
    private String pizzaType;

   @OneToMany(mappedBy = "Category")
    private Collection<PizzaReview> pizzaReviews;


    public Category(String categoryName, String pizzaType){
        this.categoryName = categoryName;
        this.pizzaType = pizzaType;
    }

    public long getId(){
        return id;
    }
    public String getCategoryName(){
        return categoryName;
    }

    public Collection<PizzaReview> getPizzaReviews(){
        return pizzaReviews;

    }

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

}





