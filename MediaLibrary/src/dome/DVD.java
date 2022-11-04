package dome;

public class DVD extends Item
{
    private String director;
    private int playingTime;
    private boolean gotIt = false;
    private String comment;

    public DVD(String director,String title,int playingTime,String comment) {
        super(title);
        this.comment = comment;
        this.director = director;
        this.playingTime = playingTime;
    }


    public static void main(String[] args) {

    }

    public void print() {
        //System.out.println(title+"");
    }
}
