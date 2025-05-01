package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;

    public Figure getRandomFigure(){

        ColorSupplier supplier = new ColorSupplier();
        Random random = new Random();
        int[] value1 = new int[NUMBER_OF_FIGURES];
        for (int i = 0; i < value1.length; i++) {
            value1[i] = random.nextInt(10) + 1;
        }
        String[] colors = new String[NUMBER_OF_FIGURES];
        for (int i = 0; i < colors.length; i++) {
            colors[i] = supplier.getRandomColor();
        }

        Figure[] figure = new Figure[NUMBER_OF_FIGURES];
        figure[0] = new Square(value1[0], colors[0]);
        figure[1] = new Circle(value1[1], colors[1]);
        figure[2] = new Rectangle(value1[2], value1[2] + 10, colors[2]);
        figure[3] = new RightTriangle(value1[3], value1[3], colors[3]);
        figure[4] = new IsoscelesTrapezoid(value1[4], value1[4] + 6, value1[0], colors[4]);
        return figure[random.nextInt(5)];
    }

    public Figure getDefaultFigure() {
        ColorSupplier supplier = new ColorSupplier();
        String color = supplier.getDefaultColor();
        return new Circle(10, color);
    }
}
