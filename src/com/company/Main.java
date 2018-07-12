package com.company;

public class Main {

    public static void main(String[] args) {


        //==================================================Пятый урок

/*        System.out.println("hi");*/




// =========================================================Первый урок
         /*        System.out.println("Введите фразу: ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
       System.out.println("Вы ввели " + s);*/

       /* int read = System.in.read();
        System.out.println("read = " + (char)++read);*/

        //=================================================Второй урок

/*
        float  a = 0.5f;
        System.out.println(0.3f + 0.4f);
        System.out.println((float)(0.3 + 0.4));

        System.out.println(.2 +.1);              // Домашнее задание, почему такой результат а не 0.3
        System.out.println();

        System.out.println(12.0/0);
        System.out.println(12/-0.0);
        System.out.println(-0.0==0.0);
        System.out.println(Double.NEGATIVE_INFINITY);
*/

/*
char a = 'a';
        System.out.println("a = " + a);
        System.out.println("\u2122");
*/

/*char c1 = '1';
char c2 = '\u0031';
char c3 = 49;
        System.out.println('\u0031');
        System.out.println(c2);

        System.out.println(c1 + c2 + c3);*/



/*char x1 = 88;
char x2 = 'Y';
        System.out.print("x1 and x2: ");
        System.out.println(x1 + " " +x2);*/

 /*       for (char i = 'a'; i <= 'z'; i++) {
            System.out.println("i = " + i);
        }*/

/*String a = "hi";
String b = new String ("hi");
        System.out.println( a == b);
        System.out.println( a.equals(b));*/

//        System.out.println("4/2=" + 4/2== "4/2=2");   //Домашнее задание, почему срабатывает == в этом случае, а не иквалс

/*   byte a = 50;
   byte b = 99;
   short c = (byte) (a + b);
        System.out.println("c = " + c);

        byte b1 = 50;
        byte b2 = -99;
       b1 +=b2;
        System.out.println("b1=" +b1);*/

/*int a = 100;
        System.out.println(a>101? 10:100);*/

/*
        if (false) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
*/
/*
        String position = "Unnown";
       Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        if (age >= 3 && age <= 6) {
            position = "Kinder garden";
        } else if (age >= 7 && age <= 17) {
            position = "School";
        } else if (age >= 18 && age <= 23) {
            position = "Univercity";
        } else if (age >= 24 && age <= 60) {
            position = "Work";
        } else if (age >= 60 && age <= 80) {
            position = "Retired";
        } else {
            position = "Hospital";

        }System.out.println("Your current position is: " + position);
*/

     /*   System.out.println("Please enter day's number from 1 to 7: ");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("This  is a working day");
                break;
            case 6:
            case 7:
                System.out.println("This is a weekend");
                break;
            default:
                System.out.println("Hi");
        }*/
//====================================================================================Третье занятие

       /*for (String arg : args) {
            System.out.println(arg);
        }*/



/*        int i = 1;
        while (i <=10) {
            System.out.println(i);
            i++;
        }*/


/*        for (int i = 0; i <=10; i++) {
            System.out.println("i = " + i);
        }*/

    /*    int k=10;
        for (int i = k; i >= 0; i--) {
            System.out.println("k = " + i);
        }*/


        //    for (int i = 10; i >= 0; i--, System.out.println("i = " + i));

/*        int i = 10;
        do {
            System.out.println(i);
        } while (i > 10);*/

// вывести четные числа от 1 до 100
/*        int k = 100;
        for (int i = 1; i < k; i++)

            if (i % 2 == 0) {
                System.out.println(i);
            }*/

/*
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }i++;
        }
*/

/*        for (int i = 0; i < 10; i++) {
            if(i%2==0) continue;
            System.out.println(i);
        }*/

//===================================Преобразование типов
/*        String strInt = "123";
        String strDouble = "123.45";
        int x;
        double y;
        x = Integer.parseInt(strInt);
        y = Double.parseDouble(strDouble);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        strInt = String.valueOf(x + 1);
        strDouble = String.valueOf(y + 1);
        System.out.println("strInt = " + strInt);
        System.out.println("strDouble = " + strDouble);
        String str;
        str = "num=" + 345;
        System.out.println("str = " + str);*/

/*        System.out.println(Integer.toString(262));
        System.out.println(Integer.toBinaryString(262));
        System.out.println(Integer.toHexString(267));
        System.out.println(Integer.toOctalString(267));*/

/*        int[] a = {1,2,3,4,5,6,7,8};
        int[] a1 = new int[5];
//       for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
//
//        for (int i : a) {
//            System.out.println(i);
//        }

//        System.out.println(Arrays.toString(a));
        Arrays.stream(a).forEach(System.out::println);*/


 /*       int[][] a = {{1, 2, 3, 4, 5, 6,},
                {7, 89, 10, 11, 12},
                {13, 14, 15, 16, 17, 18}};
        System.out.println(Arrays.deepToString(a));*/
/*
 int sum = 0;
 int nums [] [] = new int [3] [5];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                nums [i][j] = (i+1)*(j+1);

        for (int[] x : nums) {
            int sum1 = 0;
            for (int y : x) {
                System.out.println("y = " + y);
                sum +=y; sum1 +=y;
            }          System.out.println("Sum of the string = " + sum1);
        }

        System.out.println("sum = " + sum);*/

    }
}
