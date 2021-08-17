package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_SIDE_LENGTH = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        int firstSide = random.nextInt(MAX_SIDE_LENGTH);
        int secondSide = random.nextInt(MAX_SIDE_LENGTH);
        int thirdSide = random.nextInt(MAX_SIDE_LENGTH);
        String color = colorSupplier.getRandomColor();

        switch (figureNumber) {
            case 1:
                return new Square(firstSide, color);
            case 2:
                return new Rectangle(firstSide, secondSide, color);
            case 3:
                return new Circle(firstSide, color);
            case 4:
                return new RightTriangle(firstSide, secondSide, color);
            default:
                return new IsoscelesTrapezoid(firstSide, secondSide, thirdSide, color);
        }
    }
}
