package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int circleDefaultRadius = 10;
    public static final String circleDefaultColor = Color.WHITE.name();
    public static final int randomNumber = 4;
    public static final int constNumber = 50;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(randomNumber);
        switch (figureIndex) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
            default:
                return getRandomSquare();
        }
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomInt());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomInt(),
                getRandomInt(), getRandomInt());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getRandomInt(),getRandomInt());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), getRandomInt(),getRandomInt());
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomInt());
    }

    private int getRandomInt() {
        return new Random().nextInt(constNumber);
    }

    public Figure getDefaultFigure() {
        return new Circle(circleDefaultColor, circleDefaultRadius);
    }
}

