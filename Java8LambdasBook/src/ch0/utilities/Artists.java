package ch0.utilities;

import java.util.List;
import java.util.Optional;

public class Artists {

	private List<Artist> artists;

	public Artists(List<Artist> artists) {
		this.artists = artists;
	}

	public Optional<Artist> getArtist(int index) {
		if (index < 0 || index >= artists.size()) {
	//		indexException(index);
			return Optional.empty();
		}
		return  Optional.ofNullable( artists.get(index));
	}

//	private void indexException(int index) {
//		throw new IllegalArgumentException(index + " doesn't correspond to an Artist");
//	}

	public String getArtistName(int index) {
		
			Optional<Artist> opArtist = getArtist(index);
			return opArtist.map(a -> a.getName()).orElse("unknown");
	}
}
