package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private Circle circle = new Circle(getSide(), ColourSupplier.getRandomColors());
    private Square square = new Square(getSide(), ColourSupplier.getRandomColors());
    private Triangle triangle = new Triangle(getSide(), ColourSupplier.getRandomColors());
    private Rectangle rectangle = new Rectangle(getSide(), ColourSupplier.getRandomColors());
    private IsoscelesTrapezoid zoid = new IsoscelesTrapezoid(getSide(),
            ColourSupplier.getRandomColors());
    private String[] figures = new String[]{circle.toString(), square.toString(),
            triangle.toString(), rectangle.toString(), zoid.toString()};

    public String[] getFigures() {
        return figures;
    }

    public double getSide() {
        double sideSize = random.nextInt(FIGURE_COUNT) + 1;
        return sideSize;
    }

    public int getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT) + 1;
        return figureNumber;
    }

}
