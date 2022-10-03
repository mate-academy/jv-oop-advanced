package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_AMOUNT = 5;

    public Figure getRandomFigure() {
        ColorSupplier supplier = new ColorSupplier();
        Random random = new Random();
        int currentRandomFigureIndex = random.nextInt(FIGURE_AMOUNT);
        Figure randomFigure;
        switch (currentRandomFigureIndex) {
            case 0:
                randomFigure = new Circle(
                    "Circle",
                    random.nextInt(100),
                    supplier.getRandomColor()
            );
                break;
            case 1:
                randomFigure = new IsoscelesTrapezoid(
                        "IsoscelesTrapezoid",
                        random.nextInt(100),
                        random.nextInt(100),
                        random.nextInt(100),
                        supplier.getRandomColor()
                );
                break;
            case 2:
                randomFigure = new Rectangle(
                        "Rectangle",
                        random.nextInt(100),
                        random.nextInt(100),
                        supplier.getRandomColor()
                );
                break;
            case 3:
                randomFigure = new RightTriangle(
                        "RightTriangle",
                        random.nextInt(100),
                        random.nextInt(100),
                        supplier.getRandomColor()
                );
                break;
            case 4:
                randomFigure = new Square(
                        "Square",
                        random.nextInt(100),
                        supplier.getRandomColor()
                );
                break;
            default:
                randomFigure = null;
        }
        return randomFigure;
    }

    public Circle getDefaultFigure() {
        return new Circle(
                "Circle",
                10,
                "White"
        );
    }
}
