package core.basesyntax;

import java.util.Random;

public class FigureSupplier{
    private final Random random = new Random();
    private final int  RANDOM_RADIUS = this.random.nextInt((100) + 1);
    private final int  RANDOM_SIDE = this.random.nextInt((100) + 1);
    private final int  RANDOM_SIDE_A = this.random.nextInt((100) + 1);
    private final int  RANDOM_SIDE_B = this.random.nextInt((100) + 1);
    private final int  RANDOM_SIDE_C = this.random.nextInt((100) + 1);
    private final int  RANDOM_BASE_A = this.random.nextInt((100) + 1);
    private final int  RANDOM_BASE_B = this.random.nextInt((100) + 1);
    private final int  RANDOM_FIRST_LEG = this.random.nextInt((100) + 1);
    private final int  RANDOM_SECOND_LEG = this.random.nextInt((100) + 1);
    private final Figure [] FIGURES = { new Circle(RANDOM_RADIUS), new Rectangle(RANDOM_SIDE_A, RANDOM_SIDE_B), new Square(RANDOM_SIDE), new IsoscelesTrapezoid(RANDOM_BASE_A, RANDOM_BASE_B, RANDOM_SIDE_C), new RightTriangle(RANDOM_FIRST_LEG, RANDOM_SECOND_LEG)};
    ColorSupplier colorSupplier = new ColorSupplier();

    public static final int NUMBER_OF_FIGURES = 5;

public Figure getRandomFigure() {
    int index = random.nextInt(NUMBER_OF_FIGURES);
    Figure figure = FIGURES[index];
    figure.setColor(colorSupplier.getRandomColor());
    return figure;
    }
public Figure getDefoultFigure() {
    Figure circle = new Circle(10);
    circle.setColor(Color.WHITE.name());
    return circle;
    }
}
