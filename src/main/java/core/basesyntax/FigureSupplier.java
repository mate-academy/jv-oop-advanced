package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final String DEFAULT_COLOR = (Color.WHITE).name();
    static final int DEFAULT_RADIUS = 10;
    private int range = 100;
    private ColorSupplier randomColor = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int choice = random.nextInt(4);
        switch (choice) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomIsoscelesTrapezoid();
            default:
                throw new IllegalStateException("Incorrect value: " + choice);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Square getRandomSquare() {
        String color = randomColor.getRandomColor();
        int side = random.nextInt(range);
        return new Square(color, side);
    }

    private Rectangle getRandomRectangle() {
        String color = randomColor.getRandomColor();
        int a = random.nextInt(range);
        int b = random.nextInt(range);
        return new Rectangle(color, a, b);
    }

    private RightTriangle getRandomRightTriangle() {
        String color = randomColor.getRandomColor();
        int firstLeg = random.nextInt(range);
        int secondLeg = random.nextInt(range);
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        String color = randomColor.getRandomColor();
        int firstSide = random.nextInt(range);
        int secondSide = random.nextInt(range);
        int height = random.nextInt(range);
        return new IsoscelesTrapezoid(firstSide, secondSide, height, color);
    }
}
