package dome;

public class CD extends Item
{
    private String artist;
    private int numofTracks;
    private int playingTime;
    private boolean gotIt = false;
    private String comment;

    public CD(String title,String artist,int numofTracks,int playingTime,String comment)
    {
        super(title);
        this.artist = artist;
        this.numofTracks = numofTracks;
        this.playingTime = playingTime;
        this.comment = comment;
    }

    public static void main(String[] args) {
        
    }

    public void print() {
    }
}
