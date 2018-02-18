package org.wecancodeit.columbus.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	Map<Long, Review> reviews = new HashMap<>();

	public ReviewRepository() {
		Review godspeedYou = new Review(1997L, "Godspeed You Black Emperor",
				"../static/images/godspeedYou!BlackEmporer.jpg", "Experimental Music", "because of...",
				"https://en.wikipedia.org/wiki/Godspeed_You!_Black_Emperor", "1997", "2017");
		Review boardsOfCanada = new Review(1986L, "Boards of Canada", "./static/images/boardsOfCanada.jpg",
				"Experimental Music",
				"Laid back electronic music with an overall calming sound that still provides a nice melody to maintain focus.  According to Wikipedia: \"The music of Boards of Canada incorporates elements such as vintage analogue synthesisers, hip hop-inspired breakbeats, and samples from 1970s public broadcasting programmes and other outdated media; it has been described as exploring themes of nostalgia, childhood memory, and nature. In 2012, FACT called them 'one of the best-known and best-loved electronic acts of the last two decades.'\"[1]",
				"https://en.wikipedia.org/wiki/Boards_of_Canada", "1995", "2013");
		Review aphexTwin = new Review(1991L, "Aphex Twin", "../static/images/aphexTwin.jpg", "Experimental Music",
				"because of...", "https://en.wikipedia.org/wiki/Aphex_Twin", "1991", "2014");

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
