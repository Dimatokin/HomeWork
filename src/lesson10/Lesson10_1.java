/*1) Вырезать подстроку из строки начиная с первого вхождения символа(А) до,последнего вхождения сивола(B).*/
package lesson10;

public class Lesson10_1 {
    public static void main(String[] args) {
        String text = "Трагедия. Пушкина \"Моцарт и Сальери\". занимает всего десять страниц. О чем она?";
        String subString = text.substring(text.indexOf('Т'),text.lastIndexOf('т'));
        System.out.println(subString);

    }
}
