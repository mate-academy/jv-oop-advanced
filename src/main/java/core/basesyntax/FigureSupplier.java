package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int NUMBER_OF_FIGURES = 5;

    public Figure getRandomFigure() {
        int randomIndex = new Random().nextInt(NUMBER_OF_FIGURES);
        ColorSupplier colorSupplier = new ColorSupplier();

        switch (randomIndex) {
            case 1 :
                return new Circle(new Random().nextDouble(),
                        colorSupplier.getRandomColor());
            case 2 :
                return new IsoscelesTrapezoid(new Random().nextDouble(),
                        new Random().nextDouble(),
                        new Random().nextDouble(),
                        colorSupplier.getRandomColor());
            case 3 :
                return new RightTriangle(new Random().nextDouble(),
                        new Random().nextDouble(),
                        colorSupplier.getRandomColor());
            case 4 :
                return new Rectangle(new Random().nextDouble(),
                        new Random().nextDouble(),
                        colorSupplier.getRandomColor());
            default:
                return new Square(new Random().nextDouble(),
                        colorSupplier.getRandomColor());

        }
    }
}
