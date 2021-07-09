package core.basesyntax;

import java.util.Random;

/*
FACTOR - the number to multiple to obtain whole part of double number
*/

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int COLOR_COUNT = 5;
    public static final int FACTOR = 10;
    private Figure figure;

    public Figure getRandomFigure() {
        Random random = new Random();

        int colorNumber = random.nextInt(COLOR_COUNT);
        ColorSupplier colorSupplier = new ColorSupplier(colorNumber);
        String figureColor = colorSupplier.getRandomColor();

        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                Random random0 = new Random();
                double randomSquareSide = random0.nextDouble() * FACTOR;
                figure = new Square(randomSquareSide, figureColor);
                break;

            case 1:
                Random random1 = new Random();
                double randomRightTriangleKatetA = random1.nextDouble()
                        * FACTOR;
                double randomRightTriangleKatetB = random1.nextDouble()
                        * FACTOR;
                figure = new RightTriangle(randomRightTriangleKatetA,
                        randomRightTriangleKatetB, figureColor);
                break;

            case 2:
                Random random2 = new Random();
                double randomRectangleSideA = random2.nextDouble() * FACTOR;
                double randomRectangleSideB = random2.nextDouble() * FACTOR;
                figure = new Rectangle(randomRectangleSideA, randomRectangleSideB, figureColor);
                break;

            case 3:
                Random random3 = new Random();
                double randomIsoscelesTrapezoidOsnovaA = random3.nextDouble() * FACTOR;
                double randomIsoscelesTrapezoidOsnovaB = random3.nextDouble() * FACTOR;
                double randomIsoscelesTrapezoidRebro = random3.nextDouble() * FACTOR;

                figure = new IsoscelesTrapezoid(randomIsoscelesTrapezoidOsnovaA,
                                                randomIsoscelesTrapezoidOsnovaB,
                                                randomIsoscelesTrapezoidRebro,
                                                figureColor);
                break;

            default:
                Random random4 = new Random();
                double randomRectangleRadius = random4.nextDouble() * FACTOR;
                figure = new Circle(randomRectangleRadius, figureColor);
                break;
        }

        return figure;
    }
}
