package DemoPack.StudentBiz;

import java.util.Scanner;
public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentBiz studentBiz = new StudentBiz();
        studentBiz.showName();

        int start, end;
        String name;
        System.out.print("������ʼλ�ã�");
        start = scanner.nextInt();
        System.out.print("�������λ�ã�");
        end = scanner.nextInt();
        System.out.print("����������");
        name = scanner.next();
        if (studentBiz.searchName(start, end, name)) {
            System.out.println("Succeed!");
        } else {
            System.out.println("Failed!");
        }

//        Student[] student = new Student[2];
//        for (int i = 0; i < student.length; i++) {
//            student[i] = new Student();
//        }
//        for (Student x : student) {
//            x.show();
//        }
    }
}
