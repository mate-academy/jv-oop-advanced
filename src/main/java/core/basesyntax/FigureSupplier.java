package core.basesyntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE_FOR_RANDOM = 20;
    private static final double DEFAULT_RADIUS_CIRCLE = 10.0;
    private static final int NUMBERS_OF_FIGURES = 4;
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure square = new Square(color.getRandomColor(), random.nextInt(MAX_VALUE_FOR_RANDOM));
        Figure rightTriangle = new RightTriangle(color.getRandomColor(),
                random.nextInt(MAX_VALUE_FOR_RANDOM), random.nextInt(MAX_VALUE_FOR_RANDOM));
        Figure rectangle = new Rectangle(color.getRandomColor(),
                random.nextInt(MAX_VALUE_FOR_RANDOM), random.nextInt(MAX_VALUE_FOR_RANDOM));
        Figure trapezoid = new IsoscelesTrapezoid(color.getRandomColor(),
                random.nextInt(MAX_VALUE_FOR_RANDOM), random.nextInt(MAX_VALUE_FOR_RANDOM),
                random.nextInt(MAX_VALUE_FOR_RANDOM));
        List<Figure> figures = new ArrayList<>();
        figures.add(square);
        figures.add(rightTriangle);
        figures.add(rectangle);
        figures.add(trapezoid);
        return figures.get(random.nextInt(NUMBERS_OF_FIGURES));
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle(Color.WHITE.toString().toLowerCase(), DEFAULT_RADIUS_CIRCLE);
        return circle;
    }
}
