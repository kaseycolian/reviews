package org.wecancodeit.columbus.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	Map<Long, Review> reviews = new HashMap<>();

	public ReviewRepository() {
		Review godspeedYou = new Review(1997L, "Godspeed You Black Emporer",
				"./static/images/godspeedYou!BlackEmporer.jpg", "Music", "Experimental Band", "1997");
		Review boardsOfCanada = new Review(1986L, "Boards of Canada", "./static/images/boardsOfCanada.jpg", "Music",
				"Experimental Music", "1995");
		Review aphexTwin = new Review(1991L, "Aphex Twin", "./static/images/aphexTwin.jpg", "1991",
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
