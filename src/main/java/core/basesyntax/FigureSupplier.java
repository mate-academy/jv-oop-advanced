package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    private static final int MAX_SIZE = 100;
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure randomFigure = new Square(random.nextInt(1, MAX_SIZE),
                color.getRandomColor(), "square");
        switch (random.nextInt(5)) {
            case 0:
                randomFigure = new RightTriangle(random.nextInt(1, MAX_SIZE),
                        random.nextInt(1, MAX_SIZE), color.getRandomColor(), "triangle");
                break;
            case 1:
                randomFigure = new Circle(random.nextInt(1, MAX_SIZE),
                        color.getRandomColor(), "circle");
                break;
            case 2:
                randomFigure = new IsoscelesTrapezoid(random.nextInt(1, MAX_SIZE),
                        random.nextInt(1, MAX_SIZE),
                        random.nextInt(1, MAX_SIZE), color.getRandomColor(), "isosceles trapezoid");
                break;
            case 3:
                randomFigure = new Rectangle(random.nextInt(1, MAX_SIZE),
                        random.nextInt(1, MAX_SIZE), color.getRandomColor(), "rectangle");
                break;
            default:
                break;
        }
        return randomFigure;
    }

    public Figure getdefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.toString(), "circle");
    }
}
