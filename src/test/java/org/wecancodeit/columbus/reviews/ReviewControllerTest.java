package org.wecancodeit.columbus.reviews;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collection;

public class ReviewControllerTest {
	private Long productId = 42L;

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
		when(repository.findOne(productId)).thenReturn(review);
		underTest.getAReview(productId, model);
	}

	@Test
	public void shouldGetAllReviews() {
	}
}
