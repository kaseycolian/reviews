package org.wecancodeit.columbus.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	Map<Long, Review> reviews = new HashMap<>();

	public ReviewRepository() {
		Review godspeedYou = new Review(1997L, "Godspeed You! Black Emperor", "./images/godspeedYou!BlackEmporer.jpg",
				"Experimental, Post-Rock, Drone",
				"Godspeed You! Black Emperor is a relaxing sound that allows your mind to stay focused on the work athand while allowing your thoughts to expand as the musical journey progresses.  It \"is a Canadian experimental music collective which originated in Montreal, Quebec in 1994. The group releases recordings through Constellation, an independent record label also located in Montreal. After the release of their debut album in 1997, the group toured regularly from 1998 to 2002. In 2003, the band announced an indefinite hiatus in order for members to pursue other musical interests. In the intervening period, the group was occasionally rumored to have broken up, but finally reconvened for a tour which began in late 2010. Since reforming, they have released three more albums, the most recent being Luciferian Towers in September 2017.\"[1]",
				"https://en.wikipedia.org/wiki/Godspeed_You!_Black_Emperor", "1997", "2017",
				"https://www.youtube.com/embed/PZwQeZh6rP0");
		Review boardsOfCanada = new Review(1986L, "Boards of Canada", "./images/boardsOfCanada.jpg",
				"Experimental, IDM, Ambient Techno",
				"Boards of Canada produce laid back music with an overall calming sound, providing a soothing introspective melody to maintain focus.  According to Wikipedia: \"The music of Boards of Canada incorporates elements such as vintage analogue synthesisers, hip hop-inspired breakbeats, and samples from 1970s public broadcasting programmes and other outdated media; it has been described as exploring themes of nostalgia, childhood memory, and nature. In 2012, FACT called them 'one of the best-known and best-loved electronic acts of the last two decades.'\"[1]",
				"https://en.wikipedia.org/wiki/Boards_of_Canada", "1995", "2013",
				"https://www.youtube.com/embed/XaJn3QqiIUc");
		Review aphexTwin = new Review(1991L, "Aphex Twin", "./images/aphexTwin.jpg",
				"Experimental, Ambient Techno, IDM",
				"The sound of Aphex Twin is more intense, with a beat that can drive concentration.  According to Wikipedia: 'Richard David James (born 18 August 1971), best known by his recording alias Aphex Twin, is a Cornish (English) electronic musician, known for his influential and idiosyncratic work in styles such as ambient techno and IDM in the 1990s, for which he received widespread critical acclaim. He is also the co-founder of Rephlex Records with Grant Wilson-Claridge.'[1]",
				"https://en.wikipedia.org/wiki/Aphex_Twin", "1991", "2014",
				"https://www.youtube.com/embed/S5UBYOv1G9A");

		reviews.put(godspeedYou.getProductId(), godspeedYou);
		reviews.put(boardsOfCanada.getProductId(), boardsOfCanada);
		reviews.put(aphexTwin.getProductId(), aphexTwin);
	}

	public ReviewRepository(Review... reviews) {
		populateReviewsMap(reviews);
	}

	private void populateReviewsMap(Review... reviews) {
		for (Review review : reviews) {
			this.reviews.put(review.getProductId(), review);
		}
	}

	public Review findOne(Long productId) {
		return reviews.get(productId);
	}

	public Collection<Review> findAll() {
		return reviews.values();
	}

}
