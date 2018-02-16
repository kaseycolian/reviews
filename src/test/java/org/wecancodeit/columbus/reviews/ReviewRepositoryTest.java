package org.wecancodeit.columbus.reviews;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class ReviewRepositoryTest {
	
	private ReviewRepository underTest;
	
	private long firstReviewId = 123;
	private Review firstReview = new Review (firstReviewId, "g2", "www.g2.com", "black pen", "inkers", "gelly");
	private long secondReviewId = 456;
	private Review secondReview = new Review (secondReviewId, "g6", "www.g6.com", "blue", "fly", "likeaG6");

	@Test
	public void shouldFindOneReview() {
		underTest = new ReviewRepository (firstReview);
		Review result = underTest.findOne(firstReviewId);
		assertThat (result, is(firstReview));
	}

	@Test
	public void shouldFindAll() {
		underTest = new ReviewRepository (firstReview, secondReview);
		Collection<Review> result = underTest.findAll();
		assertThat(result, containsInAnyOrder(firstReview, secondReview));
	
	
	}
	
}
