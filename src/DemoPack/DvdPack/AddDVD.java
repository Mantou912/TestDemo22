package DemoPack.DvdPack;

import java.util.Scanner;

public class AddDVD {
    public void add(Library library) {
        Scanner input = new Scanner(System.in);
        if (library.flag != library.full) {
            System.out.println("-->����DVD");
            System.out.println("������DVD���ƣ�");
            library.Name[library.flag] = input.next();
            library.Status[library.flag] = true;
            library.Time[library.flag] = 0;
            System.out.println("������" + library.Name[library.flag] + "���ɹ���");
            library.flag++;
        }
    }
}
