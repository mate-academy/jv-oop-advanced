package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private static final double DEFAULT_RADIUS = 10.0;
    private static final String DEFAULT_COLOR = "WHITE";
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT + 1);
        switch (figureNumber) {
            case 1: return getRandomCircle();
            case 2: return getRandomRectangle();
            case 3: return getRandomSquare();
            case 4: return getRandomIsoscelesTrapezoid();
            default: return getRandomRightTriangle();
        }
    }

    public Figure getDefaultFigure() {

        Figure defaultFigure = new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
        return defaultFigure;
    }

    private Circle getRandomCircle() {
        double radius = random.nextDouble() * 100;
        String color = colorSupplier.getRandomColor();
        Circle circle = new Circle(radius, color);
        return circle;
    }

    private RightTriangle getRandomRightTriangle() {
        double firsLeg = random.nextDouble() * 100;
        double secondLeg = random.nextDouble() * 100;
        String color = colorSupplier.getRandomColor();
        RightTriangle rightTriangle = new RightTriangle(firsLeg, secondLeg, color);
        return rightTriangle;
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        double base = random.nextDouble() * 100;
        double top = random.nextDouble() * 100;
        double height = random.nextDouble() * 100;
        String color = colorSupplier.getRandomColor();
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(base, top, height, color);
        return isoscelesTrapezoid;
    }

    private Rectangle getRandomRectangle() {
        double length = random.nextDouble() * 100;
        double width = random.nextDouble() * 100;
        String color = colorSupplier.getRandomColor();
        Rectangle rectangle = new Rectangle(length, width, color);
        return rectangle;
    }

    private Square getRandomSquare() {
        double side = random.nextDouble() * 100;
        String color = colorSupplier.getRandomColor();
        Square square = new Square(side, color);
        return square;
    }
}
