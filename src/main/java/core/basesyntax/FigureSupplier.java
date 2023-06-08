package core.basesyntax;

import java.util.Random;

public class FigureSupplier implements NumberSupplier {
    private static final int RADIUS_CIRCLE = 10;
    private static final String DEFAULT_COLOR = Color.BLACK.toString();
    private static final int AMOUNT_OF_FIGURE_TYPE = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    
    public Figure getRandomFigure() {
        switch (random.nextInt(AMOUNT_OF_FIGURE_TYPE)) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
            default:
                return getRandomSquare();
        }
    }
    
    public int getRandomIntNumber() {
        return random.nextInt(20);
    }
    
    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomIntNumber());
    }
    
    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomIntNumber(), getRandomIntNumber(),
                getRandomIntNumber());
    }
    
    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getRandomIntNumber(),
                getRandomIntNumber());
    }
    
    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), getRandomIntNumber(),
                getRandomIntNumber());
    }
    
    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomIntNumber());
    }
    
    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, RADIUS_CIRCLE);
    }
}
