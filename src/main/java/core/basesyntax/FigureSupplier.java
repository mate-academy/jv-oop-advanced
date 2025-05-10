package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURESCOUNT = 5;
    private final Figure circleWhite10 = new Circle(Color.WHITE, 10);
    private final Random randomFigure = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int index = randomFigure.nextInt(FIGURESCOUNT);

    public Square createRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), randomFigure.nextInt(100));
    }

    public Rectangle createRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                randomFigure.nextInt(100), randomFigure.nextInt(100));
    }

    public RightTriangle createRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                randomFigure.nextInt(100), randomFigure.nextInt(100));
    }

    public Circle createRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                randomFigure.nextInt(100));
    }

    public IsoscelesTrapezoid createRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                randomFigure.nextInt(100), randomFigure.nextInt(100),
                randomFigure.nextInt(100));
    }

    public Figure getRandomFigure() {
        switch (index) {
            case 0:
                return createRandomSquare();
            case 1:
                return createRandomRightTriangle();
            case 2:
                return createRandomCircle();
            case 3:
                return createRandomIsoscelesTrapezoid();
            default:
                return createRandomRectangle();
        }
    }

    public Figure getDefaultFigure() {
        return circleWhite10;
    }
}
