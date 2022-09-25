package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int maxRandom = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int inde = random.nextInt(FigureEnum.values().length);
        FigureEnum figureEnum = FigureEnum.values()[inde];
        ColorSupplier colorSupplier = new ColorSupplier();
        Color color = colorSupplier.getRandomColor();
        int sidr = random.nextInt(maxRandom) + 1;
        switch (figureEnum) {
            case circle:
                return new Circle(color.name(), sidr);
            case isoscelestrapezoid:
                return new IsoscelesTrapezoid(color.name(), sidr, sidr + 3, sidr);
            case restangle:
                return new Rectangle(color.name(), sidr, sidr + 2);
            case righttriangle:
                return new RightTriangle(color.name(), sidr, sidr + 2);
            case square:
                return new Square(color.name(), sidr);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.white.name(), 10);
    }
}
