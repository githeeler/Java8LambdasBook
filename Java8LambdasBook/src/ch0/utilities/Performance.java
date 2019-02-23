package ch0.utilities;

import java.util.stream.Stream;

import static java.util.stream.Stream.concat;

public interface Performance {

    public String getName();

    public Stream<Artist> getMusicians();

    public default Stream<Artist> getAllMusicans(){
    	
    	return getMusicians().flatMap( artist -> {
    		return concat(Stream.of(artist), artist.getMembers());
    		});
    }
  
}
