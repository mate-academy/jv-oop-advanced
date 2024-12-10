package core.basesyntax;

import core.basesyntax.figures.Figure;

public class Main {
    private static final int ARRAY_LENGTH = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_LENGTH];

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (i < ARRAY_LENGTH / 2) {
                figures[i] = new FigureSupplier().getRandomFigure();
            } else {
                figures[i] = new FigureSupplier().getDefaultFigure();
            }
            System.out.println("Figure: " + figures[i].getClass().getSimpleName() + ", area: "
                    + figures[i].getArea() + " sq. units," + figures[i].getFigureInfo()
                    + " color: " + figures[i].getColor().toLowerCase());
        }

    }
}
