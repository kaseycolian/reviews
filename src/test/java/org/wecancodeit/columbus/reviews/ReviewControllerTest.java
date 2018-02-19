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
	private Review oneReview;

	@Mock
	private Review twoReview;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void shouldGetASingleReviewModel() {
		when(repository.findOne(productId)).thenReturn(oneReview);
		underTest.getAReview(productId, model);
	}

	@Test
	public void shouldReturnSingleReviewOnlyTemplate() {
		String reviewTemp = underTest.getAReview(productId, model);
		assertThat(reviewTemp, is("review"));
	}

	@Test
	public void shouldAllAllReviewsToModel() {
		Collection<Review> allReviews = Arrays.asList(oneReview, twoReview);
		when(repository.findAll()).thenReturn(allReviews);
		underTest.getAllReviews(model);
		verify(model).addAttribute("reviews", allReviews);
	}

	@Test
	public void shouldReturNameOfAllReviewsTemplate() {
		Collection<Review> allReviews = Arrays.asList(oneReview, twoReview);
		String reviewAllTemps = underTest.getAllReviews(model);
		assertThat(reviewAllTemps, is("reviews"));
	}

}
