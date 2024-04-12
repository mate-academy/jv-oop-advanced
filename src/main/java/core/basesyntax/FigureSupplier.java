package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    private static final int LIMIT = 100;
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private String color = new ColorSupplier().getRandomColor();

    public Figure getRandomFigure() {
        Figure randomFigure = new Square(random.nextInt(1, LIMIT), color);
        switch (random.nextInt(5)) {
            case 0:
                randomFigure = new RightTriangle(random.nextInt(1, LIMIT),
                        random.nextInt(1, LIMIT), color);
                break;
            case 1:
                randomFigure = new Circle(random.nextInt(1, LIMIT), color);
                break;
            case 2:
                randomFigure = new IsoscelesTrapezoid(random.nextInt(1, LIMIT),
                        random.nextInt(1, LIMIT), random.nextInt(1, LIMIT), color);
                break;
            case 3:
                randomFigure = new Rectangle(random.nextInt(1, LIMIT),
                        random.nextInt(1, LIMIT), color);
                break;
            default:
                break;
        }
        return randomFigure;
    }

    public Figure getdefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Colors.WHITE.toString());
    }

}
