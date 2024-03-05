package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_PARAMETER = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Shape getRandomFigure() {
        Color color = colorSupplier.getRandomColor();
        int figureType = random.nextInt(5);
        switch (figureType) {
            case 0:
                return new Circle(color, random.nextInt(MAX_PARAMETER) + 1);
            case 1:
                return new Square(color, random.nextInt(MAX_PARAMETER) + 1);
            case 2:
                return new Rectangle(
                    color, 
                    random.nextInt(MAX_PARAMETER) + 1, 
                    random.nextInt(MAX_PARAMETER) + 1
                );
            case 3:
                return new IsoscelesTrapezoid(
                    color, 
                    random.nextInt(MAX_PARAMETER) + 1, 
                    random.nextInt(MAX_PARAMETER) + 1, 
                    random.nextInt(MAX_PARAMETER) + 1
                );
            case 4:
                return new RightTriangle(
                    color, 
                    random.nextInt(MAX_PARAMETER) + 1, 
                    random.nextInt(MAX_PARAMETER) + 1
                );
            default:
                return getDefaultFigure();
        }
    }

    public Shape getDefaultFigure() {
        return new Circle(Color.BLUE, 10);
    }
}
