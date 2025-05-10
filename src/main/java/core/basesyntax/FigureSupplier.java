package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier;
    private final Random rand;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
        this.rand = new Random();
    }

    public AbstractFigure getRandomFigure() {
        int figureType = rand.nextInt(5);
        Color randomColor = colorSupplier.getRandomColor();
        AbstractFigure figure;
        switch (figureType) {
            case 0:
                figure = createRandomSquare(randomColor);
                break;
            case 1:
                figure = createRandomRectangle(randomColor);
                break;
            case 2:
                figure = createRandomRightTriangle(randomColor);
                break;
            case 3:
                figure = createRandomCircle(randomColor);
                break;
            case 4:
                figure = createRandomIsoscelesTrapezoid(randomColor);
                break;
            default:
                throw new IllegalArgumentException("Invalid figure type");
        }
        System.out.println("Generated figure type: " + figureType);
        return figure;
    }

    public AbstractFigure getDefaultFigure() {
        Color defaultColor = Color.WHITE;
        double defaultRadius = 10.0;
        return new Circle(defaultColor, defaultRadius);
    }

    private Square createRandomSquare(Color color) {
        double sideLength = getRandomDouble();
        return new Square(color, sideLength);
    }

    private Rectangle createRandomRectangle(Color color) {
        double width = getRandomDouble();
        double height = getRandomDouble();
        return new Rectangle(width, height, color);
    }

    private RightTriangle createRandomRightTriangle(Color color) {
        double base = getRandomDouble();
        double height = getRandomDouble();
        return new RightTriangle(base, height, color);
    }

    private Circle createRandomCircle(Color color) {
        double radius = getRandomDouble();
        return new Circle(color, radius);
    }

    private IsoscelesTrapezoid createRandomIsoscelesTrapezoid(Color color) {
        double topBase = getRandomDouble();
        double bottomBase = getRandomDouble();
        double height = getRandomDouble();
        return new IsoscelesTrapezoid(color, topBase, bottomBase, height);
    }

    private double getRandomDouble() {
        return rand.nextDouble() * 10.0 + 1.0;
    }
}
