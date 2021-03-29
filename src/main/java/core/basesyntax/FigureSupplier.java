package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Figure[] FIGURES = new Figure[] {
            new Circle(100, ColorSupplier.randomColor()),
            new Triangle(new Random().nextInt(100), ColorSupplier.randomColor()),
            new Square(new Random().nextInt(100), ColorSupplier.randomColor()),
            new Rectangle(new Random().nextInt(100), new Random().nextInt(100),
                    ColorSupplier.randomColor()),
            new IsoscelesTrapezoid(new Random().nextInt(100), new Random().nextInt(100),
                    new Random().nextInt(100), ColorSupplier.randomColor())};

    public static Figure getRandomFigure() {
        return FIGURES[new Random().nextInt(FIGURES.length)];
    }
}
