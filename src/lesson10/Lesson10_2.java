/*2) Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в позиции 0 */
package lesson10;

public class Lesson10_2 {
    public static void main(String[] args) {
        String text = "Трагедия. Пушкина \"Моцарт и Сальери\". занимает всего десять страниц. О чем она?";
       char [] textChar = text.toCharArray() ;
       char saveChar = textChar[0];
       char replacement = textChar[3];
        for (int i = 0; i < textChar.length; i++) {
            if(textChar[i]==replacement){
                textChar[i]=saveChar;
            }
        }
        System.out.println(textChar);
    }
}
