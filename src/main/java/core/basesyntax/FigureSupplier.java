package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RAND = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = RAND.nextInt(10);
        String randomColor = colorSupplier.getRandomColor();
        int randomFigure = RAND.nextInt(4);

        switch (randomFigure) {
            case 0:
                return new Circle(randomNumber, randomColor);
            case 1:
                return new Rectangle(randomNumber, randomNumber, randomColor);
            case 2:
                return new Square(randomNumber, randomColor);
            case 3:
                return new IsoscelesTrapezoid(randomNumber,
                        randomNumber,
                        randomNumber,
                        randomColor);
            case 4:
                return new RightTriangle(randomNumber, randomNumber, randomColor);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "White");
    }

}
