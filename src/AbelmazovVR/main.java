package AbelmazovVR;

import java.util.Scanner;

public class main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int choose=99;
        do {
            System.out.printf("1. ������� 1. ������ 1.\n");
            System.out.printf("2. ������� 1. ������ 2.\n");
            System.out.printf("3. ������� 2. ������ 1.\n");
            System.out.printf("4. ������� 2. ������ 2.\n");
            System.out.printf("5. ������� 2. ������ 3.\n");
            System.out.printf("6. ������� 2. ������ 4.\n");
            System.out.printf("0. �����\n");
            System.out.printf("�������� �������:");
            choose = input.nextInt();
            switch (choose) {
                case  (1):
                    task1.mat1();
                    break;
                case (2):
                    task1.mat2();
                    break;
                case (3):
                    task2.goal1();
                    break;
                case (4):
                    task2.goal2();
                    break;
                case (5):
                    task2.goal3();
                    break;
                case (6):
                    task2.goal4();
                    break;
                default:
                    break;
            }
        } while(choose!=0);
    }
}
