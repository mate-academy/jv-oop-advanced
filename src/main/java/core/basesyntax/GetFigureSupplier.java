package core.basesyntax;

import java.util.Random;

public class GetFigureSupplier extends GetFigure {
    private static final int RANGE = 100;
    private static final String DEFAULT_COLOR = "WHITE";
    private static int index;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private String figureType;
    private GetFigure figure;
    private String figureColor;

    public GetFigure getRandomFigure() {
        index = random.nextInt(FigureType.values().length);
        figureType = FigureType.values()[index].name();
        figureColor = colorSupplier.getRandomColor();
        switch (figureType) {
            case "SQUARE":
                figure = new Square(random.nextInt(RANGE));
                figure.setColor(figureColor);
                return figure;
            case "RECTANGLE":
                figure = new Rectangle(random.nextInt(RANGE), random.nextInt(RANGE));
                figure.setColor(figureColor);
                return figure;
            case "RIGHT_TRIANGLE":
                figure = new RightTriangle(random.nextInt(RANGE), random.nextInt(RANGE));
                figure.setColor(figureColor);
                return figure;
            case "CIRCLE":
                figure = new Circle(random.nextInt(RANGE));
                figure.setColor(figureColor);
                return figure;
            case "ISOSCELES_TRAPEZOID":
                figure = new IsoscelesTrapezoid(random.nextInt(RANGE),
                        random.nextInt(RANGE), random.nextInt(RANGE));
                figure.setColor(figureColor);
                return figure;
            default:
                return null;
        }
    }

    public GetFigure getDefaultFigure() {
        figure = new Circle(10);
        figure.setColor(DEFAULT_COLOR);
        return figure;
    }
}
