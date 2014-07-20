package datastructures.object_oriented_design.Q8_3_MusicJukeBox;

public class Music {
    private String songName;
    private Artiste singer;
    private MusicCategory category;
    private int duration;

    /**
     * @return the songName
     */
    public String getSongName() {
	return songName;
    }

    /**
     * @param songName
     *            the songName to set
     */
    public void setSongName(String songName) {
	this.songName = songName;
    }

    /**
     * @return the singer
     */
    public Artiste getSinger() {
	return singer;
    }

    /**
     * @param singer
     *            the singer to set
     */
    public void setSinger(Artiste singer) {
	this.singer = singer;
    }

    /**
     * @return the category
     */
    public MusicCategory getCategory() {
	return category;
    }

    /**
     * @param category
     *            the category to set
     */
    public void setCategory(MusicCategory category) {
	this.category = category;
    }
    
    @Override
    public String toString() {
	return songName + " by " + singer.getArtisteName() + " - " + category.toString();
    }

    /**
     * @return the duration
     */
    public int getDuration() {
	return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(int duration) {
	this.duration = duration;
    }

}
