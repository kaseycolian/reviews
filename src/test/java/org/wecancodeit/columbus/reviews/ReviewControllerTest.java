package org.wecancodeit.columbus.reviews;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ReviewControllerTest {

	@InjectMocks
	private ReviewController underTest;

	@Mock
	private Review review;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void shouldGetAllReviews() {
	}
}
