package core.basesyntax;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_AMOUNT = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure randomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getDouble());
    }

    public Figure randomIsoscelesTrapezoid() {
        double firstParallel = getDouble();
        double secondParallel = getDouble();
        while (firstParallel == secondParallel) {
            secondParallel = getDouble();
        }
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                firstParallel, secondParallel, getDouble());
    }

    public Figure randomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getDouble(), getDouble());
    }

    public Figure randomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), getDouble(), getDouble());
    }

    public Figure randomSquare() {
        return new Square(colorSupplier.getRandomColor(), getDouble());
    }

    public Figure getRandomFigure() {
        int choice = random.nextInt(FIGURES_AMOUNT);
        switch (choice) {
            case 0:
                return randomCircle();
            case 1:
                return randomIsoscelesTrapezoid();
            case 2:
                return randomRectangle();
            case 3:
                return randomRightTriangle();
            default:
                return randomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }

    private double getDouble() {
        return Math.ceil(random.nextDouble() * 10);
    }
}
