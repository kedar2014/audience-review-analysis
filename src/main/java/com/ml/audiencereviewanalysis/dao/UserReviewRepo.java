package com.ml.audiencereviewanalysis.dao;

import org.springframework.data.repository.CrudRepository;

import com.ml.audiencereviewanalysis.model.UserReview;

public interface UserReviewRepo extends CrudRepository<UserReview, Integer> {

}
