package core.basesyntax.suppliers;

import core.basesyntax.figure.type.Circle;
import core.basesyntax.figure.type.Figure;
import core.basesyntax.figure.type.IsoscelesTrapezoid;
import core.basesyntax.figure.type.Rectangle;
import core.basesyntax.figure.type.RightTriangle;
import core.basesyntax.figure.type.Square;
import java.util.Random;

public class FigureSupplier {
    private ColoreSupplier coloreSupplier = new ColoreSupplier();
    private Random random = new Random();
    
    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(4);
        switch (figureIndex) {
            case 0 :
                return new Circle(coloreSupplier.getRandomColor(), getRandomInt());
            case 1 :
                return new IsoscelesTrapezoid(coloreSupplier.getRandomColor(),
                        getRandomDouble(),
                        getRandomDouble(),
                        getRandomDouble());
            case 2 :
                return new Rectangle(coloreSupplier.getRandomColor(), getRandomInt(),
                        getRandomInt());
            case 3 :
                return new RightTriangle(
                        coloreSupplier.getRandomColor(),
                        getRandomInt(),
                        getRandomInt());
            case 4 :
            default:
                return new Square(coloreSupplier.getRandomColor(), getRandomInt());

        }

    }

    private int getRandomInt() {
        return random.nextInt(100);
    }

    private double getRandomDouble() {
        return random.nextDouble();
    }
}
