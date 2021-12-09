package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final int maxFigure;
    private final int maxBound;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public FigureSupplier(int maxFigure, int maxBound) {
        this.maxFigure = maxFigure;
        this.maxBound = maxBound;
    }

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int randomFigure = random.nextInt(maxFigure);
        switch (randomFigure) {
            case 0:
                return new Square("Square", randomColor, random.nextInt(maxBound),
                        random.nextInt(maxBound));
            case 1:
                return new RightTriangle(random.nextInt(maxBound), random.nextInt(maxBound),
                        "RightTriangle", randomColor);
            case 2:
                return new Rhombus("Rhombus", randomColor, random.nextInt(maxBound),
                        random.nextInt(maxBound));
            case 3:
                return new Rectangle("Rectangle", randomColor, random.nextInt(),
                        random.nextInt(maxBound));
            case 4:
                return new IsoscelesTrapezoid("IsoscelesTrapezoid", randomColor,
                        random.nextInt(maxBound),
                        random.nextInt(maxBound), random.nextInt(maxBound));
            default:
                return getRandomFigure();
        }
    }

    public Figure[] getDefaultFigure() {
        Rectangle defaultRectangle = new Rectangle("Rectangle", "White",7,21);
        Square defaultSquare = new Square("Square", "Green",5,14);
        Circle defaultCircle = new Circle("Circle", "White", 2);
        Figure[] figures = {defaultCircle,defaultSquare,defaultRectangle};
        return figures;

    }
}
