package org.wecancodeit.columbus.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	public Map<Long, Review> reviews = new HashMap<>();

	public ReviewRepository() {
		Review godspeedYou = new Review(1997L, "Godspeed You Black Emporer", "http://cstrecords.com/gybe/", "Music",
				"Experimental Band", "Amazing");

		reviews.put(godspeedYou.getProductId(), godspeedYou);
	}

	public ReviewRepository(Review... reviews) {
		populateReviewsMap(reviews);

	}
public void populateReviewsMap(Review...reviews) {
	for (Review review: reviews);
	this.reviews.put(review.getProductId, review);
}
	
	// public ReviewRepository(Review firstProduct) {
	//
	// }

	public Review findOne(Long firstProductId) {

		return reviews.get(firstProductId);
	}

	public Collection<Review> findAll() {

		return reviews.values();
	}

}
