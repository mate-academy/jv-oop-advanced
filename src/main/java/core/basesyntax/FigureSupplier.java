package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Figure figure;

    public Figure getRandomFigure() {
        int numOfFigure = random.nextInt(Figure.amountOfFigures);
        switch (numOfFigure) {
            case 0:
                figure = new Circle(colorSupplier.getRandomColor(), random.nextInt(1,10));
                break;
            case 1:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(1,10), random.nextInt(1,10),
                        random.nextInt(1,10));
                break;
            case 2:
                figure = new Rectangle(colorSupplier.getRandomColor(), random.nextInt(1,10),
                        random.nextInt(1,10));
                break;
            case 3:
                figure = new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(1,10),
                        random.nextInt(1,10));
                break;
            case 4:
                figure = new Square(colorSupplier.getRandomColor(), random.nextInt(1,10));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + numOfFigure);
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        figure = new Circle("White", 10);
        return figure;
    }
}
