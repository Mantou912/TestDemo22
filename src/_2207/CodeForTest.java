package _2207;

import java.util.Scanner;

public class CodeForTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //1������3���࣬ÿ����4��ѧ����ƽ�����Լ�3�����е���߷��Ƕ���(ƽ����5����߷�10)
//        int[][] score = new int[3][4];
//        int[] ave = new int[3];
//        int maxS = 0;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                score[i][j] = input.nextInt();
//                ave[i] += score[i][j];
//                maxS = Math.max(score[i][j], maxS);
//            }
//            ave[i] /= 4;
//        }

        //2����дð������ĳ���(15)
//        int[] arr = {15, 56, 85, 2, 0, 3, 59, 47, 98, 85, -12};
//        int len = arr.length;
//        for (int i = 0; i < len - 1; i++) {
//            for (int j = 0; j < len - i - 1; j++) {
//                if (arr[j + 1] < arr[j]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        for (int x : arr) {
//            System.out.print(x + " ");
//        }

        //3�������������������ӡһ�����������Ρ�10��
//        int flag = input.nextInt();
//        for (int i = 0; i < flag; i++) {
//            for (int j = flag - 1; j > i; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < 2 * (i + 1) - 1; j++) {
//
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

        //4�������ַ�����ָ��λ��
//        System.out.print("ԭ�ַ����У�");
//        char[] chars = {'a', 'b', 'c', 'e', 'f', 'p', 'u', 'z', ' '};
//        for (char aChar : chars) {
//            System.out.print(aChar + " ");
//        }
//        System.out.print("\n��������ַ��ǣ�");
//        char flag = input.next().charAt(0);
//        System.out.print("�����ַ����±��ǣ�");
//        int locate = input.nextInt();
//        for (int i = chars.length - 1; i > locate; i--) {
//            char temp = chars[i];
//            chars[i] = chars[i - 1];
//            chars[i - 1] = temp;
//        }
//        chars[locate] = flag;
//        for (char aChar : chars) {
//            System.out.print(aChar + " ");
//        }

//        System.out.println("\t********\t&&&&1234^^^");
//        System.out.println("\t********\t&&&&\t^^^");
//        System.out.println("\t********\t&&&\t^^^");
//        System.out.println("\t********\t&&\t^^^");
//        System.out.println("\t*******\t&\t^^^");
//        System.out.println("\tһ��������\tһ����\t^^^");
//        System.out.println("\tһ������\tһ����\t^^^");
//        System.out.println("\tһ����\tһ����\t^^^");
//        System.out.println("\tһ��\tһ����\t^^^");
//        System.out.println("\tһ\tһ����\t^^^");

//        System.out.println("""
//                \t********\t&&&&1234^^^
//                \t********\t&&&&\t^^^
//                \t********\t&&&&\t^^^
//                \t********\t&&&\t^^^
//                \t*******\t&\t^^^
//                \tһ��������\tһ����\t^^^
//                \tһ������\tһ����\t^^^
//                \tһ����\tһ����\t^^^
//                \tһ��\tһ����\t^^^
//                \tһ\tһ����\t^^^
//                """);
    }
}
