/*Создать класс Товар, поля:
• id(целое число)
• name(строка)
• price(целое число)
Создать класс Магазин, поля:
• Список товаров (изначально пустой)
методы:
• добавить товар(принимает объект товара и добавляет его в список
товаров). При попытке добавить товар с id уже существующем в списке,
вставка производится не должна
• получить все товары(метод ВОЗВРАЩАЕТ список всех товаров в
магазине)
• удалить товар (метод принимает id товара и удаляет из списка товар с
соответствующим id)
• редактировать товар(принимает объект товара и редактирует им список
товаров)
Обратите внимание что id товара и индекс товара в списке — это разные вещи,
не перепутайте. Id товара — это поле вашего объекта, вы при его создании его
задаете. А индекс товара в списке товаров, это по сути его порядковый номер в
списке(начинается с 0).
(обязательное): В main:
• создаем объект магазина
• создаем пару тройку товаров и добавляем эти товары в магазин
• получаем список товаров из магазина, сортируем по цене(по
возрастанию) и выводим в консоль.
• удаляем один товар
• получаем список товаров из магазина, сортируем по порядку
добавления(последние добавленные в начале) и выводим в консоль.
• редактируем один товар
• получаем список товаров и выводим в консоль
Если вы выполнили обязательную часть, можете переходить к более
интересному пункту. Для работы с магазином используем не вызовы методов из
main(все что о этого написали можно удалить:)))). Разрабатываем консольное
меню для работы с магазином.

Алгоритм работы магазина:
• Выберите действие:
◦ Вывод всех товаров. При выборе этого действия, было бы отлично
спросить у пользователя в какой сортировке вывести:
▪ по цене(возрастание)
▪ по цене(убывание)
▪ по добавлению(сначала новые, потом более старые)
После выбора сортировки, из магазина получаете список товаров,
сортируете их таким образом как выбрал пользователь и выводите в
консоль.
◦ Добавление товара. При выборе этого действия:
▪ пользователь должен ввести из консоли 3 параметра (id, название,
цена).
▪ создаем объект товара(поля заполняются данными введенными
пользователем)
▪ добавляем товар в магазин(напоминаю, если в списке товаров уже
существует товар с таким id, то новый товар не добавляется)
◦ Удаление товара. При выборе этого действия:
▪ пользователь вводит id товара который нужно удалить
▪ удаляем товар из магазина
◦ Редактирование товара. При выборе этого действия:
▪ пользователь должен ввести из консоли 3 параметра (id товара для
редактирования, новое название, новую цену).
▪ создаем объект товара(поля заполняются данными введенными
пользователем)
▪ редактируем товар в магазине
◦ Выход. При выборе этого действия, работа магазина завершается.
В main создаем объект вашей консольной менюшки(приложения,
Application). И вызываем метод старт. Магазин должен работать по замкнутому
циклы, до тех пор пока пользователь в меню не выберет выход. Естественно
незабываем про обработку всевозможных ошибок. Успехов!))*/
package lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Shop {

    ArrayList<Product<Integer, String, Integer>> listProduct = new ArrayList<>();

    public void addProduct(Product<Integer, String, Integer> product) {
        listProduct.add(product);
        for (int i = 0; i < listProduct.size(); i++) {
            for (int j = i + 1; j < listProduct.size(); j++) {
                if (listProduct.get(i).getId().equals(listProduct.get(j).getId())) {
                    listProduct.remove(j);
                }
            }
        }
    }

    public void getAllProducts() {
        for (Product<Integer, String, Integer> list : listProduct) {
            System.out.println(list);
        }
    }

    public void removeProduct(int id) {
        for (int i = 0; i < listProduct.size(); ) {
            if (listProduct.get(i).getId().equals(id)) {
                listProduct.remove(i);
                break;
            } else {
                System.out.println("Product with this id:" + id + " isn't exist ");
                break;
            }
        }
    }

    public void editProduct(Product<Integer, String, Integer> product) throws IOException {
        for (int i = 0; i < listProduct.size(); ) {
            if (!listProduct.get(i).getName().equals(product.getName())) {
                System.out.println("Product with this name: " + product.getName() + " didn't exist");
            }
            break;
        }
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getName().equals(product.getName())) {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Entering the new product parameters: ");
                System.out.println("Id: ");
                Integer newId = Integer.parseInt(br.readLine());

                System.out.println("Name: ");
                String newName = br.readLine();

                System.out.println("Price: ");
                Integer newPrice = Integer.parseInt(br.readLine());

                product.setId(newId);
                product.setName(newName);
                product.setPrice(newPrice);
                System.out.println("Product was edit.");
            }
        }
    }

    public void sortingThePriceByIncrease() {
        listProduct.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));
        getAllProducts();
    }
//    public void sortingThePriceByDescending(){
//        listProduct.sort((p1,p2) -> p1.getPrice().compareTo(p2.getPrice()));

//    }
}



