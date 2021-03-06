package org.wecancodeit.columbus.reviews;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReviewTest {

	Review underTest = new Review(1234L, "pen", "www.url.com", "pointy", "ink", "gelpen", "stuff", "meow", "vid");

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
	public void shoulReturnFirstRelease() {
		String description = underTest.getFirstRelease();
		assertThat(description, is("stuff"));
	}

	@Test
	public void shouldReturnLastRelease() {
		String release = underTest.getLastRelease();
		assertThat(release, is("meow"));
	}

	@Test
	public void shouldReturnFootnoteUrl() {
		String footnote = underTest.getFootnoteUrl();
		assertThat(footnote, is("gelpen"));
	}

	@Test
	public void shouldReturnYouTubeVideo() {
		String tube = underTest.getYouTubeUrl();
		assertThat(tube, is("vid"));
	}
}
