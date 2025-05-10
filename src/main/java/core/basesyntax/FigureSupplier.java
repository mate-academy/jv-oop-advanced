package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int DEFAULT_CIRCLE_RADIUS = 10;
    public static final int MAX_SIDE_BOUND = 20;
    private Random random = new Random();

    public Figure getRandomFigure() {
        FigureName figureName = FigureName.values()[random.nextInt(FigureName.values().length)];
        Color randomColor = Color.valueOf(ColorSupplier.getRandomColor());
        Figure figure = getDefaultFigure();
        switch (figureName) {
            case CIRCLE:
                figure = new Circle(randomColor, random.nextInt(MAX_SIDE_BOUND));
                break;
            case ISOSCELESTRAPEZOID:
                figure = new IsoscelesTrapezoid(randomColor, random.nextInt(MAX_SIDE_BOUND),
                        random.nextInt(MAX_SIDE_BOUND) + random.nextInt(MAX_SIDE_BOUND),
                        random.nextInt(MAX_SIDE_BOUND));
                break;
            case RECTANGLE:
                figure = new Rectangle(randomColor, random.nextInt(MAX_SIDE_BOUND),
                        random.nextInt(MAX_SIDE_BOUND));
                break;
            case RIGHTTRIANGLE:
                figure = new RightTriangle(randomColor, random.nextInt(MAX_SIDE_BOUND),
                        random.nextInt(MAX_SIDE_BOUND));
                break;
            default:
                figure = new Square(randomColor, random.nextInt(MAX_SIDE_BOUND));
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_CIRCLE_RADIUS);
    }
}
