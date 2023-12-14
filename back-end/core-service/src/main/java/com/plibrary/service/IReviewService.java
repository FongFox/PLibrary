package com.plibrary.service;

import com.plibrary.dto.ReviewRequest;

public interface IReviewService {
    public void postReview(String userEmail, ReviewRequest reviewRequest) throws Exception;
    public Boolean userReviewListed(String userEmail, Long bookId);
}
