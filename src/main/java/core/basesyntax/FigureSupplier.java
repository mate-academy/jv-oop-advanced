package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure get() {
        int randomGeneratedIndex = new Random().nextInt(5);

        switch (randomGeneratedIndex) {
            case 0:
                return new Circle(getRandomInt(), getRandomColor());
            case 1:
                return new IsoscelesTrapezoid(getRandomInt(), getRandomInt(),
                        getRandomInt(), getRandomColor());
            case 2:
                return new Rectangle(getRandomInt(), getRandomInt(), getRandomColor());
            case 3:
                return new RightTriangle(getRandomInt(), getRandomInt(), getRandomColor());
            case 4:
            default:
                return new Square(getRandomInt(), getRandomColor());
        }
    }

    private int getRandomInt() {
        Random random = new Random();
        return random.nextInt(50);
    }

    private Color getRandomColor() {
        return new ColorSupplier().get();
    }
}

