package AbelmazovVR;

import java.util.Scanner;

public class task1 {

    public static void mat1(){
        double y,e,w,x,fin =0;
        Scanner input = new Scanner(System.in);

        System.out.println("������� �������� ��� ������� �������(�� ��� ������ ����� �������):");
        System.out.print("���������� y = ");
        y = input.nextFloat();
        System.out.print("���������� e = ");
        e = input.nextFloat();
        System.out.print("���������� w = ");
        w = input.nextFloat();
        System.out.print("���������� x = ");
        x = input.nextFloat();
        fin = (y * Math.sqrt(Math.abs(w)) * Math.tan(x) * w) / (1.85 * w + Math.pow(Math.sqrt(y*y), 3));
        System.out.printf("�������� ��������� = %f\n", fin);
    }
    public static void mat2(){
        double a,x,z =0;
        Scanner input = new Scanner(System.in);

        System.out.println("������� �������� ��� ������� �������(�� ��� ������ ����� �������):");
        System.out.print("���������� a = ");
        a = input.nextFloat();
        System.out.print("���������� x = ");
        x = input.nextFloat();
        z = ((a + Math.sqrt(Math.pow(a,3)) * Math.tan(x) + Math.pow(a,4)));
        System.out.printf("�������� ��������� = %.3f\n", z);
    }
}
