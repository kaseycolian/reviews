package org.wecancodeit.columbus.reviews;

public class Review {
private Long productId;
private String title;
private String imageUrl;
private String category;
private String content;
private String description;
	
public Review (Long productId, String title, String imageUrl, String category, String content, String description) {
	this.productId = productId;
	this.title = title;
	this.imageUrl = imageUrl;
	this.category = category;
	this.content = content;
	this.description = description;
	
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

public String getDescription() {
	return description;
}

		
	
	}
}
