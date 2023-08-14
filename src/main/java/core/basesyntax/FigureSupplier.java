package core.basesyntax;

import core.basesyntax.figures.*;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int DEFAULT_RADIUS = 10;
    public static final Color DEFAULT_COLOR = Color.WHITE;
    private final ColorSupplier colorSupplier = new ColorSupplier();


    private final Random random = new Random();

    public Figure getRandomFigure(){
        int randomIndex = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        switch (randomIndex) {
            case 0:
                return new Square(color, random.nextInt());
            case 1:
                return new RightTriangle(color,random.nextDouble(), random.nextDouble());
            case 2:
                return new Rectangle(color, random.nextInt(), random.nextInt());
            case 3:
                return new IsoscelesTrapezoid(color,random.nextInt(), random.nextInt(), random.nextInt());
            case 4:
                return new Circle(color, random.nextInt());
            default:
                return getDefaultFigure();
        }
    }
    public Figure getDefaultFigure(){
        return new Circle(DEFAULT_COLOR.toString(), DEFAULT_RADIUS);
    }
}
