package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Figure[] figures;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier() {
        this.random = new Random();
        this.colorSupplier = new ColorSupplier();
        this.figures = new Figure[]{
                new Square(colorSupplier.getRandomColor(), getRandomSide()),
                new Rectangle(getRandomWidth(), getRandomHeight(), colorSupplier.getRandomColor()),
                new RightTriangle(getRandomLeg(), getRandomLeg(), colorSupplier.getRandomColor()),
                new Circle(getRandomRadius(), colorSupplier.getRandomColor()),
                new IsoscelesTrapezoid(
                        getRandomBase(),
                        getRandomBase(),
                        getRandomLeg(),
                        colorSupplier.getRandomColor()
                )
        };
    }

    public Figure getRandomFigure() {
        return figures[random.nextInt(figures.length)];
    }

    private double getRandomSide() {
        return random.nextDouble() * 10 + 1;
    }

    private double getRandomWidth() {
        return random.nextDouble() * 10 + 1;
    }

    private double getRandomHeight() {
        return random.nextDouble() * 10 + 1;
    }

    private double getRandomLeg() {
        return random.nextDouble() * 10 + 1;
    }

    private double getRandomRadius() {
        return random.nextDouble() * 5 + 1;
    }

    private double getRandomBase() {
        return random.nextDouble() * 10 + 1;
    }
}
