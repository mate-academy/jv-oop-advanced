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
        int figureNumber = random.nextInt(FIGURE_COUNT);
        int colorNumber = random.nextInt(COLOR_COUNT);

        switch (figureNumber) {
            case 0:
                Random random0 = new Random();
                double randomSquareSide = random0.nextDouble() * FACTOR;
                figure = new Square(randomSquareSide);
                figure.calculateArea();
                figure.chooseFigureColor(colorNumber);
                break;

            case 1:
                Random random1 = new Random();
                double randomRightTriangleKatetA = random1.nextDouble() * FACTOR;
                double randomRightTriangleKatetB = random1.nextDouble() * FACTOR;
                figure = new RightTriangle(randomRightTriangleKatetA, randomRightTriangleKatetB);
                figure.calculateArea();
                figure.chooseFigureColor(colorNumber);
                break;

            case 2:
                Random random2 = new Random();
                double randomRectangleSideA = random2.nextDouble() * FACTOR;
                double randomRectangleSideB = random2.nextDouble() * FACTOR;
                figure = new Rectangle(randomRectangleSideA, randomRectangleSideB);
                figure.calculateArea();
                figure.chooseFigureColor(colorNumber);
                break;

            case 3:
                Random random3 = new Random();
                double randomIsoscelesTrapezoidOsnovaA = random3.nextDouble() * FACTOR;
                double randomIsoscelesTrapezoidOsnovaB = random3.nextDouble() * FACTOR;
                double randomIsoscelesTrapezoidRebro = random3.nextDouble() * FACTOR;

                figure = new IsoscelesTrapezoid(randomIsoscelesTrapezoidOsnovaA,
                                                randomIsoscelesTrapezoidOsnovaB,
                                                randomIsoscelesTrapezoidRebro);
                figure.calculateArea();
                figure.chooseFigureColor(colorNumber);
                break;

            default:
                Random random4 = new Random();
                double randomRectangleRadius = random4.nextDouble() * FACTOR;
                figure = new Circle(randomRectangleRadius);
                figure.calculateArea();
                figure.chooseFigureColor(colorNumber);
                break;
        }

        return figure;
    }
}
