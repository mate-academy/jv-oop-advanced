package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Figure figure;

    private int getSide() {
        return random.nextInt(1,10);
    }

    public Figure getRandomFigure() {
        int numOfFigure = random.nextInt(Figure.amountOfFigures);
        String color = colorSupplier.getRandomColor();
        switch (numOfFigure) {
            case 0:
                figure = new Circle(color, getSide());
                break;
            case 1:
                figure = new IsoscelesTrapezoid(color, getSide(),
                        getSide(), getSide());
                break;
            case 2:
                figure = new Rectangle(color, getSide(), getSide());
                break;
            case 3:
                figure = new RightTriangle(color, getSide(), getSide());
                break;
            case 4:
                figure = new Square(color, getSide());
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + numOfFigure);
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        figure = new Circle(colorSupplier.getConstantColor(), Figure.defaultRadius);
        return figure;
    }
}
