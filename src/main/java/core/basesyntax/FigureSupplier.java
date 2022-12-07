package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private Random random = new Random();

    public Figure getDefaultFigure() {
        Circle defaultCircle = new Circle("white", 10);
        return defaultCircle;
    }

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        switch (figureNumber) {
            case 0:
                //square
                int size = random.nextInt(10) + 1;
                Square square = new Square(color, size);
                return square;
            case 1:
                //rectangle
                int sideA = random.nextInt(10) + 1;
                int sideB = random.nextInt(10) + 1;
                Rectangle rectangle = new Rectangle(color, sideA, sideB);
                return rectangle;
            case 2:
                //rightTriangle
                int firstLeg = random.nextInt(10) + 1;
                int secondLeg = random.nextInt(10) + 1;
                RightTriangle rightTriangle = new RightTriangle(color, firstLeg, secondLeg);
                return rightTriangle;
            case 3:
                //circle
                int radius = random.nextInt(10) + 1;
                Circle circle = new Circle(color, radius);
                return circle;
            default:
                //IsoscelesTrapezoid
                int bottom = random.nextInt(10) + 1;
                int top = random.nextInt(10) + 1;
                int height = random.nextInt(10) + 1;
                IsoscelesTrapezoid isoscelesTrapezoid =
                        new IsoscelesTrapezoid(color, bottom, top, height);
                return isoscelesTrapezoid;
        }
    }
}
