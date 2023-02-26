package com.wcci.reviews.controllers;

import com.wcci.reviews.entities.HashTag;
import com.wcci.reviews.entities.PizzaReview;
import com.wcci.reviews.repository.HashTagRepo;
import com.wcci.reviews.repository.ReviewRepo;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

public class HashTagController {
    private HashTagRepo hashtagRepo;
    private ReviewRepo reviewRepo;

    public HashTagController(HashTagRepo hashtagRepo, ReviewRepo reviewRepo) {
        this.hashtagRepo = hashtagRepo;
        this.reviewRepo = reviewRepo;
    }

    @GetMapping("/hashtags")
    public Iterable<HashTag> getHashtags() {
        return hashtagRepo.findAll();
    }

    @GetMapping("/hashtags/{id}")
    public HashTag getSingleHashtag(@PathVariable long id) {
        return hashtagRepo.findById(String.valueOf(id)).get();
    }

    @GetMapping("/hashtags/{id}/getReviews")
    public Iterable<PizzaReview> getReviews(@PathVariable long id) {
        return hashtagRepo.findById(String.valueOf(id)).get().getReviews();
    }

    @PostMapping("/hashtags")
    public Iterable<HashTag> addHashtag(@RequestBody HashTag newHashtag) {
        hashtagRepo.save(newHashtag);
        return hashtagRepo.findAll();
    }

    @PutMapping("/hashtags/{id}/addToReview/{reviewId}")
    public PizzaReview addHashtagToReview(@PathVariable long id, @PathVariable long reviewId) throws Exception {
        Optional<HashTag> hashtag = hashtagRepo.findById(String.valueOf(id));
        Optional<PizzaReview> review = reviewRepo.findById(String.valueOf(reviewId));
        if (hashtag.isPresent() && review.isPresent()) {
            hashtag.get().addHashTagToReview(review.get());
            hashtagRepo.save(hashtag.get());
        } else {
            throw new Exception("review/hashtag not found");
        }
        return reviewRepo.findById(String.valueOf(reviewId)).get();
    }
}
