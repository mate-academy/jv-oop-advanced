package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER = 5;
    private static final int MAX_PARAMETR = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int firstLeg = random.nextInt(MAX_PARAMETR);
        int secondLeg = random.nextInt(MAX_PARAMETR);
        int radius = random.nextInt(MAX_PARAMETR);
        int height = random.nextInt(MAX_PARAMETR);
        switch (random.nextInt(MAX_NUMBER)) {
            case 0:
                return new Circle(color,radius);
            case 1:
                return new IsoscelesTrapezoid(color, firstLeg,secondLeg,height);
            case 2:
                return new Rectangle(color,firstLeg,secondLeg);
            case 3:
                return new RightTriangle(color, firstLeg,secondLeg);
            default:
                return new Square(color, firstLeg);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
