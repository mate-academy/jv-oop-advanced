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
            case 1 : return new Square(new Random().nextInt(10) + 1);
            case 2 : return new RightTriangle(new Random().nextInt(10) + 1,
                    new Random().nextInt(10) + 1);
            case 3 : return new Rectangle(new Random().nextInt(10) + 1,
                    new Random().nextInt(10) + 1);
            case 4 : return new IsoscelesTrapezoid(new Random().nextInt(10) + 1,
                    new Random().nextInt(10) + 2,
                    new Random().nextInt(10) + 1);
            default: return new Circle((new Random().nextInt(10) + 1));
        }
    }
}
