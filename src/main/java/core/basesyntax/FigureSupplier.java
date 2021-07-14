package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURES = 5;
    private static final int RANDOM_LIMIT = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random randomNumber = new Random();

    public Figure getRandomFigure() {
        switch (new Random().nextInt(MAX_FIGURES)) {
            case 0:
                return new Circle("circle", colorSupplier.getRandomColor(),
                        randomNumber.nextInt(RANDOM_LIMIT));
            case 1:
                return new IsoscelesTrapezoid("isosceles trapezoid", colorSupplier.getRandomColor(),
                        randomNumber.nextInt(RANDOM_LIMIT), randomNumber.nextInt(RANDOM_LIMIT),
                        randomNumber.nextInt(RANDOM_LIMIT));
            case 2:
                return new Rectangle("rectangle", colorSupplier.getRandomColor(),
                        randomNumber.nextInt(RANDOM_LIMIT), randomNumber.nextInt(RANDOM_LIMIT));
            case 3:
                return new RightTriangle("right triangle", colorSupplier.getRandomColor(),
                        randomNumber.nextInt(RANDOM_LIMIT), randomNumber.nextInt(RANDOM_LIMIT));
            case 4:
            default:
                return new Square("square", colorSupplier.getRandomColor(),
                        randomNumber.nextInt(RANDOM_LIMIT));
        }
    }
}
