package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {

/*Ввести n чисел с консоли.
1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.
3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.
4. Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.
5. Найти количество чисел, содержащих только четные цифры, а среди них количество чисел с равным числом четных и нечетных цифр.
6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
7. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
8. Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.
9.Ввести с консоли n-размерность матрицы numbers [n] [n]. Задать значения элементов матрицы в интервале значений от -n до n с помощью датчика случайных чисел.
9.1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений.
9.2. Выполнить циклический сдвиг заданной матрицы на k позиций вправо (влево, вверх, вниз).
9.3. Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.
9.4. Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки.
9.5. Повернуть матрицу на 90 (180, 270) градусов против часовой стрелки.
9.6 Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.
9.7. Уплотнить матрицу, удаляя из нее строки и столбцы, заполненные нулями.
9.8. Преобразовать строки матрицы таким образом, чтобы элементы, равные нулю, располагались после всех остальных.*/


        System.out.println("Сколько чисел вы хотите ввести: ");
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        int[] myArray = new int[amount];
        for (int i = 0; i < amount; i++) {
            System.out.println("Введите целое число: ");
            myArray[i] = scan.nextInt();
        }
//        System.out.println(Arrays.toString(myArray));

        String[] numbers = new String[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            numbers[i] = String.valueOf(myArray[i]);
        }


//        System.out.println("numbers = " + Arrays.toString(numbers));


//1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

     /*   String tmpValue0;
        for (int i = numbers.length - 1; i >= 0; i--)
            for (int j = 0; j < i; j++) {
                if (numbers[j].length() > numbers[j + 1].length()) {
                    tmpValue0 = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmpValue0;
                }
            }
        System.out.println("Минимальное число = " + numbers[0] + " Количество знаков: " + numbers[0].length());
        System.out.println("Максимальное число = " + numbers[numbers.length - 1] +
                " Количество знаков: " + numbers[numbers.length - 1].length());*/

        //======================================================================
        //       2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.


/*        String tmpValue;
        for (int i = numbers.length - 1; i >= 0; i--)
            for (int j = 0; j < i; j++) {
                if (numbers[j].length() > numbers[j+1].length()) {
                    tmpValue = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = tmpValue;
                }
            }
        System.out.println("Отсортированые по возрастанию числа = " + Arrays.toString(numbers));*/
        //========================================================================

//        3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.

    /*    String tmpValue1;
        for (int i = numbers.length - 1; i >= 0; i--)
            for (int j = 0; j < i; j++) {
                if (numbers[j].length() > numbers[j+1].length()) {
                    tmpValue1 = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = tmpValue1;
                }
            }
        System.out.println("Отсортированые по возрастанию числа = " + Arrays.toString(numbers));
        int maxLength = numbers[numbers.length -1].length();
     double avgLength = maxLength / 2;
        System.out.println("Средняя длина числа = " + avgLength + " знаков.");
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i].length() > avgLength){
                System.out.println("Длина значения " + numbers[i] +
                        " больше средней и равна: " + numbers[i].length() + " знака");
            }
        */
//==============================================================================

        //4. Найти число, в котором число различных цифр минимально.
        // Если таких чисел несколько, найти первое из них.

        for (int i = 0; i < numbers.length; i++) {
            int elemLenth = numbers[i].length();
//            for (int j = 0; j < elemLenth; j++) {
//                numbers[i].toCharArray();
//                System.out.println(numbers[j]);
//            }
            String pretendent66 = "";
            String pretendent33 = "";
            if (elemLenth == 2) {
                char a1, b2;
                a1 = numbers[i].charAt(0);
                b2 = numbers[i].charAt(1);
                if (a1 == b2)
                    System.out.println("Перывый элемент с минимальным числом разных цифр: " + numbers[i]);
            }
            if (elemLenth == 3) {
                char a1, b2, c3;
                int count3 = 0;
                a1 = numbers[i].charAt(0);
                b2 = numbers[i].charAt(1);
                c3 = numbers[i].charAt(2);
                if (a1 == b2)
                    count3++;
                if (a1 == c3)
                    count3++;
                if (b2 == c3)
                    count3++;
                if (count3 == 3) {
                    System.out.println("Перывый элемент с минимальным числом разных цифр: " + numbers[i]);
                } else if (count3 == 2) {
                    pretendent66 = numbers[i];
                } else if (count3 == 1) {
                    pretendent33 = numbers[i];
                }

            }
            if (pretendent66.length() == 3) {
                System.out.println("Перывый элемент с минимальным числом разных цифр: " + pretendent66);
            } else if (pretendent33.length() == 2) {
                System.out.println("Перывый элемент с минимальным числом разных цифр: " + pretendent33);
            } else if (pretendent33.length() == pretendent66.length())
                System.out.println("Нет чисел с одинковыми цифрами.");


      /*      if (elemLenth == 4) {
                char a, b, c, d;
                a = numbers[i].charAt(0);
                b = numbers[i].charAt(1);
                c = numbers[i].charAt(2);
                d = numbers[i].charAt(3);
                if (a == b && a == c && b == c) {
                    if ()
                        System.out.println("Перывый элемент с минимальным числом разных цифр: " + numbers[i]);
                }
            }
            if (elemLenth == 3) {
                char a, b, c;
                a = numbers[i].charAt(0);
                b = numbers[i].charAt(1);
                c = numbers[i].charAt(2);
                if (a == b && a == c && b == c)
                    System.out.println("Элемент с минимальным чимлом разных цифр: " + numbers[i]);
            }
            if (elemLenth == 3) {
                char a, b, c;
                a = numbers[i].charAt(0);
                b = numbers[i].charAt(1);
                c = numbers[i].charAt(2);
                if (a == b && a == c && b == c)
                    System.out.println("Элемент с минимальным чимлом разных цифр: " + numbers[i]);
            }


        }*/


            //==============================================================================
            //      6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.


//Работает, но странно
/*        String myChoise;
        for (int i = numbers.length - 1; i >= 0; i--) {
            int range = numbers[i].length();
            if (range > 3) {
                        for (int j = 0; j <= range - 2; j++) {
                            if (numbers[i].charAt(j)< (numbers[i].charAt(j + 1))) {
                                myChoise = numbers[i];

                                System.out.println("Число в котором цифры идут по возрастанию: " + myChoise);
                            }
                        }
            }
        }*/


    /*    for (int i = numbers.length - 1; i >= 0; i--) {
            int range = numbers[i].length();
            if(range > 3) {
            for(int j = 0; j <= range-2; j++) {
                if (numbers[i].charAt(j) == (numbers[i].charAt(j + 1) - 1)) {
                }
            }
                String myDigit = numbers[i];
                System.out.println("Число в котором цифры идут по возрастанию: " + myDigit);
            }
        }*/


        }

    }

}


