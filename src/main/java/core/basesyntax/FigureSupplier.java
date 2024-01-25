package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE_TYPES = 5; //5 figure types
    private final ColorSupplier colorSupplier;
    private final Random random;

    public FigureSupplier() {
        this.colorSupplier = new ColorSupplier();
        this.random = new Random();
    }

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int figureType = random.nextInt(MAX_FIGURE_TYPES);
        Figure figure;

        switch (figureType) {
            case 0 -> {
                double squareSide = random.nextDouble() * 100 + 1;
                figure = new Square(color, squareSide);
            }
            case 1 -> {
                double shortSide = random.nextDouble() * 100 + 1;
                double longSide = random.nextDouble() * 100 + 1;
                figure = new Rectangle(color, longSide, shortSide);
            }
            case 2 -> {
                double firstCathetus = random.nextDouble() * 100 + 1;
                double secondCathetus = random.nextDouble() * 100 + 1;
                figure = new RightTriangle(color, firstCathetus, secondCathetus);
            }
            case 3 -> {
                double radius = random.nextDouble() * 100 + 1;
                figure = new Circle(color, radius);
            }
            case 4 -> {
                double lowBase = random.nextDouble() * 100 + 1;
                double topBase = random.nextDouble() * 100 + 1;
                double leg = random.nextDouble() * 100 + 1;
                figure = new IsoscelesTrapezoid(color, lowBase, topBase, leg);
            }
            default -> {
                figure = new Square(color, 1);
            }
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
