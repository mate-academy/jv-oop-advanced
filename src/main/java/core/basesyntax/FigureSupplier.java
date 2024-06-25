package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(5)) {
            case 0 :
                return new Square(colorSupplier.getRandomColor(),
                        random.nextDouble());
            case 1 :
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextDouble());
            case 2 :
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble(),
                        random.nextDouble());
            case 3 :
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble(),
                        random.nextDouble(),
                        random.nextDouble());
            case 4 :
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextDouble(),
                        random.nextDouble());
            default :
                return getdefaultFigure();
        }
    }

    public Figure getdefaultFigure() {
        return new Circle("White", 10);
    }
}
