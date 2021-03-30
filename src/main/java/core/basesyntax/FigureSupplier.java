package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE_PROPERTY = 50;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Color randomColor = colorSupplier.getRandomColor();
        int randomFigureNumber = new Random().nextInt(5);
        switch (randomFigureNumber) {
            case 0:
                return new Circle("Circle",
                        randomColor,
                        getRandomProperty()
                );
            case 1:
                return new IsoscelesTrapezoid("Isosceles Trapezoid",
                        randomColor,
                        getRandomProperty(),
                        getRandomProperty(),
                        getRandomProperty()
                );
            case 2:
                return new Rectangle("Rectangle",
                        randomColor,
                        getRandomProperty(),
                        getRandomProperty()
                );
            case 3:
                return new RightTriangle("Right Triangle",
                        randomColor,
                        getRandomProperty(),
                        getRandomProperty()
                );
            case 4:
                return new Square("Square",
                        randomColor,
                        getRandomProperty()
                );
            default:
                return new Square("Default Square",
                        Color.WHITE,
                        25
                );
        }
    }

    private int getRandomProperty() {
        return new Random().nextInt(MAX_FIGURE_PROPERTY);
    }
}
