package dome;

public class CD extends Item
{
    private String artist;
    private int numofTracks;


    public CD(String title,String artist,int numofTracks,int playingTime,String comment)
    {
        super(title,playingTime,comment);
        this.artist = artist;
        this.numofTracks = numofTracks;
    }

    public static void main(String[] args) {
        
    }

    public void print() {
    }
}
