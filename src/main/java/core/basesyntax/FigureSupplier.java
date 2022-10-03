package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MaxLength = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public String getFigure() {
        int index = random.nextInt(Figures.values().length);
        return Figures.values()[index].name();
    }

    public Figure getRandomFigure() {
        switch (getFigure()) {
            case "Circle" :
                return new Circle(random.nextInt(MaxLength), colorSupplier.getRandomColor());
            case "Square" :
                return new Square(random.nextInt(MaxLength), colorSupplier.getRandomColor());
            case "RightTriangle" :
                return new RightTriangle(random.nextInt(MaxLength), random.nextInt(MaxLength),
                        colorSupplier.getRandomColor());
            case "IsoscelesTrapezoid" :
                return new IsoscelesTrapezoid(random.nextInt(MaxLength), random.nextInt(MaxLength),
                        random.nextInt(MaxLength), colorSupplier.getRandomColor());
            default :
                return new Rectangle(random.nextInt(MaxLength), random.nextInt(MaxLength),
                        colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "White");
    }
}
