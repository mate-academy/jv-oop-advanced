package core.basesyntax;

import java.util.Arrays;

public class Main {
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        System.out.println(Arrays.toString(fillArrayWithShapes(figures)));
        draw(figures);
    }

    private static Figure[] fillArrayWithShapes(Figure[] figures) {
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        return figures;
    }

    private static void draw(Drawable[] figures) {
        for (int i = 0; i < figures.length; i++) {
            figures[i].draw();
        }
    }
}
