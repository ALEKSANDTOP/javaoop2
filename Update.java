import java.util.HashMap;
import java.util.Scanner;

public class Update implements QueueBehaviour {

    public HashMap<Integer, String> pack = new HashMap<>();
    Scanner s = new Scanner(System.in);

    public void addPack(){
        System.out.println("Введите номер товара: ");
        System.out.println("Введите товар который хотите отправить поссылки: ");
        pack.put(s.nextInt(), s.next());
    }

    public void getPack(){
        System.out.println("Введите номер товара: ");
        int n = s.nextInt();
        if (pack.containsKey(n)){
            System.out.println(pack.get(n));
            pack.remove(n);
        }
        else{
            System.out.println("Товар не найден.");
        }

    }

    @Override
    public void addHuman() {

    }

    @Override
    public void delHuman() {

    }
}
