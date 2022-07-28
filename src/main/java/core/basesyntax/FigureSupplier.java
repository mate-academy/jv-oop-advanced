package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getDefaultFigure() {
        int defaultSideSizeValue = 10;
        return new Circle(defaultSideSizeValue, Color.WHITE.toString());
    }

    public Figure getRandomFigure() {
        switch (new Random().nextInt(Shape.values().length)) {
            case 1 : return new Square(getRandomNumber(), getRandomColor());
            case 2 : return new RightTriangle(getRandomNumber(), getRandomNumber(),
                    getRandomColor());
            case 3 : return new Rectangle(getRandomNumber(), getRandomNumber(), getRandomColor());
            case 4 : return new IsoscelesTrapezoid(getRandomNumber(),
                    getRandomNumber(), getRandomNumber(), getRandomColor());
            default: return new Circle(getRandomNumber(), getRandomColor());
        }
    }

    private int getRandomNumber() {
        int maxRandomSideSize = 20;
        return new Random().nextInt(maxRandomSideSize) + 1;
    }

    private String getRandomColor() {
        ColorSupplier randomColor = new ColorSupplier();
        return randomColor.getRandomColor();
    }
}
