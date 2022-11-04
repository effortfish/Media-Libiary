package dome;

public class DVD {
    private String title;
    private String director;
    private int playingTime;
    private boolean gotIt = false;
    private String comment;

    public DVD(String director,String title,int playingTime,String comment) {
        super();
        this.comment = comment;
        this.director = director;
        this.playingTime = playingTime;
        this.title = title;
    }

    public DVD() {
    }

    public static void main(String[] args) {

    }

    public void print() {
        System.out.println(title+"");
    }
}
