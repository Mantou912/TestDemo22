package DemoPack.DvdPack;

import java.util.Scanner;

public class CheckDVD {
    public void check(Library library) {
        Scanner input = new Scanner(System.in);
        System.out.println("-->�鿴DVD");
        System.out.println("���\tName\tStatus\tDate\tTime");
        for (int i = 0; i < library.flag; i++) {
            System.out.print(i + 1 + "\t");
            System.out.print(library.Name[i] + "\t");
            if (library.Status[i]) {
                System.out.print("�ɽ�  \t");
            } else {
                System.out.print("�ѽ��\t");
            }
            System.out.print(library.Date[i] + "�� \t");
            System.out.print(library.Time[i] + "�� \t\n");
        }
    }
}