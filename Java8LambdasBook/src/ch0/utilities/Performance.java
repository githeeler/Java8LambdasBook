package ch0.utilities;

import static java.util.stream.Stream.concat;

import java.util.stream.Stream;

public interface Performance {

    public String getName();

    public Stream<Artist> getMusicians();

    public default Stream<Artist> getAllMusicans(){
    	
    	return getMusicians().flatMap( artist -> {
    		return concat(Stream.of(artist), artist.getMembers());
    		});
    }
  
}
