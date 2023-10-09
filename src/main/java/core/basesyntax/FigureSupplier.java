package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int COUNT_FIGURE = 6;
    static final Figure[] arrayFigures = new Figure[COUNT_FIGURE];
    private static final int NUMBER_OF_FIGURES = 4;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
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
    private Figure randomFigure;

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURES);
        switch (index) {
            case 0:
                randomFigure = new Circle(randomRadius);
                randomFigure.setColor(colorSupplier.getRandomColor());
                break;
            case 1:
                randomFigure = new Rectangle(randomSideA, randomSideB);
                randomFigure.setColor(colorSupplier.getRandomColor());
                break;
            case 2:
                randomFigure = new Square(randomSide);
                randomFigure.setColor(colorSupplier.getRandomColor());
                break;
            case 3:
                randomFigure = new IsoscelesTrapezoid(randomBaseA, randomBaseB, randomSideC);
                randomFigure.setColor(colorSupplier.getRandomColor());
                break;
            case 4:
                randomFigure = new RightTriangle(randomFirstLeg, randomSecondLeg);
                randomFigure.setColor(colorSupplier.getRandomColor());
                break;
            default:
                break;
        }
        return randomFigure;
    }

    public Figure getDefoultFigure() {
        Figure circle = new Circle(DEFAULT_RADIUS);
        circle.setColor(DEFAULT_COLOR);
        return circle;
    }
}
