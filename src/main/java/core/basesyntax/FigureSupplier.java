package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private Figure figure;
    private ColorSupplier colorSupplier = new ColorSupplier();

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
        }
        return figure;
    }

    public Figure getRandomFigure() {
        Figures[] values = Figures.values();
        float random1 = 20 * random.nextFloat();
        float random2 = 20 * random.nextFloat();
        float random3 = 20 * random.nextFloat();
        switch (random.nextInt(values.length)) {
            case 0:
                figure = new Circle(random1);
                break;
            case 1:
                figure = new IsoscelesTrapezoid(random1, random2, random3);
                break;
            case 2:
                figure = new Rectangle(random1, random2);
                break;
            case 3:
                figure = new RightTriangle(random1, random2);
                break;
            case 4:
                figure = new Square(random1);
                break;
            default:
        }
        return figure;
    }


}
