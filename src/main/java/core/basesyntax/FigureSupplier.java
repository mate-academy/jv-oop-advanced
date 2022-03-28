package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_BOUND = 100;
    public static final int COUNT_OF_FIGURES = 5;
    public static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int indexOfFigure = random.nextInt(COUNT_OF_FIGURES);
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        switch (indexOfFigure) {
            case 0 :
                int side = random.nextInt(MAX_BOUND);
                return new Square(randomColor,
                        side);

            case 1 :
                int firstSide = random.nextInt(MAX_BOUND);
                int secondSide = random.nextInt(MAX_BOUND);
                return new Rectangle(randomColor,
                        firstSide,
                        secondSide);

            case 2 :
                int firstLeg = random.nextInt(MAX_BOUND);
                int secondLeg = random.nextInt(MAX_BOUND);
                return new RightTriangle(randomColor,
                        firstLeg,
                        secondLeg);

            case 3 :
                int radius = random.nextInt(MAX_BOUND);
                return new Circle(randomColor,
                        radius);

            case 4 :
                int topSide = random.nextInt(MAX_BOUND);
                int downSide = random.nextInt(MAX_BOUND);
                int height = random.nextInt(MAX_BOUND);
                return new IsoscelesTrapezoid(randomColor,
                        topSide,
                        downSide,
                        height);
            default:
                return new Circle(randomColor, DEFAULT_RADIUS);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
