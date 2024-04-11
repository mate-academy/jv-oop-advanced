package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    private static final int LIMIT = 100;
    private Random random = new Random();
    private String color = new ColorSupplier().getRandomColor();

    public Figure getRandomFigure() {
        Figure[] arrayOfFigures = {new Square(random.nextInt(1, LIMIT), color),
                new RightTriangle(random.nextInt(1, LIMIT), random.nextInt(1, LIMIT), color),
                new Circle(random.nextInt(1, LIMIT), color),
                new IsoscelesTrapezoid(random.nextInt(1, LIMIT),
                        random.nextInt(1, LIMIT), random.nextInt(1, LIMIT), color),
                new Rectangle(random.nextInt(1, LIMIT), random.nextInt(1, LIMIT), color)};
        return arrayOfFigures[random.nextInt(arrayOfFigures.length)];
    }

    public Figure getdefaultFigure() {
        Figure circle = new Circle(10, new ColorSupplier().getColors()[3]);
        return circle;
    }

}
