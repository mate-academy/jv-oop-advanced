package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private Figure figure;
    ColorSupplier colorSupplier = new ColorSupplier();
    public Figure getDefaultFigure() {
        Figures[] values = Figures.values();
        switch (values[random.nextInt(values.length)].toString()) {
            case "CIRCLE":
                figure = new Circle();
                break;
            case "ISOSCELES_TRAPEZOID":
                figure = new IsoscelesTrapezoid();
                break;
            case "RECTANGLE":
                figure = new Rectangle();
                break;
            case "RIGHT_TRIANGLE":
                figure = new RightTriangle();
                break;
            case "SQUARE":
                figure = new Square();
                break;
            default:
                return null;
        }
        figure.color = colorSupplier.getRandomColor();
        return figure;
    }

    public Figure getRandomFigure() {
        Figures[] values = Figures.values();
        float random1 = 20 * random.nextFloat();
        float random2 = 20 * random.nextFloat();
        float random3 = 20 * random.nextFloat();
        switch (values[random.nextInt(values.length)].toString()) {
            case "CIRCLE":
                figure = new Circle(random1);
                break;
            case "ISOSCELES_TRAPEZOID":
                figure = new IsoscelesTrapezoid(random1, random2, random3);
                break;
            case "RECTANGLE":
                figure = new Rectangle(random1, random2);
                break;
            case "RIGHT_TRIANGLE":
                figure = new RightTriangle(random1, random2);
                break;
            case "SQUARE":
                figure = new Square(random1);
                break;
            default:
                return null;
        }
        figure.color = colorSupplier.getRandomColor();
        return figure;
    }
}
