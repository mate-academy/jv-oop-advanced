package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colSup = new ColorSupplier();
    private Figure figure;
    private Shape shape;

    public Shape getRandomFigure() {

        int i = random.nextInt(Figure.values().length);
        figure = Figure.values()[i];

        switch (figure) {
            case CIRCLE:
                shape = new Circle(colSup.getRandomColor(), random.nextInt(100));
                break;
            case SQUARE:
                shape = new Square(colSup.getRandomColor(), random.nextInt(100));
                break;
            case RECTANGLE:
                shape = new Rectangle(colSup.getRandomColor(),
                        random.nextInt(100),
                        random.nextInt(100));
                break;
            case RIGHT_TRIANGLE:
                shape = new RightTriangle(colSup.getRandomColor(),
                        random.nextInt(100),
                        random.nextInt(100));
                break;
            case ISOSCELES_TRAPEZOID:
                shape = new IsoscelesTrapezoid(colSup.getRandomColor(),
                        random.nextInt(100),
                        random.nextInt(100),
                        random.nextInt(100));
                break;
            default:
                getDefaultFigure();
                break;
        }
        return shape;
    }

    public Shape getDefaultFigure() {
        return new Circle("White", 10);
    }
}
