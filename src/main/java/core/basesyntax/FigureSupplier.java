package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURES = 5;

    public Figure getRandomFigure() {
        int randomIndex = new Random().nextInt(FIGURES);

        switch (randomIndex) {
            case 1 :
                return new Circle(new Random().nextDouble(),
                        new ColorSupplier().getRandomColor());
            case 2 :
                return new IsoscelesTrapezoid(new Random().nextDouble(),
                        new Random().nextDouble(),
                        new Random().nextDouble(),
                        new ColorSupplier().getRandomColor());
            case 3 :
                return new RightTriangle(new Random().nextDouble(),
                        new Random().nextDouble(),
                        new ColorSupplier().getRandomColor());
            case 4 :
                return new Rectangle(new Random().nextDouble(),
                        new Random().nextDouble(),
                        new ColorSupplier().getRandomColor());
            default:
                return new Square(new Random().nextDouble(),
                        new ColorSupplier().getRandomColor());

        }
    }
}
