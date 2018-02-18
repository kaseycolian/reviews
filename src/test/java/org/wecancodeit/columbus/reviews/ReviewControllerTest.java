package org.wecancodeit.columbus.reviews;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

public class ReviewControllerTest {

	@InjectMocks
	private ReviewController underTest;

	@Mock
	private ReviewRepository repository;

	@Mock
	private Model model;

	@Mock
	private Review review;

	@Mock
	private Review anotherReview;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void shouldGetASingleReviewModel() {

	}

	@Test
	public void shouldGetAllReviews() {
	}
}
