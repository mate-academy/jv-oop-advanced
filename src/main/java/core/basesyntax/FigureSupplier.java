package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final float DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private FigType figure;

    public Figure getRandomFigure() {
        FiguresRindomizer randomFigure = new FiguresRindomizer();
        figure = FigType.values()[random.nextInt(FigType.values().length)];
        switch (figure) {
            case Circle: return randomFigure.getRandomCircle();
            case Square: return randomFigure.getRandomSquare();
            case Rectangle: return randomFigure.getRandomRectangle();
            case RightTriangle: return randomFigure.getRandomRightTriangle();
            case IsoscelesTrapezoid: return randomFigure.getRandomIsoscelesTrapezoid();
            default: return null;
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
        circle.setArea(circle.getArea());
        return circle;
    }
}
