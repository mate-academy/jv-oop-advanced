package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int RADIUS_DEFAULT = 10;
    static final String COLOR_DEFAULT = "WHITE";
    protected Random random = new Random();
    protected Circle circle = new Circle(random.nextInt(),
            new ColorSupplier().getRandomColor());
    protected IsoscelesTrapezoid isoscelesTrapezoid
            = new IsoscelesTrapezoid(random.nextInt(),
            random.nextInt(), random.nextInt());
    protected Rectangle rectangle = new Rectangle(random.nextInt(),
            random.nextInt());
    protected RightTriangle rightTriangle = new RightTriangle(random.nextInt(),
            random.nextInt());
    protected Square square = new Square(random.nextInt());

    Circle getRandomCircle() {
        return circle;
    }

    IsoscelesTrapezoid getRandomTrapezoid() {
        return isoscelesTrapezoid;
    }

    Rectangle getRandomRectangle() {
        return rectangle;
    }

    RightTriangle getRandomRightRectangle() {
        return rightTriangle;
    }

    Square getRandomSquare() {
        return square;
    }

    public FigureForm getRandomFigure(int randomFigure) {
        randomFigure = random.nextInt(5);
        switch (randomFigure) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightRectangle();
            case 4:
                return getRandomSquare();
            default:
                return getDefaultFigure();
        }
    }

    public FigureForm getDefaultFigure() {
        return new Circle(RADIUS_DEFAULT, COLOR_DEFAULT);
    }
}
