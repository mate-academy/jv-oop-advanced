package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getDefaultFigure() {
        int defaultSideSizeValue = 10;
        Circle circle = new Circle(defaultSideSizeValue);
        circle.setColor(Color.WHITE.toString());
        return circle;
    }

    public Figure getRandomFigure() {
        switch (new Random().nextInt(Shape.values().length)) {
            case 1 : return new Square(getRandomNumber());
            case 2 : return new RightTriangle(getRandomNumber(), getRandomNumber());
            case 3 : return new Rectangle(getRandomNumber(), getRandomNumber());
            case 4 : return new IsoscelesTrapezoid(getRandomNumber(),
                    getRandomNumber(), getRandomNumber());
            default: return new Circle(getRandomNumber());
        }
    }

    private int getRandomNumber() {
        int maxRandomSideSize = 20;
        // maxRandomSideSize + 1 to avoid zero value
        return new Random().nextInt(maxRandomSideSize) + 1;
    }
}
