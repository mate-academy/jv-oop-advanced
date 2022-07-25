package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getDefaultFigure() {
        Circle circle = new Circle(10);
        circle.setColor(Colors.WHITE.toString());
        return circle;
    }

    public Figure getRandomFigure() {
        switch (new Random().nextInt(Figures.values().length)) {
            case 1 : return new Square(getRandomNumber());
            case 2 : return new RightTriangle(getRandomNumber(), getRandomNumber());
            case 3 : return new Rectangle(getRandomNumber(), getRandomNumber());
            case 4 : return new IsoscelesTrapezoid(getRandomNumber(),
                    getRandomNumber() + 1, getRandomNumber());
            default: return new Circle(getRandomNumber());
        }
    }

    private int getRandomNumber() {
        return new Random().nextInt(10) + 1;
    }
}
