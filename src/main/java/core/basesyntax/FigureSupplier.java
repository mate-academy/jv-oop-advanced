package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int BOUND = 20;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure figure;
        int index = random.nextInt(FigureName.values().length);
        switch (FigureName.values()[index]) {
            case CIRCLE:
                figure = new Circle(colorSupplier.getRandomColor(), random.nextInt(BOUND));
                break;
            case SQUARE:
                figure = new Square(colorSupplier.getRandomColor(), random.nextInt(BOUND));
                break;
            case RECTANGLE:
                figure = new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(BOUND), random.nextInt(BOUND));
                break;
            case RIGHT_TRIANGLE:
                figure = new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(BOUND), random.nextInt(BOUND));
                break;
            default:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(BOUND), random.nextInt(BOUND), random.nextInt(BOUND));
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        Figure figure = new Circle(Color.WHITE, 10);
        return figure;
    }

}
