package AbelmazovVR;

import java.util.Scanner;

public class task2 {
    public static Scanner input = new Scanner(System.in);

    public static void goal1(){ //������� 1. � ���������� ��������: ��������� ���������� �������� �, � � ���� (� ��������) ��� ������� ��������� � � ��. ��������� ������� ��������.
        double S, a, b = 0;
        int dig =0;

        System.out.print("1. ���������� ������� ���������� ��������.\n");

        System.out.print("������� ������ ����������� ���������(��):");
        a = input.nextFloat();
        System.out.print("������� ������ ����������� ���������(��):");
        b = input.nextFloat();
        System.out.print("������� �������� ���� ��� ���������(� ��������):");
        dig = input.nextInt();

        if(a==b & dig ==90){
            System.out.print("��� �������!");
            S = a*b;
        }
        else S = ( 0.5 * (Math.pow(b,2)-Math.pow(a,2)) * Math.sin(Math.toRadians(dig)) * Math.sin(Math.toRadians(dig))  / Math.sin(Math.toRadians(dig * 2)));
        System.out.printf("������� ��������(���������� ��) = %f\n", S);
    }
    public static void goal2(){ //������� 2. C ���������� ��������: ����� ����� � � � ���������� ����� ����������  � ����������. ��������� � � �����,  �  � ���������. ����� �� ����� � ����������.
        System.out.print("2. ����� �����.\n");
        long a,b,d,fin =0;
        double c = 0;
        System.out.print("������� ���������� A(� ����������): ");
        a = input.nextInt();
        System.out.print("������� ���������� B(� ����������): ");
        b = input.nextInt();
        d = a *1048576;
        System.out.printf("���������� A(� ������) = %d\n", d);
        c = (float)b / 1024;
        System.out.printf("���������� B(� ����������) = %.3f\n", c);
        a+=b;
        a = a*1024;
        System.out.printf("����� ���������� A � B(� ����������) = %d\n", a);

    }
    public static void goal3(){ //������� 3. ���� �������������� �����. ����� ��������������������  ������ � ��������� ���� � ���� �����. ��������� ����� ������� �� �����.
        System.out.print("3. ����� �����.\n");
        int a1,a4,a3,a2 =0;
        double b=0;
        System.out.print("������� ������������ �����:\n");
        a1 = input.nextInt();
        a4 = a1%10;
        a1 = a1/10;
        System.out.printf("�������� �����:%d\n", a4);
        a3 = a1%10;
        a1 = a1/10;
        a2 = a1%10;
        a1 = a1/10;
        System.out.printf("������ �����:%d\n", a1);
        b = (a1+a4)/2.0;
        System.out.printf("������� �������������� ������� � ���������� �����:%.3f\n",b);
        System.out.printf("������ ����� �����:%d\n", a3);
        System.out.printf("������ �����:%d\n", a2);

    }
    public static void goal4(){ //������� 15. � ���������� �������� ������(� �����������) � ������� (� �����������) ������������. ��������� ��� ������� � ��������.
        System.out.print("4. ������� � �������� ������������.\n");
        int heigh=0;
        double side, heighsm,sqare=0;
        System.out.print("������� ������(� �����������):");
        heigh = input.nextInt();
        System.out.print("������� �������(� ���������� �����������):");
        sqare= input.nextDouble();
        side = Math.sqrt(sqare/(Math.sqrt(3)/4));
        System.out.printf("������� ������������ �����(��):%.3f\n", side);
        System.out.printf("�������� ������������ �����(��):%.3f\n", side*3);
    }
}
