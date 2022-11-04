
package dome;
import java.util.ArrayList;

public class Database
{
    private ArrayList<CD> listCD = new ArrayList<CD>();
    private ArrayList<DVD> listDVD = new ArrayList<DVD>();

    public void add(CD cd)
    {
        listCD.add(cd);
    }

    public void add(DVD dvd)
    {
        listDVD.add(dvd);
    }

    public void list()
    {
        for(CD cd : listCD)
        {
            cd.print();
        }
        for(DVD dvd : listDVD)
        {
            dvd.print();

        }
    }

    public static void main(String[] args) {
        Database db = new Database();
        db.add(new CD("li","yue",20,50,"111"));
        db.add(new DVD("abc","www",222,"sss"));
        db.list();
    }
}
