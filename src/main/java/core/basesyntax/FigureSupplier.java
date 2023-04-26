package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random randomFigure = new Random();
    private final Random randomInteger = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int getRandomInt = randomInteger.nextInt(15);
        int getRandomInt2 = randomInteger.nextInt(15);
        int getRandomInt3 = randomInteger.nextInt(15);
        int index = randomFigure.nextInt(Figures.values().length);

        switch (Figures.values()[index].name()) {
            case "Circle":
                return new Circle(colorSupplier.getRandomColor(), getRandomInt);
            case "IsoscelesTrapezoid":
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomInt, getRandomInt2, getRandomInt3);
            case "RightTriangle":
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomInt, getRandomInt2);
            case "Rectangle":
                return new Rectangle(colorSupplier.getRandomColor(), getRandomInt, getRandomInt2);
            default:
                return new Square(colorSupplier.getRandomColor(), getRandomInt);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}




