package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = String.valueOf(Color.WHITE);
    private static final int DEFAULT_RADIUS = 10;
    private final ColorSupplier color = new ColorSupplier();
    static final int INDEX = 5;
    static final int SIDE = new Random().nextInt(10);
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int value = random.nextInt(INDEX);
        switch (value) {
            case 0:
                return getCircle();
            case 1:
                return getIsoscelesTrapezoid();
            case 2:
                return getRectangle();
            case 3:
                return getRightTriangle();
            default:
                return getSquare();
        }
    }
    private Circle getCircle(){
     return new Circle(SIDE,color.getRandomColor());
    }
    private IsoscelesTrapezoid getIsoscelesTrapezoid(){
        return new IsoscelesTrapezoid(SIDE,SIDE,SIDE, color.getRandomColor());
    }
    private Rectangle getRectangle (){
        return new Rectangle(SIDE,SIDE, color.getRandomColor());
    }
    private RightTriangle getRightTriangle(){
        return new RightTriangle(SIDE,SIDE, color.getRandomColor());
    }
    private Square getSquare(){
        return new Square(SIDE, color.getRandomColor());
    }
    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
