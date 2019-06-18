package com.ml.audiencereviewanalysis.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class UserReview {
	
	@Id
	private int reviewId;
	
	private String review;
	private short rating;
	
	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public short getRating() {
		return rating;
	}
	public void setRating(short rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "UserReview [reviewId=" + reviewId + ", review=" + review + ", rating=" + rating + "]";
	}
	

}
