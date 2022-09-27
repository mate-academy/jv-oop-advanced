package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int ALLOWABLE_RANGE_OF_UNITS = 50;
    private ColorSupplier cs = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT) + 1;
        if (figureNumber == 1) {
            Square square = new Square(cs.getRandomColor(),
                    random.nextInt(ALLOWABLE_RANGE_OF_UNITS));
            square.findArea();
            return square;
        } else if (figureNumber == 2) {
            Circle circle = new Circle(cs.getRandomColor(),
                    random.nextInt(ALLOWABLE_RANGE_OF_UNITS));
            circle.findArea();
            return circle;
        } else if (figureNumber == 3) {
            RightTriangle rightTriangle = new RightTriangle(cs.getRandomColor(),
                    random.nextInt(ALLOWABLE_RANGE_OF_UNITS),
                    random.nextInt(ALLOWABLE_RANGE_OF_UNITS));
            rightTriangle.findArea();
            return rightTriangle;
        } else if (figureNumber == 4) {
            Rectangle rectangle = new Rectangle(cs.getRandomColor(),
                    random.nextInt(ALLOWABLE_RANGE_OF_UNITS),
                    random.nextInt(ALLOWABLE_RANGE_OF_UNITS));
            rectangle.findArea();
            return rectangle;
        } else {
            IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(cs.getRandomColor(),
                    random.nextInt(ALLOWABLE_RANGE_OF_UNITS),
                    random.nextInt(ALLOWABLE_RANGE_OF_UNITS),
                    random.nextInt(ALLOWABLE_RANGE_OF_UNITS));
            isoscelesTrapezoid.findArea();
            return isoscelesTrapezoid;
        }
    }

    public Figure getDefaultFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT) + 1;

        if (figureNumber == 1) {
            Square square = new Square(Colors.RED.name(), 15);
            square.findArea();
            return square;
        } else if (figureNumber == 2) {
            Circle circle = new Circle(Colors.WHITE.name(), 10);
            circle.findArea();
            return circle;
        } else if (figureNumber == 3) {
            RightTriangle rightTriangle = new RightTriangle(Colors.GREEN.name(), 7, 11);
            rightTriangle.findArea();
            return rightTriangle;
        } else if (figureNumber == 4) {
            Rectangle rectangle = new Rectangle(Colors.YELLOW.name(), 13, 6);
            rectangle.findArea();
            return rectangle;
        } else {
            IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(Colors.PINK.name(),
                    5, 8, 7);
            isoscelesTrapezoid.findArea();
            return isoscelesTrapezoid;
        }
    }
}
