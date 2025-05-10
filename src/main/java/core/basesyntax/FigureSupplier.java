package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_SIDE = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);

        switch (index) {
            case 0 :
                return getSguare();
            case 1 :
                return getRectangle();
            case 2 :
                return getCircle();
            case 3 :
                return getRightTriangle();
            case 4 :
            default :
                return getIsoscelesTrapezoid();
        }
    }

    private Square getSguare() {
        int sideA = random.nextInt(MAX_SIDE) + 1;
        String color = colorSupplier.getRandomColor();
        return new Square(sideA, color);
    }

    private Rectangle getRectangle() {
        int sideA = random.nextInt(MAX_SIDE) + 1;
        int sideB = random.nextInt(MAX_SIDE) + 1;
        String color = colorSupplier.getRandomColor();
        return new Rectangle(sideA, sideB, color);
    }

    private Circle getCircle() {
        int radius = random.nextInt(MAX_SIDE) + 1;
        String color = colorSupplier.getRandomColor();
        return new Circle(radius, color);
    }

    private RightTriangle getRightTriangle() {
        int sideA = random.nextInt(MAX_SIDE) + 1;
        int sideB = random.nextInt(MAX_SIDE) + 1;
        String color = colorSupplier.getRandomColor();
        return new RightTriangle(sideA, sideB, color);
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        int sideA = random.nextInt(MAX_SIDE) + 1;
        int sideB = random.nextInt(MAX_SIDE) + 1;
        int sideC = random.nextInt(MAX_SIDE) + 1;
        String color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(sideA, sideB, sideC, color);
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name());
    }
}
