package DemoPack.DvdPack;

import java.util.Scanner;

public class Welcome {

    String[] Id = new String[10];
    String[] Pw = new String[10];

    public boolean welcome() {
        Scanner input = new Scanner(System.in);
        System.out.print("�������˺ţ�");
        String id = input.next();
        String pw;
        boolean flag = false;
        for (int i = 0; i < Id.length; i++) {
            if (id.equals(Id[i])) {
                boolean flag2 = false;
                do {
                    System.out.print("���������룺");
                    pw = input.next();
                    if (pw.equals(Pw[i])) {
                        return true;
                    } else {
                        System.out.print("����������������룺");
                    }
                } while (!flag2);
            }
        }
        if (!flag) {
            System.out.print("��û���˺ţ�������Ҫע����˺�����");
            for (int i = 0; i < Id.length; i++) {
                if (Id[i] == null) {
                    Id[i] = input.next();
                    System.out.print("����ע�����˺ŵ����룬���μǣ�");
                    Pw[i] = input.next();
                    return true;
                }
            }
        }
        return true;
    }
}