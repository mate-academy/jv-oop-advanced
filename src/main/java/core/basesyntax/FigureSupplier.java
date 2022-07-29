package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int FIGURE_LENGTH_MAX = 7;
    private static final Color finalCircleColor = Color.WHITE;
    private static final double circleRadius = 10.00;
    private static final Figure finalCircle = new Circle(finalCircleColor, circleRadius);
    Random random = new Random();
//    int randomFigure = random.nextInt(FIGURE_COUNT);
//    double randomFirstLeg = random.nextInt(FIGURE_LENGTH_MAX);
//    double randomSecondLeg = random.nextInt(FIGURE_LENGTH_MAX);
//    double randomHeight = random.nextInt(FIGURE_LENGTH_MAX);
//    ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int randomFigure = random.nextInt(FIGURE_COUNT)+1;
        double randomFirstLeg = random.nextInt(FIGURE_LENGTH_MAX)+1;
        double randomSecondLeg = random.nextInt(FIGURE_LENGTH_MAX)+1;
        double randomHeight = random.nextInt(FIGURE_LENGTH_MAX)+1;
        switch (randomFigure) {
            case 1:
                return  new Circle(colorSupplier.getRandomColor(),randomFirstLeg);
            case 2:
                return new Square(colorSupplier.getRandomColor(),randomFirstLeg);
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),randomFirstLeg,randomSecondLeg);
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(),randomFirstLeg,randomSecondLeg);
            case 5:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),randomFirstLeg,randomSecondLeg,randomHeight);
        }
       return null;
    }

    public Figure getDefaultFigure() {
        return finalCircle;
    }
}


