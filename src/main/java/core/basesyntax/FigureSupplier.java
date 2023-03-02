package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends Figure {
    private static final int range = 100;
    private static ColorSupplier colorSupplier;
    private static Random random = new Random();
    private static int index;
    private String figureType;
    private Figure figure;
    private String figureColor;

    public Figure getRandomFigure() {
        colorSupplier = new ColorSupplier();
        index = random.nextInt(FigureType.values().length);
        figureType = FigureType.values()[index].name();
        figureColor = colorSupplier.getRandomColor();
        switch (figureType) {
            case "Square":
                figure = new Square(random.nextInt(range));
                figure.setColor(figureColor);
                return figure;
            case "Rectangle":
                figure = new Rectangle(random.nextInt(range), random.nextInt(range));
                figure.setColor(figureColor);
                return figure;
            case "RightTriangle":
                figure = new RightTriangle(random.nextInt(range), random.nextInt(range));
                figure.setColor(figureColor);
                return figure;
            case "Circle":
                figure = new Circle(random.nextInt(range));
                figure.setColor(figureColor);
                return figure;
            case "IsoscelesTrapezoid":
                figure = new IsoscelesTrapezoid(random.nextInt(range),
                        random.nextInt(range), random.nextInt(range));
                figure.setColor(figureColor);
                return figure;
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        figure = new Circle(10);
        figure.setColor("WHITE");
        return figure;
    }
}
