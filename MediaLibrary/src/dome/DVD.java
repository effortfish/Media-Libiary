package dome;

public class DVD extends Item
{
    private String director;

    public DVD(String director,String title,int playingTime,String comment) {
        super(title,playingTime,comment);
        this.director = director;
    }


    public static void main(String[] args) {

    }

    public void print() {
        System.out.print("DVD:");
        super.print();
        System.out.println(director);
    }
}
