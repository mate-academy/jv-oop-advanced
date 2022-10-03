package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAXIMUM_NUMBER = 10;
    private static final String DEFAULTCOLOR = "white";
    private static final double DEFAULTRADIUS = 10;

    public static Figure getDefaultFigure() {
        return new Circle (DEFAULTCOLOR, DEFAULTRADIUS);
    }


    public static String getRandomFigureName() {
        int index = new Random().nextInt(FigureList.values().length);
        return FigureList.values()[index].name();
    }
    public static Figure getRandomFigure(Circle circle) {
        return new Circle (ColorSupplier.getRandomColor(), new Random().nextInt(MAXIMUM_NUMBER));
    }

    public static Figure getRandomFigure(Square square) {
        return new Square (ColorSupplier.getRandomColor(), new Random().nextInt(MAXIMUM_NUMBER));
    }

    public static Figure getRandomFigure(Rectangle rectangle) {
        return new Rectangle (ColorSupplier.getRandomColor(), new Random().nextInt(MAXIMUM_NUMBER), new Random().nextInt(MAXIMUM_NUMBER));
    }
    public static Figure getRandomFigure(RightTriangle righttriangle) {
        return new RightTriangle (ColorSupplier.getRandomColor(), new Random().nextInt(MAXIMUM_NUMBER), new Random().nextInt(MAXIMUM_NUMBER));
    }
    public static Figure getRandomFigure(IsoscelesTrapezoid isoscelestrapezoid) {
        return new IsoscelesTrapezoid (ColorSupplier.getRandomColor(), new Random().nextInt(MAXIMUM_NUMBER), new Random().nextInt(MAXIMUM_NUMBER));
    }
}
