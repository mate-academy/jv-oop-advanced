package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    Random random = new Random();
    public static final int MAX_SIZE = 100;
    public Figure getRandomFigure() {
        Figure figure;
        ColorSupplier colorSupplier = new ColorSupplier();
        Color randomColor = colorSupplier.getRandomColor();
        double size1 = random.nextDouble(MAX_SIZE);
        double size2 = random.nextDouble(MAX_SIZE);
        double size3 = random.nextDouble(MAX_SIZE);
        int index = random.nextInt(1,6);
        switch (index) {
            case 1 -> figure = new Square(randomColor, size1);
            case 2 -> figure = new Rectangle(randomColor, size1, size2);
            case 3 -> figure = new RightTriangle(randomColor, size1, size2);
            case 4 -> figure = new Circle(randomColor, size1);
            case 5 -> figure = new IsoscelesTrapezoid(randomColor, size1, size2, size3);
            default -> figure = getDefaultFigure();
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
