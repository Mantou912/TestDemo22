package DemoPack.ScorePack;

import java.util.Scanner;

public class Score {
    Scanner cin = new Scanner(System.in);
    double scoreOfjava;
    double scoreOfmath;
    double scoreOfphy;

    public Score() {
        System.out.print("Java�ɼ���");
        scoreOfjava = cin.nextDouble();
        System.out.print("Math�ɼ���");
        scoreOfmath = cin.nextDouble();
        System.out.print("Physics�ɼ���");
        scoreOfphy = cin.nextDouble();
    }

    public double Average() {
        return (scoreOfjava + scoreOfmath + scoreOfphy) / 3;
    }

    public double Sum() {
        return scoreOfmath + scoreOfjava + scoreOfphy;
    }
}
