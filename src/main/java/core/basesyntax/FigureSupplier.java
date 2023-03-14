package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        double maxSide = 10;
        int figureNumber = random.nextInt(FIGURE_COUNT);
        ColorSupplier colorSupplier = new ColorSupplier();
        Color randomColor = colorSupplier.getRandomColor();

        double firstSide = random.nextDouble() * maxSide;
        double secondSide = random.nextDouble() * maxSide;
        double thirdSide = random.nextDouble() * maxSide;

        switch (figureNumber) {
            case 0:
                return new Circle(randomColor, firstSide);
            case 1:
                return new Square(randomColor, firstSide);
            case 2:
                return new Rectangle(randomColor, firstSide, secondSide);
            case 3:
                return new RightTriangle(randomColor, firstSide, secondSide);
            default:
                return new IsoscelesTrapezoid(randomColor, firstSide, secondSide, thirdSide);
        }
    }
}
