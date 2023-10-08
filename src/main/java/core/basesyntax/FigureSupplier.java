package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int randomRadius = random.nextInt((100) + 1);
    private final int randomSide = random.nextInt((100) + 1);
    private final int randomSideA = random.nextInt((100) + 1);
    private final int randomSideB = random.nextInt((100) + 1);
    private final int randomSideC = random.nextInt((100) + 1);
    private final int randomBaseA = random.nextInt((100) + 1);
    private final int randomBaseB = random.nextInt((100) + 1);
    private final int randomFirstLeg = random.nextInt((100) + 1);
    private final int randomSecondLeg = random.nextInt((100) + 1);
    private final Figure [] figures = { new Circle(randomRadius),
            new Rectangle(randomSideA, randomSideB), new Square(randomSide),
            new IsoscelesTrapezoid(randomBaseA, randomBaseB, randomSideC),
            new RightTriangle(randomFirstLeg, randomSecondLeg)};

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURES);
        Figure figure = figures[index];
        figure.setColor(colorSupplier.getRandomColor());
        return figure;
    }

    public Figure getDefoultFigure() {
        Figure circle = new Circle(10);
        circle.setColor(Color.WHITE.name());
        return circle;
    }
}
