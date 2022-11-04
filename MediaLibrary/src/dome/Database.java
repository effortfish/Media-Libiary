
package dome;
import java.util.ArrayList;

public class Database
{
    private ArrayList<Item> listItem = new ArrayList<>();

    public void add(Item item)
    {
        listItem.add(item);
    }

    public void list()
    {
       for(Item item : listItem)
       {
           item.print();
       }
    }

    public static void main(String[] args) {
        Database db = new Database();
        db.add(new CD("li","yue",20,50,"111"));
        db.add(new DVD("abc","www",222,"sss"));
        db.list();
    }
}
