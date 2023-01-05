package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = String.valueOf(Color.WHITE);
    private final ColorSupplier color = new ColorSupplier();
    private static final int INDEX = 5;
    private static final int SIDE = 10;
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
     return new Circle(random.nextInt(SIDE), color.getRandomColor());
    }
    private IsoscelesTrapezoid getIsoscelesTrapezoid(){
        return new IsoscelesTrapezoid(random.nextInt(SIDE),random.nextInt(SIDE),random.nextInt(SIDE), color.getRandomColor());
    }
    private Rectangle getRectangle (){
        return new Rectangle(random.nextInt(SIDE),random.nextInt(SIDE), color.getRandomColor());
    }
    private RightTriangle getRightTriangle(){
        return new RightTriangle(random.nextInt(SIDE),random.nextInt(SIDE), color.getRandomColor());
    }
    private Square getSquare(){
        return new Square(random.nextInt(SIDE), color.getRandomColor());
    }
    public Figure getDefaultFigure() {
        return new Circle(SIDE, DEFAULT_COLOR);
    }
}
