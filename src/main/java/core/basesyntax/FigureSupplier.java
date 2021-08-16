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

        switch (figureNumber) {
            case 1:
                return new Square(firstSide, colorSupplier.getRandomColor());
            case 2:
                return new Rectangle(firstSide, secondSide,
                        colorSupplier.getRandomColor());
            case 3:
                return new Circle(firstSide,
                        colorSupplier.getRandomColor());
            case 4:
                return new RightTriangle(firstSide, secondSide,
                        colorSupplier.getRandomColor());
            default:
                return new IsoscelesTrapezoid(firstSide, secondSide, thirdSide,
                        colorSupplier.getRandomColor());
        }
    }
}
