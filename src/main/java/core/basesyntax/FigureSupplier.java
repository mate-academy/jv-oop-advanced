package core.basesyntax;

import java.util.Random;

public class FigureSupplier implements NumberSupplier, ColorSupplier {
    private static final int RADIUS_CIRCLE = 10;
    private static final String DEFAULT_COLOR = Color.BLACK.name();
    private static final int AMOUNT_OF_FIGURE_TYPE = 5;
    private static final int MAX_SIZE_VALUE_OF_SIDE = 20;
    private final Random random = new Random();
    
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
        return random.nextInt(MAX_SIZE_VALUE_OF_SIDE);
    }
    
    @Override
    public String getRandomColor() {
        final int index = new Random().nextInt(Color.values().length);
        return Color.values()[index].name().toLowerCase();
    }
    
    private Figure getRandomCircle() {
        return new Circle(getRandomColor(), getRandomIntNumber());
    }
    
    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(getRandomColor(),
                getRandomIntNumber(), getRandomIntNumber(),
                getRandomIntNumber());
    }
    
    private Figure getRandomRectangle() {
        return new Rectangle(getRandomColor(), getRandomIntNumber(),
                getRandomIntNumber());
    }
    
    private Figure getRandomRightTriangle() {
        return new RightTriangle(getRandomColor(), getRandomIntNumber(),
                getRandomIntNumber());
    }
    
    private Figure getRandomSquare() {
        return new Square(getRandomColor(), getRandomIntNumber());
    }
    
    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, RADIUS_CIRCLE);
    }
    
}
