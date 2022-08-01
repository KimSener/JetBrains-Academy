Но маршрут тура проходит под множеством мостов, и есть вероятность, что автобус врежется в один из этих мостов. Можно ли узнать, произойдет ли это?
  
Первая строка ввода содержит высоту автобуса и количество мостов, под которыми проезжает автобус. Вторая строка содержит высоты этих мостов.
  
Вывести «Не будет краха», если все будет в порядке; иначе выведите «Врежется на мосту i » (где i — номер моста), в который врежется автобус.
  
Если высота моста равна высоте автобуса, то автобус разобьется.
  
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heightBus = scanner.nextInt();
        int numberBridge = scanner.nextInt();
        int badBridge = 0;
        for (int i = 1; i <= numberBridge; ++i) {
            int bridgeHeight = scanner.nextInt();
            if (bridgeHeight <= heightBus) {
                badBridge = i;
                break;
            }
        }
        if (badBridge != 0) {
            System.out.println("Will crash on bridge " + badBridge);
        } else {
            System.out.println("Will not crash");
        }


    }


}
