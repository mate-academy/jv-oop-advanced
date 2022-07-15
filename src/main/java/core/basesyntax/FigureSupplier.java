package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int DEFAULT_CIRCLE_RADIUS = 10;
    public static final Color DEFAULT_CIRCLE_COLOR = Color.WHITE;
    public static final int MAX_NAMBER = 25;
    public static final int COUNT_OF_FIGURES = 4;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int countFigure = random.nextInt(COUNT_OF_FIGURES);
        switch (countFigure) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), getRandomSquare());
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomRectangle(),
                        getRandomRectangle());
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomRightTriangle(),
                        getRandomRightTriangle());
            case 3:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomIsoscelesTrapezoid(),getRandomIsoscelesTrapezoid(),
                        getRandomIsoscelesTrapezoid());
            default:
                return new Circle(colorSupplier.getRandomColor(), getRandomCircle());
        }
    }

    private int getRandomSquare() {
        return new Random().nextInt(MAX_NAMBER);
    }

    private double getRandomRectangle() {
        return new Random().nextInt(MAX_NAMBER);
    }

    private double getRandomRightTriangle() {
        return new Random().nextInt(MAX_NAMBER);
    }

    private double getRandomIsoscelesTrapezoid() {
        return new Random().nextInt(MAX_NAMBER);
    }

    private int getRandomCircle() {
        return new Random().nextInt(MAX_NAMBER);
    }
}
