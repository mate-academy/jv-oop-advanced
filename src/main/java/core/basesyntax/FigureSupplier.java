package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int NUMBER = 10;
    static final String WHITE = "WHITE";
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figure = random.nextInt(5);
        switch (figure) {
            case (1):
                return getRandomCircle();
            case (2):
                return getRandomIsoscelesTrapezoid();
            case (3):
                return getRandomRectangle();
            case (4):
                return getRandomRightTriangle();
            default:
                return getRandomSquare();
        }
    }

    private Figure getRandomCircle() {
        int radius = random.nextInt(60) + 1;
        String color = colorSupplier.getRandomColor();
        return new Circle(radius, color);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        int leg = random.nextInt(60) + 1;
        int upbase = random.nextInt(70) + 1;
        int downbase = random.nextInt(80) + 1;
        String color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(leg, upbase, downbase, color);
    }

    private Figure getRandomRectangle() {
        int firstLeg = random.nextInt(60) + 1;
        int secondLeg = random.nextInt(70) + 1;
        String color = colorSupplier.getRandomColor();
        return new Rectangle(firstLeg, secondLeg, color);
    }

    private Figure getRandomRightTriangle() {
        int firstLeg = random.nextInt(60) + 1;
        int secondLeg = random.nextInt(70) + 1;
        String color = colorSupplier.getRandomColor();
        return new RightTriangle(firstLeg, secondLeg, color);
    }

    private Figure getRandomSquare() {
        int leg = random.nextInt(60) + 1;
        String color = colorSupplier.getRandomColor();
        return new Square(leg, color);
    }

    public Figure getDefaultFigure() {
        return new Circle(NUMBER, WHITE);
    }
}
