package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColors();
        switch (random.nextInt(5)) {
            case 0 : return new Circle(color, random.nextDouble(10));
            case 1 : return new IsoscelesTrapezoid(color, random.nextDouble(10),
                    random.nextDouble(10),
                    random.nextDouble(10));
            case 2 : return new Rectangle(color,random.nextDouble(10),random.nextDouble(10));
            case 3 : return new RightTriangle(color,random.nextDouble(10),random.nextDouble(10));
            case 4 : return new Square(color,random.nextDouble(10));
            default : return new Circle("white",10);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white",10);
    }
}
