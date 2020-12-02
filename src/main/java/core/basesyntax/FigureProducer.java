package core.basesyntax;

import java.util.Random;

public class FigureProducer {
    protected Figure getRandomFigure() {
        int randomGeneratedIndex = new Random().nextInt(4);
        switch (randomGeneratedIndex) {
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

    private int randomNumberForLengthSideFigure() {
        return new Random().nextInt(100);
    }

    private Circle getCircle() {
        return new Circle(new ColorProducer().getRandomColor(), randomNumberForLengthSideFigure());
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(new ColorProducer().getRandomColor(),
                randomNumberForLengthSideFigure(), randomNumberForLengthSideFigure(),
                randomNumberForLengthSideFigure());
    }

    private Rectangle getRectangle() {
        return new Rectangle(new ColorProducer().getRandomColor(),
                randomNumberForLengthSideFigure(),
                randomNumberForLengthSideFigure());
    }

    private RightTriangle getRightTriangle() {
        return new RightTriangle(new ColorProducer().getRandomColor(),
                randomNumberForLengthSideFigure(),
                randomNumberForLengthSideFigure());
    }

    private Square getSquare() {
        return new Square(new ColorProducer().getRandomColor(), randomNumberForLengthSideFigure());
    }
}
