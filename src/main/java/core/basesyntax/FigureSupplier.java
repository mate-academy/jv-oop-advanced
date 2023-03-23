package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int figureCount = 4;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        double maxSide = 10;
        int figureNumber = random.nextInt(figureCount);
        double firstSide = random.nextDouble() * maxSide;
        double secondSide = random.nextDouble() * maxSide;
        switch (figureNumber) {
            case 0 :
                return new Square(firstSide);
            case 1 :
                return new Circle(firstSide);
            case 2 :
                return new Triangle(firstSide, secondSide);
            default :
                return new Rectangle(firstSide, secondSide);
        }
    }
}
