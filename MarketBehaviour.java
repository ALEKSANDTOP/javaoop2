import java.util.HashMap;
import java.util.Scanner;

public class MarketBehaviour implements QueueBehaviour{

    public HashMap<Integer,String> name = new HashMap<>();
    public Scanner s = new Scanner(System.in);


    @Override
    public void addPack() {

    }

    @Override
    public void getPack() {

    }

    public void addHuman() {
        System.out.println("Введите ваше Имя: ");
        name.put(name.size()+1, s.next());
    }

    public void delHuman(){
        System.out.println("Введите очередь в которой стоит человек, которого вы хотите удалить");
        name.remove(s.nextInt());
    }

    public HashMap<Integer, String> getName() {
        System.out.println(name);
        return name;
    }
}
