package DemoPack.DvdPack;

import java.util.Scanner;

public class LendDVD {
    public void lend(Library library) {
        Scanner input = new Scanner(System.in);
        System.out.println("-->���DVD");
        System.out.println("��������Ҫ���DVD���");
        int flag = -1;
        do {
            int judge = input.nextInt();
            if (judge > library.flag) {
                System.out.println("û�и�DVD������������");
                continue;
            } else if (!library.Status[judge - 1]) {
                System.out.println("��DVD�ѱ����");
            } else {
                System.out.println("������������");
                flag = input.nextInt();
                if (flag > 31 || flag < 1) {
                    System.out.println("���ڲ��淶������������");
                } else {
                    library.Date[judge - 1] = flag;
                    library.Status[judge - 1] = false;
                    library.Time[judge - 1]++;
                }
            }
        } while (flag > 31 || flag < 1);
    }
}

