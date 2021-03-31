package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure randomFigure() {
        int randomNumber = new Random().nextInt(5);
        switch (randomNumber) {
            case 1:
                return new Square(ColorSuplier.randomColor(), new Random().nextInt(50));
            case 2:
                return new Rectangle(ColorSuplier.randomColor(), new Random().nextInt(50),
                        new Random().nextInt(50));
            case 3:
                return new RightTriangle(ColorSuplier.randomColor(), new Random().nextInt(50));
            case 4:
                return new IsoscelesTrapezoi(ColorSuplier.randomColor(), new Random().nextInt(50),
                        new Random().nextInt(50));
            default:
                return new Circle(ColorSuplier.randomColor(), new Random().nextInt(50));
        }
    }
}
