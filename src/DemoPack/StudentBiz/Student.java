package DemoPack.StudentBiz;

import java.util.Scanner;

public class Student {

    static int Number;

    String Name;
    int age;
    double score;

    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������������");
        Name = scanner.next();
        System.out.print("���������䣺");
        age = scanner.nextInt();
        System.out.print("������÷֣�");
        score = scanner.nextDouble();
        Number++;
    }

    public void show() {
        System.out.println(Name + " " + age + " " + score);
    }
}