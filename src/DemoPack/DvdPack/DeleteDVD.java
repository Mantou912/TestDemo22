package DemoPack.DvdPack;

import java.util.Scanner;

public class DeleteDVD {
    public void delete(Library library) {
        Scanner input = new Scanner(System.in);
        System.out.println("-->ɾ��DVD");
        System.out.print("������Ҫɾ����DVD���:");
        int flag = input.nextInt();
        if (flag > library.flag) {
            System.out.println("û�и�DVD");
        } else if (!library.Status[flag - 1]) {
            System.out.println("��DVD�ѽ��������ɾ��");
        } else {
            for (int i = flag - 1; i < library.flag; i++) {
                library.Name[i] = library.Name[i + 1];
                library.Status[i] = library.Status[i + 1];
                library.Date[i] = library.Date[i + 1];
                library.Time[i] = library.Time[i + 1];
            }
            library.flag--;
            System.out.println("��ɾ��");
        }
    }
}