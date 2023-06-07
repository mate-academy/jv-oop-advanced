package core.basesyntax;

import java.util.Random;

public class FigureSupplier implements NumberSupplier {
    private static final int RADIUS_CIRCLE = 10;
    private static final String DEFAULT_COLOR = Color.BLACK.toString();
    private int randomSideSize = getRandomIntNumber();
    private int amountFigureType = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private String randomColor = colorSupplier.getRandomColor();
    
    public Figure getRandomFigure() {
        switch (random.nextInt(amountFigureType)) {
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
        return new Random().nextInt(20);
    }
    
    private Figure getRandomCircle() {
        return new Circle(randomColor, randomSideSize);
    }
    
    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(randomColor, randomSideSize, randomSideSize, randomSideSize);
    }
    
    private Figure getRandomRectangle() {
        return new Rectangle(randomColor, randomSideSize, randomSideSize);
    }
    
    private Figure getRandomRightTriangle() {
        return new RightTriangle(randomColor, randomSideSize, randomSideSize);
    }
    
    private Figure getRandomSquare() {
        return new Square(randomColor, randomSideSize);
    }
    
    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, RADIUS_CIRCLE);
    }
}
