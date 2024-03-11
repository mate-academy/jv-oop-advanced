package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_VALUE = 1000;
    //adding bound: 1000 to avoid wrong area and to leave clarity code
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure[] figures = {
                new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(),//Color
                        random.nextInt(MAX_VALUE),//upperSide
                        random.nextInt(MAX_VALUE),//downSide
                        random.nextInt(MAX_VALUE)//height
                ),
                new Circle(
                        colorSupplier.getRandomColor(),//color
                        random.nextInt(MAX_VALUE)//radius
                ),
                new RightTriangle(
                        colorSupplier.getRandomColor(),//color
                        random.nextInt(MAX_VALUE),//firstLeg
                        random.nextInt(MAX_VALUE)//secondLeg
                ),
                new Rectangle(
                        colorSupplier.getRandomColor(),//color
                        random.nextInt(MAX_VALUE),//sideA
                        random.nextInt(MAX_VALUE)//sideB
                ),
                new Square(
                        colorSupplier.getRandomColor(),//color
                        random.nextInt(MAX_VALUE)//side
                )};
        return figures[random.nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
