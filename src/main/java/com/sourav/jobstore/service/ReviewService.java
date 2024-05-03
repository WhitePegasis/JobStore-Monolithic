package com.sourav.jobstore.service;

import java.util.List;

import com.sourav.jobstore.model.Review;

public interface ReviewService {
    List<Review> getAllReviews(Long companyId);
    boolean addReview(Long companyId, Review review);
    Review getReview(Long companyId, Long reviewId);
    boolean updateReview(Long companyId, Long reviewId, Review review);
    boolean deleteReview(Long companyId, Long reviewId);
}
