package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int figureCount = 5;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        double maxSide = 10;
        int figureNumber = random.nextInt(figureCount);
        double firstSide = random.nextDouble() * maxSide;
        double secondSide = random.nextDouble() * maxSide;
        double thirdSide = random.nextDouble() * maxSide;
        switch (figureNumber) {
            case 0 :
                return new Square(firstSide);
            case 1 :
                return new Circle(firstSide);
            case 2 :
                return new RightTriangle(firstSide, secondSide);
            case 3 :
                return new IsoscelesTrapezoid(firstSide, secondSide, thirdSide);
            default :
                return new Rectangle(firstSide, secondSide);
        }
    }
}
