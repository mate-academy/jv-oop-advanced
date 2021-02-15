package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure get() {
        int randomGeneratedIndex = new Random().nextInt(5);

        switch (randomGeneratedIndex) {
            case 0:
                return new Circle(getRandomInt());
            case 1:
                return new IsoscelesTrapezoid(getRandomInt(), getRandomInt(),
                        getRandomInt());
            case 2:
                return new Rectangle(getRandomInt(), getRandomInt());
            case 3:
                return new RightTriangle(getRandomInt(), getRandomInt());
            case 4:
            default:
                return new Square(getRandomInt());
        }
    }

    private int getRandomInt() {
        Random random = new Random();
        return random.nextInt(50);
    }
}

