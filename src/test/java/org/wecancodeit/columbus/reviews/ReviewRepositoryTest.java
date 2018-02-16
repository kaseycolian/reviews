package org.wecancodeit.columbus.reviews;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReviewRepositoryTest {
	private ReviewRepository underTest;
	
	private long firstProductId = 123;
	private Review firstProduct = new Review (firstProductId, "g2", "www.g2.com", "black pen", "inkers", "gelly");
	
	@Test
	public void shouldFindFirstReview() {
		underTest = new ReviewRepository (firstProduct);
		Review result = underTest.findOne(firstProductId);
		assertThat (result, is(firstProduct));
	}

	
	
}
