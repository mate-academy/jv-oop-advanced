package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int PARAM_DEF_RADIUS = 10;
    private static final Color PARAM_DEF_COLOR = Color.WHITE;
    private static final int MAX_RANDOM = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int rand = random.nextInt(MAX_RANDOM);
        Figure figure;
        switch (rand) {
            case 0:
                figure = new Circle(colorSupplier.getRandomColor(), random.nextDouble());
                break;
            case 1:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextDouble(),
                        random.nextDouble(), random.nextDouble());
                break;
            case 3:
                figure = new Square(colorSupplier.getRandomColor(), random.nextDouble());
                break;
            case 4:
                figure = new Rectangle(colorSupplier.getRandomColor(), random.nextDouble(),
                        random.nextDouble());
                break;
            default:
                figure = new RightTriangle(colorSupplier.getRandomColor(), random.nextDouble(),
                        random.nextDouble());
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(PARAM_DEF_COLOR, PARAM_DEF_RADIUS);
    }
}
