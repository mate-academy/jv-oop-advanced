package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    private int getRandomDimension() {

        return random.nextInt(10) + 1;
    }

    public Figure getRandomFigure() {

        String color = new ColorSupplier().getRandomColor();
        int figureType = random.nextInt(5);

        switch (figureType) {
            case 0:
                return new Square(getRandomDimension(), color);

            case 1:
                return new Rectangle(getRandomDimension(),getRandomDimension(), color);
            case 2:
                return new RightTriangle(getRandomDimension(), getRandomDimension(), color);
            case 3:
                return new Circle(getRandomDimension(), color);
            default:
                return new IsoscelesTrapezoid(getRandomDimension(), getRandomDimension(),
                        getRandomDimension(), color);

        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
