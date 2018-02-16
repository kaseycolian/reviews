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
		Review boardsOfCanada = new Review(1986L, "Boards of Canada",
				"https://i.ytimg.com/vi/nSGIX0U8myU/maxresdefault.jpg", "Music", "Experimental Music", "Chill");
		Review aphexTwin = new Review(1991L, "Aphex Twin", "http://whpuxin.com/data/out/10/IMG_464988.jpg", "Music",
				"Experimental Music", "Driving");

		reviews.put(godspeedYou.getProductId(), godspeedYou);
		reviews.put(boardsOfCanada.getProductId(), boardsOfCanada);
		reviews.put(aphexTwin.getProductId(), aphexTwin);
	}

	public ReviewRepository(Review... reviews) {
		populateReviewsMap(reviews);
	}

	private void populateReviewsMap(Review... reviews) {
		for (Review review : reviews) {
			this.reviews.put(review.getProductId(), review);
		}
	}

	public Review findOne(Long productId) {
		return reviews.get(productId);
	}

	public Collection<Review> findAll() {
		return reviews.values();
	}

}
