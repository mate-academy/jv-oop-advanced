package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();

    private final int limitCountFigure = 5;
    private final int limitMaxSide = 5;
    //int number = (int) (Math.random() * limitCountFigure);

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figures getFigure() {
        int number = random.nextInt(limitCountFigure);
        if (number == 1) {
            return getNewCircle();
        } else if (number == 2) {
            return getNewSquare();
        } else if (number == 3) {
            return getNewRectangle();
        } else if (number == 4) {
            return getRightTriangle();
        } else {
            return getNewIsoscelesTrapezoid();
        }
    }

    private Circle getNewCircle() {
        int radius = random.nextInt(limitMaxSide);
        String color = colorSupplier.assignColor();
        // generate random radius
        // generate random colour
        return new Circle(color, radius);
    }

    public Square getNewSquare() {
        int side = random.nextInt(limitMaxSide);
        String color = colorSupplier.assignColor();
        return new Square(color, side);
    }

    public Rectangle getNewRectangle() {
        int littleSide = random.nextInt(limitMaxSide);
        int bigSide = random.nextInt(limitMaxSide);
        String color = colorSupplier.assignColor();
        return new Rectangle(color, littleSide, bigSide);
    }

    public Rectangle getRightTriangle() {
        int firstLeg = random.nextInt(limitMaxSide);
        int secondLeg = random.nextInt(limitMaxSide);
        String color = colorSupplier.assignColor();
        return new Rectangle(color, firstLeg, secondLeg);
    }

    public IsoscelesTrapezoid getNewIsoscelesTrapezoid() {
        int halfWayLine = random.nextInt(limitMaxSide);
        int height = random.nextInt(limitMaxSide);
        String color = colorSupplier.assignColor();
        return new IsoscelesTrapezoid(color, halfWayLine, height);
    }

    @Override
    public String toString() {
        return "FigureSupplier{"
                + "random=" + random
                + ", colorSupplier=" + colorSupplier
                + '}';
    }
}
