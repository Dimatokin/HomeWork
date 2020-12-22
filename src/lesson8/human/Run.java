/*2) По аналогии с первым задание делаем след. задание.
Интерфейсы:
- Куртка
- Штаны
- Обувь
в каждом интерфейсе есть 2 метода (надеть и снять)
Делаем несколько реализации каждого интерфейса.
Создаём класс человек:
У человека поля:
-имя
-куртка
-штаны
-обувь
У человека есть 2 метода:
- одеться(вызываются методы надеть у всех вещей)
- раздеться (вызываются методы снять у всех вещей)
*/
package lesson8.human;
import lesson8.human.jackets.*;
import lesson8.human.pants.*;
import lesson8.human.shoes.*;

public class Run  {
    public static void main(String[] args) {
        Human human1 = new Human("Dima", new SweatShirt(), new SweatPants(), new Sandals());
        human1.dressUp();
        human1.dressOff();
    }
}
