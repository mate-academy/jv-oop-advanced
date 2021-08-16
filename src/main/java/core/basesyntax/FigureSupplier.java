package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(10, 12, 5);
    private Circle circle = new Circle(10);
    private RightTriangle rightTriangle = new RightTriangle(10, 15);
    private Rectangle rectangle = new Rectangle(10,15);
    private Square square = new Square(10);

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0: return isoscelesTrapezoid;
            case 1: return circle;
            case 2: return rightTriangle;
            case 3: return rectangle;
            default: return square;
        }
    }
}
