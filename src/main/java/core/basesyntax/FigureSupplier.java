package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_FIGURE_NUMBER = 5;
    private static final int RANDOM_SIDE_LENGTH = 10;
    private ColorSupplier supplier = new ColorSupplier();

    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(RANDOM_FIGURE_NUMBER);
        String colore = supplier.getRandomColor();
        int randomSide = getRandomSide();
        Figure circle = new Circle(randomSide, colore);
        Figure square = new Square(randomSide, colore);
        Rectangle rectangle = new Rectangle(randomSide, randomSide, colore);
        RightTriangle rightTriangle = new RightTriangle(randomSide, randomSide, colore);
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(randomSide, randomSide,
                randomSide, colore);

        switch (randomFigure) {
            case 0:
                return circle;
            case 1:
                return square;
            case 2:
                return rectangle;
            case 3:
                return rightTriangle;
            case 4:
                return isoscelesTrapezoid;
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        Circle defoltCircle = new Circle(10, Color.WITE.name());
        return defoltCircle;
    }

    private int getRandomSide() {
        return random.nextInt(RANDOM_SIDE_LENGTH + 1);
    }
}
