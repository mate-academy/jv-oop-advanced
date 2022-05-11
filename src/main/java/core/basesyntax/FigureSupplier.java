package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    protected Random random = new Random();
    protected double radius = random.nextDouble();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(FigureType.values().length);
        String color;
        double sideA;
        double sideB;
        switch (randomIndex) {
            case 0 :
                color = colorSupplier.getColorSupplier();
                radius = random.nextInt(100);
                return new Circle(color, radius);
            case 1 :
                color = colorSupplier.getColorSupplier();
                sideA = random.nextInt(100);
                sideB = random.nextInt(100);
                return new Rectangle(color, sideA, sideB);
            case 2 :
                color = colorSupplier.getColorSupplier();
                sideA = random.nextInt(100);
                return new Square(color, sideA);
            case 3 :
                color = colorSupplier.getColorSupplier();
                sideA = random.nextInt(100);
                return new RightTriangle(color,sideA);
            default :
                color = colorSupplier.getColorSupplier();
                sideA = random.nextInt(100);
                sideB = random.nextInt(100);
                double trapezoidHeight = random.nextInt(100);
                return new IsoscelesTrapezoid(color,sideA,sideB,trapezoidHeight);
        }
    }

    public Figure getDefaultFigure() {
        String color = "WHITE";
        double radiusDefault = 10;
        return new Circle(color, radiusDefault);
    }
}







