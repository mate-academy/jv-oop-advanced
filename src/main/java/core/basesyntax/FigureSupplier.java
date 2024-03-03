package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int FIGURE_COUNT = 4;
    static final int FIGURE_SIZE = 50;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        switch (index) {
            case 0:
                Square square = new Square(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_SIZE));
                square.getArea();
                square.paintFigure();
                return square;
            case 1:
                Rectangle rectangle = new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_SIZE), random.nextInt(FIGURE_SIZE));
                rectangle.getArea();
                rectangle.paintFigure();
                return rectangle;
            case 2:
                RightTriangle rightTriangle = new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_SIZE), random.nextInt(FIGURE_SIZE));
                rightTriangle.getArea();
                rightTriangle.paintFigure();
                return rightTriangle;
            case 3:
                Circle circle = new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_SIZE));
                circle.getArea();
                circle.paintFigure();
                return circle;
            default:
                IsoscelesTrapezoid isoscelesTrapezoid =
                        new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(FIGURE_SIZE), random.nextInt(FIGURE_SIZE),
                                random.nextInt(FIGURE_SIZE));
                isoscelesTrapezoid.getArea();
                isoscelesTrapezoid.paintFigure();
                return isoscelesTrapezoid;
        }
    }

    public Figure getDefaultFigure(int num) {
        switch (num) {
            case 0:
                Square square = new Square(Colors.YELLOW.name(),20);
                square.getArea();
                square.paintFigure();
                return square;
            case 1:
                Rectangle rectangle = new Rectangle(Colors.BLUE.name(),10,15);
                rectangle.getArea();
                rectangle.paintFigure();
                return rectangle;
            case 2:
                RightTriangle rightTriangle = new RightTriangle(Colors.GREEN.name(),15, 10);
                rightTriangle.getArea();
                rightTriangle.paintFigure();
                return rightTriangle;
            case 3: Circle circle = new Circle(Colors.RED.name(), 5);
                circle.getArea();
                circle.paintFigure();
                return circle;
            default:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(Colors.BLACK.name(),
                        20, 25, 10);
                isoscelesTrapezoid.getArea();
                isoscelesTrapezoid.paintFigure();
                return isoscelesTrapezoid;
        }
    }
}
