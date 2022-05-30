package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final double DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT + 1);
        switch (figureNumber) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomIsoscelesTrapezoid();
            case 3:
                return getRandomSquare();
            case 4:
                return getRandomRightTriangle();
            case 5:
                return getRandomRectangle();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, ColorSupplier.DEFAULT_COLOR);
    }

    private Figure getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        double radius = random.nextInt(100);
        return new Circle(radius, color);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        double diagonal = random.nextInt(100);
        double topLeg = random.nextInt(100);
        double bottomLeg = random.nextInt(100);
        return new IsoscelesTrapezoid(diagonal, topLeg, bottomLeg, color);
    }

    private Figure getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        double side = random.nextInt(100);
        return new Square(side, color);
    }

    private Figure getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        double firstLeg = random.nextInt(100);
        double secondLeg = random.nextInt(100);
        return new RightTriangle(firstLeg, secondLeg, color);
    }

    private Figure getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        double firstLeg = random.nextInt(100);
        double secondLeg = random.nextInt(100);
        return new Rectangle(firstLeg, secondLeg, color);
    }
}
