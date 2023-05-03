package core.basesyntax;

import java.util.Random;
public class FigureSupplier {
    ColorSupplier colorSupplier = new ColorSupplier();
    Random random = new Random();

    public Figure getRandomFigure() {
        Figure figure;
        int NUMBER_OF_FIGURES = 5;
        int randomFigure = random.nextInt(NUMBER_OF_FIGURES);

        switch (randomFigure) {
            case 0:
                figure = new Circle(colorSupplier.getRandomColor(), getRandomSide());
                break;
            case 1:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomSide(),
                        getRandomSide(), getRandomSide());
                break;
            case 2:
                figure = new Rectangle(colorSupplier.getRandomColor(), getRandomSide(),
                        getRandomSide(), getRandomSide());
                break;
            case 3:
                figure = new RightTriangle(colorSupplier.getRandomColor(), getRandomSide(),
                        getRandomSide());
                break;
            default:
                figure = new Square(colorSupplier.getRandomColor(), getRandomSide());
                break;
        }

        return figure;
    }

    private double getRandomSide() {
        int MAX_SIDE_UNITS = 19;
        return random.nextDouble(MAX_SIDE_UNITS) + 1;
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10.00);
    }
}
