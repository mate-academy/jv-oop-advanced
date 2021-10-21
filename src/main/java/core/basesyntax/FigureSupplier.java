package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 12;
    private static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        switch (index) {
            case 0 : return getRandomSquare();
            case 1 : return getRandomIsoscelesTrapezoid();
            case 2 : return getRandomRightTriangle();
            case 3 : return getRandomCircle();
            case 4 : return getRandomRectangle();
            default : return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), 10);
    }

    public Figure getRandomSquare() {
        int side = random.nextInt(MAX_VALUE);
        String color = colorSupplier.getRandomColor();
        return new Square(color, side);
    }

    public Figure getRandomIsoscelesTrapezoid() {
        int upperTrapezoid = random.nextInt(MAX_VALUE);
        int lowerTrapezoid = random.nextInt(MAX_VALUE);
        int side = random.nextInt(MAX_VALUE);
        String color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(color, upperTrapezoid, lowerTrapezoid, side);
    }

    public Figure getRandomRightTriangle() {
        int baseLeg = random.nextInt(MAX_VALUE);
        int heightLeg = random.nextInt(MAX_VALUE);
        String color = colorSupplier.getRandomColor();
        return new RightTriangle(color, baseLeg, heightLeg);
    }

    public Figure getRandomCircle() {
        int radius = random.nextInt(MAX_VALUE);
        String color = colorSupplier.getRandomColor();
        return new Circle(color, radius);
    }

    public Figure getRandomRectangle() {
        int lengthRectangle = random.nextInt(MAX_VALUE);
        int breadthRectangle = random.nextInt(MAX_VALUE);
        String color = colorSupplier.getRandomColor();

        return new Rectangle(color, lengthRectangle, breadthRectangle);
    }
}
