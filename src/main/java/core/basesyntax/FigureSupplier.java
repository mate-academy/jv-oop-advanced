package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT + 1);
        double radius = random.nextDouble() * 100;
        double firsLeg = random.nextDouble() * 100;
        double secondLeg = random.nextDouble() * 100;
        String color = colorSupplier.getRandomColor();
        double length = random.nextDouble() * 100;
        double width = random.nextDouble() * 100;
        double base = random.nextDouble() * 100;
        double top = random.nextDouble() * 100;
        double height = random.nextDouble() * 100;
        double side = random.nextDouble() * 100;
        if (figureNumber == 1) {
            Circle circle = new Circle(radius, color);
            return circle;
        } else if (figureNumber == 2) {
            RightTriangle rightTriangle = new RightTriangle(firsLeg, secondLeg, color);
            return rightTriangle;
        } else if (figureNumber == 3) {
            IsoscelesTrapezoid isoscelesTrapezoid
                    = new IsoscelesTrapezoid(base, top, height, color);
            return isoscelesTrapezoid;
        } else if (figureNumber == 4) {
            Rectangle rectangle = new Rectangle(length, width, color);
            return rectangle;
        } else {
            Square square = new Square(side, color);
            return square;
        }
    }

    public Figure getDefaultFigure() {
        Figure defaultFigure = new Circle(10.0, "WHITE");
        return defaultFigure;
    }
}
