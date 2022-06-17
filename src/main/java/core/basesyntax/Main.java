package core.basesyntax;

import java.util.Arrays;

public class Main {
    private static FigureSupplier fs = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        System.out.println(Arrays.toString(fillArrayWithShapes(figures)));
        draw(figures);
    }

    public static Figure[] fillArrayWithShapes(Figure[] figures) {
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = fs.getRandomFigure();
            } else {
                figures[i] = fs.getDefaultFigure();
            }
        }
        return figures;
    }

    public static void draw(Figure[] figures) {
        for (int i = 0; i < figures.length; i++) {
            figures[i].getInfoAboutFigure();
        }
    }

}
