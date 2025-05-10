package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_SIZE = 10; // to keep random sizes positive
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        switch (index) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomIsoscelesTrapezoid();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomRightTriangle();
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }

    private String getColor() {
        return colorSupplier.getRandomColor();
    }

    private Square getRandomSquare() {
        String color = getColor();
        int side = random.nextInt(MAX_SIZE);
        return new Square(color, side);
    }

    private RightTriangle getRandomRightTriangle() {
        String color = getColor();
        int firstLeg = random.nextInt(MAX_SIZE);
        int secondLeg = random.nextInt(MAX_SIZE);
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Rectangle getRandomRectangle() {
        String color = getColor();
        int firstSide = random.nextInt(MAX_SIZE);
        int secondSide = random.nextInt(MAX_SIZE);
        return new Rectangle(color, firstSide, secondSide);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        String color = getColor();
        int firstSide = random.nextInt(MAX_SIZE);
        int secondSide = random.nextInt(MAX_SIZE);
        int height = random.nextInt(MAX_SIZE);
        return new IsoscelesTrapezoid(color, firstSide, secondSide, height);
    }

    private Circle getRandomCircle() {
        String color = getColor();
        int radius = random.nextInt(MAX_SIZE);
        return new Circle(color, radius);
    }

}
