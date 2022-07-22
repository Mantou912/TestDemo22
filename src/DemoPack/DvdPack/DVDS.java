package DemoPack.DvdPack;

import java.util.Scanner;

public class DVDS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Welcome welcome = new Welcome();
        boolean flag = welcome.welcome();       //Ĭ��Ϊtrue

        Library library = new Library();        //DVD��Ϣ
        StartPage startPage = new StartPage();  //��ӭҳ
        AddDVD addDVD = new AddDVD();           //1������DVD
        CheckDVD checkDVD = new CheckDVD();     //2���鿴DVD
        DeleteDVD deleteDVD = new DeleteDVD();  //3��ɾ��DVD
        LendDVD lendDVD = new LendDVD();        //4�����DVD0
        ReturnDVD returnDVD = new ReturnDVD();  //5���黹DVD
        ExitDVD exitDVD = new ExitDVD();        //6���˳�ϵͳ

        library.Name[0] = "��������";
        library.Status[0] = false;
        library.Date[0] = 15;
        library.Time[0] = 5;

        System.out.println("��ӭʹ������DVD������");

        int chs;
        do {
            startPage.Welcome();
            System.out.print("��ѡ��");
            chs = input.nextInt();
            switch (chs) {
                case 0 -> exitDVD.exit();
                case 1 -> addDVD.add(library);
                case 2 -> checkDVD.check(library);
                case 3 -> deleteDVD.delete(library);
                case 4 -> lendDVD.lend(library);
                case 5 -> returnDVD.returnD(library);
            }
        } while (chs != 0);
    }
}