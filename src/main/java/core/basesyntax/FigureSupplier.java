package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 20;
    private static final int MAX_VALUE_OF_DEFAULT_FIGURE = 10;
    private static final String COLOR_OF_DEFAULT_FIGURE = "White";
    private static final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure(Figure[] figures) {
        int index = random.nextInt(figures.length);

        switch (index) {
            case 0:
                double radius = random.nextDouble(MAX_VALUE);
                String color = colorSupplier.getRandomColor();
                return new Circle(radius, color);
            case 1:
                double firstLeg = random.nextDouble(MAX_VALUE);
                double secondLeg = random.nextDouble(MAX_VALUE);
                String color2 = colorSupplier.getRandomColor();
                return new Rectangle(firstLeg, secondLeg, color2);
            case 2:
                double firstLeg3 = random.nextDouble(MAX_VALUE);
                String color3 = colorSupplier.getRandomColor();
                return new RightTriangle(firstLeg3, color3);
            case 3:
                double firstLeg4 = random.nextDouble(MAX_VALUE);
                double secondLeg4 = random.nextDouble(MAX_VALUE);
                double thirdLeg4 = random.nextDouble(MAX_VALUE);
                String color4 = colorSupplier.getRandomColor();
                return new IsoscelesTrapezoid(firstLeg4, secondLeg4, thirdLeg4, color4);
            default:
                double firstLeg5 = random.nextDouble(MAX_VALUE);
                String color5 = colorSupplier.getRandomColor();
                return new Square(firstLeg5, color5);
        }
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle(MAX_VALUE_OF_DEFAULT_FIGURE, COLOR_OF_DEFAULT_FIGURE);
        return circle;
    }
}
