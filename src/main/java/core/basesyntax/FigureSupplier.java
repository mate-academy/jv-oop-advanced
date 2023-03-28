package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private int randomeRadius = 0;
    private int squareRandomeSide = 0;
    private int rectangleRandomASide = 0;
    private int rectangleRandomBSide = 0;
    private int firstRandomeLeg = 0;
    private int secondRandomeLeg = 0;
    private int trapezoidRandomeASide = 0;
    private int trapezoidRandomeBSide = 0;
    private int trapezoidRandomeHeigth = 0;

    public Figure getRandomFigure() {
        String figureType = getRandomeType();
        Figure figure = null;
        switch (figureType) {
            case "circle":
                randomeRadius = random.nextInt(100);
                figure = new Circle(randomeRadius, colorSupplier.getRandomColor());
                break;
            case "square":
                squareRandomeSide = random.nextInt(100);
                figure = new Square(squareRandomeSide, colorSupplier.getRandomColor());
                break;
            case "rectangle":
                rectangleRandomASide = random.nextInt(100);
                rectangleRandomBSide = random.nextInt(100);
                figure = new Rectangle(rectangleRandomASide,
                                       rectangleRandomBSide,
                                       colorSupplier.getRandomColor());
                break;
            case "righttriangle":
                firstRandomeLeg = random.nextInt(100);
                secondRandomeLeg = random.nextInt(100);
                figure = new RightTriangle(firstRandomeLeg,
                                           secondRandomeLeg,
                                           colorSupplier.getRandomColor());
                break;
            case "isoscelestrapezoid":
                trapezoidRandomeASide = random.nextInt(100);
                trapezoidRandomeBSide = random.nextInt(100);
                trapezoidRandomeHeigth = random.nextInt(100);
                figure = new IsoscelesTrapezoid(trapezoidRandomeASide,
                                                trapezoidRandomeBSide,
                                                trapezoidRandomeHeigth,
                                                colorSupplier.getRandomColor());
                break;
            default:
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }

    private String getRandomeType() {
        int index = new Random().nextInt(Figures.values().length);
        return Figures.values()[index].toString().toLowerCase();
    }
}
