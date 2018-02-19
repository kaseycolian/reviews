package org.wecancodeit.columbus.reviews;

public class Review {
	private Long productId;
	private String title;
	private String imageUrl;
	private String category;
	private String content;
	private String footnoteUrl;
	private String firstRelease;
	private String lastRelease;
	private String youTubeUrl;

	public Review(Long productId, String title, String imageUrl, String category, String content, String footnoteUrl,
			String firstRelease, String lastRelease, String youTubeUrl) {
		this.productId = productId;
		this.title = title;
		this.imageUrl = imageUrl;
		this.category = category;
		this.content = content;
		this.footnoteUrl = footnoteUrl;
		this.firstRelease = firstRelease;
		this.lastRelease = lastRelease;
		this.youTubeUrl = youTubeUrl;
	}

	public String getLastRelease() {
		return lastRelease;
	}

	public Long getProductId() {
		return productId;
	}

	public String getTitle() {
		return title;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getCategory() {
		return category;
	}

	public String getContent() {
		return content;
	}

	public String getFootnoteUrl() {
		return footnoteUrl;
	}

	public String getFirstRelease() {
		return firstRelease;
	}

	public String getYouTubeUrl() {
		return youTubeUrl;
	}

}
