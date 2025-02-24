package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Figure figure = getDefaultFigure();
        ColorSupplier colorSupplier = new ColorSupplier();
        Color randomColor = colorSupplier.getRandomColor();
        double size1 = new Random().nextDouble(100);
        double size2 = new Random().nextDouble(100);
        double size3 = new Random().nextDouble(100);
        int index = new Random().nextInt(1,6);
        switch (index) {
            case 1 -> figure = new Square(randomColor, size1);
            case 2 -> figure = new Rectangle(randomColor, size1, size2);
            case 3 -> figure = new RightTriangle(randomColor, size1, size2);
            case 4 -> figure = new Circle(randomColor, size1);
            case 5 -> figure = new IsoscelesTrapezoid(randomColor, size1, size2, size3);
            default -> System.out.println("ERROR!");
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
