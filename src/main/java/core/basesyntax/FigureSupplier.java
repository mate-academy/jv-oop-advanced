package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private final Random random = new Random();
    static final double MAX_SIDE = 10;
    double firstSide = random.nextDouble() * MAX_SIDE;
    double secondSide = random.nextDouble() * MAX_SIDE;
    double thirdSide = random.nextDouble() * MAX_SIDE;

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
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
