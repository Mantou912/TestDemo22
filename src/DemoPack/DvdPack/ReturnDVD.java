package DemoPack.DvdPack;

import java.util.Scanner;

public class ReturnDVD {
    public void returnD(Library library) {
        Scanner input = new Scanner(System.in);
        System.out.println("-->�黹DVD");
        System.out.println("������黹��DVD���");
        int flag = input.nextInt();
        if (flag > library.flag) {
            System.out.println("���黹��DVD�����ڱ�ϵͳ");
        } else if (library.Status[flag - 1]) {
            System.out.println("��ǰDVD��ϵͳ�У������ظ��黹");
        } else {
            System.out.println("������黹����");
            int judge;
            boolean ff = false;
            do {
                judge = input.nextInt();
                if (judge > 31 || judge < library.Date[flag - 1]) {
                    System.out.println("�������ڲ��淶������������");
                } else {
                    judge -= library.Date[flag - 1];
                    library.Status[flag - 1] = true;
                    System.out.println("��֧��" + judge + "Ԫ");
                    ff = true;
                }
            } while (!ff);
            System.out.println("�黹�ɹ���");
        }
    }
}