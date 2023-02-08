package core.basesyntax;

import java.security.SecureRandom;

public class FigureSupplier extends ColorSupplier {
    private static final int FIGURE_COUNT = 5;
    private final SecureRandom random = new SecureRandom();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT) + 1;
        int randomSide = random.nextInt(100);
        int randomSide1 = random.nextInt(100);
        int randomSide2 = random.nextInt(100);
        int randomRadius = random.nextInt(100);
        if (figureNumber == 1) {
            return new Square(getRandomColor(), randomSide);
        } else if (figureNumber == 2) {
            return new Circle(getRandomColor(), randomRadius);
        } else if (figureNumber == 3) {
            return new IsoscelesTrapezoid(getRandomColor(), randomSide, randomSide1, randomSide2);
        } else if (figureNumber == 4) {
            return new Rectangle(getRandomColor(), randomSide, randomSide1);
        } else {
            return new RightTriangle(getRandomColor(), randomSide, randomSide2);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
