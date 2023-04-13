package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int index = random.nextInt(6);
        String color = new ColorSupplier().getRandomColor();
        switch (index) {
            case 0:
                return new Square(color, getRandomNumber(1, 14));
            case 1:
                return new Rectangle(color, getRandomNumber(1, 15), getRandomNumber(1, 18));
            case 2:
                return new RightTriangle(
            color,
            getRandomNumber(3, 5),
            getRandomNumber(1, 10),
            getRandomNumber(6, 15),
            getRandomNumber(1, 20));
            case 3:
                return new Circle(color, getRandomNumber(0, 12));
            case 4:
                return new IsoscelesTrapezoid(
            color, getRandomNumber(1, 15), getRandomNumber(1, 15), getRandomNumber(1, 20));
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    private int getRandomNumber(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }
}
