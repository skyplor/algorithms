package datastructures.object_oriented_design.Q8_3_MusicJukeBox;

import java.util.ArrayList;
import java.util.List;

import datastructures.implementations.MyQueueImpl;

public class JukeBox {
    private List<Music> musicCollection;
    private MyQueueImpl<Music> musicQueue;
    private Music current;

    public JukeBox() {
	musicCollection = new ArrayList<Music>();
	generateMusicCollection();
    }

    private void generateMusicCollection() {
	Artiste singer = new Artiste();
	singer.setArtisteName("John");
	singer.setAge(25);
	Music m = new Music();
	m.setSinger(singer);
	m.setSongName("Fly to moon");
	m.setCategory(MusicCategory.Jazz);
	m.setDuration(5);
	musicCollection.add(m);

	singer = new Artiste();
	singer.setArtisteName("Mary");
	singer.setAge(40);
	m = new Music();
	m.setSinger(singer);
	m.setSongName("Break it!");
	m.setCategory(MusicCategory.HipHop);
	m.setDuration(7);
	musicCollection.add(m);

	singer = new Artiste();
	singer.setArtisteName("Pipe");
	singer.setAge(32);
	m = new Music();
	m.setSinger(singer);
	m.setSongName("Bubble");
	m.setCategory(MusicCategory.Classical);
	m.setDuration(2);
	musicCollection.add(m);

    }

    public void addMusicToPlayList(Music music) {
	if (musicQueue == null)
	    musicQueue = new MyQueueImpl<Music>();
	musicQueue.enqueue(music);
    }

    public void playNextMusic() {
	if (musicQueue != null && !musicQueue.isEmpty())
	    current = musicQueue.dequeue();
	else
	    current = null;
    }

    public List<Music> displayMusicCollection() {
	if (!musicCollection.isEmpty()) {
	    for (int i = 0; i < musicCollection.size(); i++) {
		Music m = musicCollection.get(i);
		System.out.println(i + ": " + m.toString());
	    }
	}
	return musicCollection;
    }

    public Music currentPlaying() {
	return current;
    }
}
