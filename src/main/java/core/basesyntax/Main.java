package core.basesyntax;

import java.util.Random;

public class Main {
    private static int MAXFIGURESNUMBER = 20;

    public static void main(String[] args) {
        Random rand = new Random();
        FigureGenerator fg = new FigureGenerator();
        Figures[] figures = new Figures[rand.nextInt(MAXFIGURESNUMBER)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = fg.get();
        }
        for (Figures figure : figures) {
            figure.printInfo();
        }
    }
}
