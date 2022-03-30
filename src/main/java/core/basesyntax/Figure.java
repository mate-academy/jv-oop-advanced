package core.basesyntax;

import java.util.Random;

public class Figure {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private FigureType figureType = FigureType.values()[random.nextInt(FigureType.values().length)];
    private Color color = colorSupplier.getRandomColor();

    public Color getColor() {
        return color;
    }

    public FigureType getFigureType() {
        return figureType;
    }

    public Figure drawDefault() {
        return new Circle();
    }

    public Figure draw(FigureType figureType) {
        switch (figureType) {
            case square:
                return new Square(random.nextInt(50));
            case rectangle:
                return new Rectangle(random.nextInt(50), random.nextInt(50));
            case circle:
                return new Circle(random.nextInt(50));
            case right_triangle:
                return new RightTriangle(random.nextInt(50), random.nextInt(50));
            case isosceles_trapezoid:
                return new IsoscelesTrapezoid(random.nextInt(50), random.nextInt(50),
                        random.nextInt(50));
            default:
                return null;
        }
    }
}
