package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureList randomFigure = FigureList.values()[random.nextInt(FigureList.values().length)];
        int randomRange = 100;
        switch (randomFigure) {
            case Circle:
                return new Circle(random.nextInt(randomRange),colorSupplier.getRandomColor());
            case Square:
                return new Square(random.nextInt(randomRange),colorSupplier.getRandomColor());
            case Rectangle:
                return new Rectangle(random.nextInt(randomRange),
                        random.nextInt(randomRange),
                        colorSupplier.getRandomColor());
            case RightTriangle:
                return new RightTriangle(random.nextInt(randomRange),
                        random.nextInt(randomRange),
                        colorSupplier.getRandomColor());
            case IsoscelesTrapezoid:
                return new IsoscelesTrapezoid(random.nextInt(randomRange),
                        random.nextInt(randomRange),
                        random.nextInt(randomRange),
                        colorSupplier.getRandomColor());
            default:
                return new Circle(10,Color.WHITE.toString());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10,Color.WHITE.toString());
    }

}
