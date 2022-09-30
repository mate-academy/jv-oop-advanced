package core.basesyntax;

import java.util.Random;

public class Main {
    public static final int COUNT_FIGURES = 6;

    public static void main(String[] args) {

        Figure[] figures = new Figure[COUNT_FIGURES];
        FigureSuplier figureSuplier = new FigureSuplier(new Random(), new ColorSuplier());
        for (int i = 0; i < figures.length; i++) {
            figures[i] = i % 2 == 0 ? figureSuplier.getDefaultFigure()
                    : figureSuplier.getRandomFigure();
        }
        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }

    }
}
