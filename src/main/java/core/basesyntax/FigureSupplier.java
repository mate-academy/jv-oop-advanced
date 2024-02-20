package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private final Random random = new Random();

    private int getRandomDimension() {

        return random.nextInt(10) + 1;
    }

    public Figure getRandomFigure() {

        String color = new ColorSupplier().getRandomColor();
        int figureType = random.nextInt(5);

        return switch (figureType) {
            case 0 -> new Square(getRandomDimension(), color);
            case 1 -> new Rectangle(getRandomDimension(), getRandomDimension(), color);
            case 2 -> new RightTriangle(getRandomDimension(), getRandomDimension(), color);
            case 3 -> new Circle(getRandomDimension(), color);
            default -> new IsoscelesTrapezoid(getRandomDimension(), getRandomDimension(),
                    getRandomDimension(), color);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
