package org.wecancodeit.columbus.reviews;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReviewTest {

	Review underTest = new Review(1234L, "pen", "www.url.com", "pointy", "ink", "gelpen");

	@Test
	public void shouldReturnId() {
		Long productId = underTest.getProductId();
		assertThat(productId, is(1234L));
	}

	@Test
	public void shouldReturnTitle() {
		String title = underTest.getTitle();
		assertThat(title, is("pen"));
	}

	@Test
	public void shouldReturnImageUrl() {
		String imageUrl = underTest.getImageUrl();
		assertThat(imageUrl, is("www.url.com"));
	}

	@Test
	public void shouldReturnCategory() {
		String category = underTest.getCategory();
		assertThat(category, is("pointy"));

	}

	@Test
	public void shouldReturnContent() {
		String content = underTest.getContent();
		assertThat(content, is("ink"));
	}

	@Test
	public void shoulReturnDescription() {
		String description = underTest.getFirstRelease();
		assertThat(description, is("gelpen"));
	}
}
