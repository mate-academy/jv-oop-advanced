package core.basesyntax;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Figure randomFigurs = new FigureSupplier().getRandomFigure();
        String[] figurs = new String[2];
        Figure circle = new FigureSupplier().getDefaultFigure();
        for (int i = 0; i < figurs.length; i++) {
            figurs[i] = randomFigurs.drawable();
            if (figurs.length / 2 == i) {
                figurs[i] = circle.drawable();
            }
        }
        System.out.println(Arrays.toString(figurs));
    }
}
