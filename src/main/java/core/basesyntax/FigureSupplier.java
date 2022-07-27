package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private  static final Random RAND = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int RANDOM_NUMBER = RAND.nextInt(10);
        String RANDOM_COLOR = colorSupplier.getRandomColor();
        int RANDOM_FIGURE = RAND.nextInt(4);

        switch (RANDOM_FIGURE) {
            case 0:
                return new Circle(RANDOM_NUMBER, RANDOM_COLOR);
            case 1:
                return new Rectangle(RANDOM_NUMBER, RANDOM_NUMBER, RANDOM_COLOR);
            case 2:
                return new Square(RANDOM_NUMBER, RANDOM_COLOR);
            case 3:
                return new IsoscelesTrapezoid(RANDOM_NUMBER, RANDOM_NUMBER, RANDOM_NUMBER, RANDOM_COLOR);
            case 4:
                return new RightTriangle(RANDOM_NUMBER, RANDOM_NUMBER, RANDOM_COLOR);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "White");
    }

}
