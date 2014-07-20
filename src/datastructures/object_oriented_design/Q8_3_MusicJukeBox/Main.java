package datastructures.object_oriented_design.Q8_3_MusicJukeBox;

import java.util.List;

/**
 * Design a musical jukebox using object-oriented principles.
 * 
 * @author Sky
 * 
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	JukeBox jb = new JukeBox();
	List<Music> musicList = jb.displayMusicCollection();
	jb.addMusicToPlayList(musicList.get(0));
	jb.addMusicToPlayList(musicList.get(2));
	do {
	    jb.playNextMusic();
	    if (jb.currentPlaying() != null) {
		System.out.println("Currently playing: " + jb.currentPlaying().getSongName());
		try {
		    Thread.sleep(jb.currentPlaying().getDuration() * 1000);
		} catch (InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
	    }
	} while (jb.currentPlaying() != null);
    }

}
