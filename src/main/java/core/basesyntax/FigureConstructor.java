package core.basesyntax;

import java.util.Random;

public class FigureConstructor {
    public Figure getFigure() {
        int randomInteger = new Random().nextInt(5);
        switch (randomInteger) {
            case 0:
                return new Square(new Random().nextInt(21) + 1, ColorCreator.getColor());
            case 1:
                return new Rectangle(new Random().nextInt(21) + 1,
                        new Random().nextInt(21) + 1, ColorCreator.getColor());
            case 2:
                return new RightTriangle(new Random().nextInt(21) + 1,
                        new Random().nextInt(21) + 1, ColorCreator.getColor());
            case 3:
                return new Circle(new Random().nextInt(21) + 1, ColorCreator.getColor());
            case 4:
                return new IsoscelesTrapezoid(new Random().nextInt(21) + 1,
                        new Random().nextInt(21) + 1,
                        new Random().nextInt(21) + 1, ColorCreator.getColor());
            default:
                return null;
        }
    }
}
