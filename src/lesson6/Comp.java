/*Создать класс компьютер.
Поля:
- процессор
- оперативка
- жесткий диск
- ресурс полных циклов работы (включений/выключений)
Методы:
- метод описание(вывод всех полей)
- метод включить, при включении может произойти сбой, при вызове метода рандом загадывает число (0 либо 1), вы вводите число с клавиатуры, если угадали комп включается, если нет сгорает.
Если комп сгорел, при попытке включить нужно выдать сообщение что ему конец
- выключить (аналогично включению)
- при превышении лимита ресурса комп сгорает
*/

package lesson6;
import java.util.Scanner;

public class Comp {
    public static void main(String[] args) {
        Block block = new Block("I5", "8gb", "250gb");
        System.out.println(block);
        Scanner sc = new Scanner(System.in);
        System.out.println("For turn on, enter number 0 or 1:");
        int random1 = sc.nextInt();
        sc.close();
        block.turnOn(random1);
    }
}

