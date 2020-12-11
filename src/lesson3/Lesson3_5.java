/*5)Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый, выведите массивы на экран в двух отдельных строках.
Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это значение оказалось больше
(либо сообщите, что их средние арифметические равны).*/
package lesson3;

public class Lesson3_5 {
    public static void main(String[] args) {
        int[] num1 = new int[5];
        int[] num2 = new int[5];
        int sumArray1 = 0;
        int sumArray2 = 0;

        for (int i = 0; i < 5; i++) {
            int random = (int) (Math.random() * 15);
            num1[i] = random;
        }
        for (int i = 0; i < 5; i++) {
            int random = (int) (Math.random() * 15);
            num2[i] = random;
        }
        System.out.print("First array ");
        for (int i = 0; i < 5; i++) {
            System.out.print(num1[i] + " ");
        }
        System.out.println();
        System.out.print("Second array ");
        for (int i = 0; i < 5; i++) {
            System.out.print(num2[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            sumArray1 = sumArray1 +num1[i] ;
        }
        for (int i = 0; i < 5; i++) {
        sumArray2 = sumArray2 +num2[i] ;
        }
        if(sumArray1>sumArray2){
            System.out.println("First array more");
        }else if(sumArray2>sumArray1){
            System.out.println("Second array more");
        }else{
            System.out.println("Both arrays are equals");
        }
}


}

