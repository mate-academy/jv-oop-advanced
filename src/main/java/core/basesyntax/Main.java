package core.basesyntax;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Figure[] randomFigurs = new FigureSupplier().getRandomFigure();
        String[] figurs = new String[6];
        Figure[] figureDefault = new FigureSupplier().getDefaultFigure();
        for (int i = 0; i < figurs.length; i++) {
            figurs[i] = randomFigurs[i].getArea();
            if (figurs.length / 2 <= i) {
                figurs[i] = figureDefault[i - figurs.length / 2].getArea();
            }
        }
        System.out.println(Arrays.toString(figurs));
    }
}
