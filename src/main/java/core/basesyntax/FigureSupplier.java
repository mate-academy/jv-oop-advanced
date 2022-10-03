package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int DEFAULT_CIRCLE_RADIUS = 10;
    public static final int MAX_SIDE_BOUND = 20;
    private Random random = new Random();

    public Figure getRandomFigure() {
        FigureName figureName = FigureName.values()[random.nextInt(FigureName.values().length)];
        Color randomColor = Color.valueOf(ColorSupplier.getRandomColor());
        Figure figure = null;
        switch (figureName) {
            case CIRCLE:
                figure = new Circle(random.nextInt(MAX_SIDE_BOUND), randomColor);
                break;
            case ISOSCELESTRAPEZOID:
                figure = new IsoscelesTrapezoid(random.nextInt(MAX_SIDE_BOUND),
                        random.nextInt(MAX_SIDE_BOUND) + random.nextInt(MAX_SIDE_BOUND),
                        random.nextInt(MAX_SIDE_BOUND), randomColor);
                break;
            case RECTANGLE:
                figure = new Rectangle(random.nextInt(MAX_SIDE_BOUND),
                        random.nextInt(MAX_SIDE_BOUND), randomColor);
                break;
            case RIGHTTRIANGLE:
                figure = new RightTriangle(random.nextInt(MAX_SIDE_BOUND),
                        random.nextInt(MAX_SIDE_BOUND), randomColor);
                break;
            case SQUARE:
                figure = new Square(random.nextInt(MAX_SIDE_BOUND), randomColor);
                break;
            default:
                figure = getDefaultFigure();
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, Color.WHITE);
    }
}
