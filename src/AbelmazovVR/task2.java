package AbelmazovVR;

import java.util.Scanner;

public class task2 {
    public static Scanner input = new Scanner(System.in);

    public static void goal1(){ //задание 1. С клавиатуры вводятся: основания равнобокой трапеции А, В и угол (в градусах) при большем основании В – АВ. Вычислить площадь трапеции.
        double S, a, b = 0;
        int dig =0;

        System.out.print("1. Нахождение площади равнобокой трапеции.\n");

        System.out.print("Введите длинну наименьшего основания(см):");
        a = input.nextFloat();
        System.out.print("Введите длинну наибольшего основания(см):");
        b = input.nextFloat();
        System.out.print("Введите величину угла при основании(в градусах):");
        dig = input.nextInt();

        if(a==b & dig ==90){
            System.out.print("Это квадрат!");
            S = a*b;
        }
        else S = ( 0.5 * (Math.pow(b,2)-Math.pow(a,2)) * Math.sin(Math.toRadians(dig)) * Math.sin(Math.toRadians(dig))  / Math.sin(Math.toRadians(dig * 2)));
        System.out.printf("Площадь трапеции(квадратные см) = %f\n", S);
    }
    public static void goal2(){ //задание 2. C клавиатуры вводятся: целые числа А и В выражающие объем информации  в мегабайтах. Перевести А в байты,  В  в гигабайты. Найти их сумму в килобайтах.
        System.out.print("2. Сумма Кбайт.\n");
        long a,b,d,fin =0;
        double c = 0;
        System.out.print("Введите переменную A(в мегабайтах): ");
        a = input.nextInt();
        System.out.print("Введите переменную B(в мегабайтах): ");
        b = input.nextInt();
        d = a *1048576;
        System.out.printf("Переменная A(в байтах) = %d\n", d);
        c = (float)b / 1024;
        System.out.printf("Переменная B(в гигабайтах) = %.3f\n", c);
        a+=b;
        a = a*1024;
        System.out.printf("Сумма переменных A и B(в килобайтах) = %d\n", a);

    }
    public static void goal3(){ //задание 3. Дано четырехзначное число. Найти среднеарифметическое  первой и последней цифр в этом числе. Остальные цифры вывести на экран.
        System.out.print("3. Сумма чисел.\n");
        int a1,a4,a3,a2 =0;
        double b=0;
        System.out.print("Введите четырёхзначое число:\n");
        a1 = input.nextInt();
        a4 = a1%10;
        a1 = a1/10;
        System.out.printf("Четвёртое число:%d\n", a4);
        a3 = a1%10;
        a1 = a1/10;
        a2 = a1%10;
        a1 = a1/10;
        System.out.printf("Первое число:%d\n", a1);
        b = (a1+a4)/2.0;
        System.out.printf("Среднее арифметическое первого и последнего чисел:%.3f\n",b);
        System.out.printf("Третье число число:%d\n", a3);
        System.out.printf("Второе число:%d\n", a2);

    }
    public static void goal4(){ //задание 15. С клавиатуры вводятся высота(в миллиметрах) и площадь (в сантиметрах) треугольника. Вычислить его стороны и периметр.
        System.out.print("4. стороны и периметр треугольника.\n");
        int heigh=0;
        double side, heighsm,sqare=0;
        System.out.print("Введите высоту(в миллиметрах):");
        heigh = input.nextInt();
        System.out.print("Введите площадь(в квадратных сантиметрах):");
        sqare= input.nextDouble();
        side = Math.sqrt(sqare/(Math.sqrt(3)/4));
        System.out.printf("Стороны треугольника равны(см):%.3f\n", side);
        System.out.printf("Периметр треугольника равен(см):%.3f\n", side*3);
    }
}
