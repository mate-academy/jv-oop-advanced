package core.basesyntax;

import java.util.Random;

public class FigureProducer {
    public static final int FIGURE_NUMBERS = 5;

    public static Figure getFigure() {
        int randomGeneratedIndex = new Random().nextInt(FIGURE_NUMBERS);
        switch (randomGeneratedIndex) {
            case 0:
                return getCircle();
            case 1:
                return getRectangle();
            case 2:
                return getSquare();
            case 3:
                return getIsoscelesTrapezoid();
            case 4:
                return getRightTriangle();
            default:
                return null;
        }
    }

    private static Color randomColor() {
        Random random = new Random();
        return Color.values()[random.nextInt(Color.values().length)];
    }

    private static Circle getCircle() {
        return new Circle(FigureProducer.randomColor().name(),
                (int) (Math.random() * 25) + 3);
    }

    private static IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(FigureProducer.randomColor().name(),
                (int) (Math.random() * 25) + 5,
                (int) (Math.random() * 25) + 5, (int) (Math.random() * 10) + 3);

    }

    private static Rectangle getRectangle() {
        return new Rectangle(FigureProducer.randomColor().name(),
                (int) (Math.random() * 25) + 5,
                (int) (Math.random() * 15) + 3);
    }

    private static RightTriangle getRightTriangle() {
        return new RightTriangle(FigureProducer.randomColor().name(),
                (int) (Math.random() * 25) + 5,
                (int) (Math.random() * 25) + 3);
    }

    private static Square getSquare() {
        return new Square(FigureProducer.randomColor().name(),
                (int) (Math.random() * 25) + 5);
    }

}

