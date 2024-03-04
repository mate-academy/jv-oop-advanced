package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_PARAMETER = 10;
    private static final int FIGURE_TYPES = 5;
    private Random random = new Random();

    public Shape getRandomFigure() {
        int figureType = random.nextInt(FIGURE_TYPES);
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                return new Circle(color, getRandomParameter());
            case 1:
                return new Square(color, getRandomParameter());
            case 2:
                return new Rectangle(
                    color, 
                    getRandomParameter(), 
                    getRandomParameter()
                );
            case 3:
                return new IsoscelesTrapezoid(
                    color, 
                    getRandomParameter(), 
                    getRandomParameter(), 
                    getRandomParameter()
                );
            default:
                return getDefaultFigure();
        }
    }

    private int getRandomParameter() {
        return random.nextInt(MAX_PARAMETER) + 1;
    }

    public Shape getDefaultFigure() {
        return new Circle("white", 10);
    }
}
