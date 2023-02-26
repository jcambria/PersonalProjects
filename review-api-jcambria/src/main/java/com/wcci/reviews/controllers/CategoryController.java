package com.wcci.reviews.controllers;

import com.wcci.reviews.entities.Category;
import com.wcci.reviews.entities.PizzaReview;
import com.wcci.reviews.repository.CategoryRepo;
import com.wcci.reviews.repository.ReviewRepo;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
public class CategoryController {

    private CategoryRepo categoryRepo;
    private ReviewRepo reviewRepo;
public CategoryController(CategoryRepo categoryRepo, ReviewRepo reviewRepo){
    this.categoryRepo = categoryRepo;
    this.reviewRepo = reviewRepo;
}
@GetMapping("/categories")
public Iterable<Category> getAllCategories(){
    return categoryRepo.findAll();

}

@GetMapping("/categories/{id}")
    public Category getOneCategory(@PathVariable long id){
    return categoryRepo.findById(String.valueOf(id)).get();
}

@PostMapping("/categories")
    public Iterable<Category> addCategory(@RequestBody Category category) {
        categoryRepo.save(category);
        return categoryRepo.findAll();
    }
    @PutMapping("/categories/{id}/addToReview/{reviewId}")
    public Iterable<Category> addCategoryToReview(@PathVariable long id, @PathVariable long reviewId)
            throws Exception {
        Optional<Category> category = categoryRepo.findById(String.valueOf(id));
        Optional<PizzaReview> review = reviewRepo.findById(String.valueOf(reviewId));
        if (category.isPresent() && review.isPresent()) {
            review.get().setReviewDescription(category.toString());
            reviewRepo.save(review.get());
        }
        else {
            throw new Exception("Category/Review does not exist");
        }
        return categoryRepo.findAll();
    }

}
