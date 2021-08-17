package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(
            random.nextInt(100), random.nextInt(100), random.nextInt(100));
    private Circle circle = new Circle(random.nextInt(100));
    private RightTriangle rightTriangle = new RightTriangle(
            random.nextInt(100), random.nextInt(100));
    private Rectangle rectangle = new Rectangle(random.nextInt(100),random.nextInt(100));
    private Square square = new Square(random.nextInt(100));

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
