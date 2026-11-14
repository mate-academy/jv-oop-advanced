package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;

    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);

        switch (figureNumber) {
            case 0:
                double side = random.nextDouble(30) + 1;
                return new Square(side, 
                                  new ColorSupplier().getRandomColor());
            case 1:
                double radius = random.nextDouble(30) + 1;
                return new Circle(radius, 
                                  new ColorSupplier().getRandomColor());
            case 2:
                double firstCatetTrapezoid = random.nextDouble(30) + 1;
                double secondCatetTrapezoid = random.nextDouble(30) + 1;
                double diagonalCatet = random.nextDouble(30) + 1;
                double heightTrapezoid = random.nextDouble(30) + 1;
                return new IsoscelesTrapezoid(heightTrapezoid, 
                                              diagonalCatet, 
                                              secondCatetTrapezoid, 
                                              firstCatetTrapezoid, 
                                              new ColorSupplier().getRandomColor());
            case 3:
                double height = random.nextDouble(30) + 1;
                double width = random.nextDouble(30) + 1;
                return new Rectangle(height, 
                                     width, 
                                     new ColorSupplier().getRandomColor());
            default:
                double firstCatet = random.nextDouble(30) + 1;
                double secondCatet = random.nextDouble(30) + 1;
                return new RightTriangle(firstCatet, 
                                         secondCatet, 
                                         new ColorSupplier().getRandomColor());
        }

    }

}
