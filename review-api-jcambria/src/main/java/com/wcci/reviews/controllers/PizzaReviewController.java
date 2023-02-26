package com.wcci.reviews.controllers;

import com.wcci.reviews.entities.PizzaReview;
import com.wcci.reviews.repository.ReviewRepo;
import org.springframework.web.bind.annotation.*;

@RestController
public class PizzaReviewController {
    private ReviewRepo reviewRepo;

    public PizzaReviewController(ReviewRepo reviewRepo){
        this.reviewRepo = reviewRepo;
    }

    @GetMapping("/reviews")
    public Iterable<PizzaReview> getAllReview(){
        return reviewRepo.findAll();
    }

    @GetMapping("/reviews/{id}")
    public PizzaReview getOneReview(@PathVariable long id){
        return reviewRepo.findById(String.valueOf(id)).get();
    }
    @PostMapping("/reviews")
    public Iterable<PizzaReview> addNewReview(@RequestBody PizzaReview newReview){
        reviewRepo.save(newReview);
        return reviewRepo.findAll();
    }


}


