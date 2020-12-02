package core.basesyntax;

import java.util.Random;

public class FigureProducer {
    static final int AMOUNT_FIGURES = 5;

    public Figure get() {
        int randomIndex = new Random().nextInt(AMOUNT_FIGURES);
        switch (randomIndex) {
            case 0:
                return newCircle();
            case 1:
                return newIsoscelesTrapezoid();
            case 2:
                return newRectangle();
            case 3:
                return newRightTriangle();
            case 4:
            default:
                return newSquare();
        }
    }

    private Circle newCircle() {
        Circle circle = new Circle(RandomLongProducer.get(), "circle");
        return circle;
    }

    private IsoscelesTrapezoid newIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(ColorProducer.get()
                .toString().toLowerCase(),
                RandomLongProducer.get(), RandomLongProducer.get(),
                RandomLongProducer.get(), "isosceles trapezoid");
        return isoscelesTrapezoid;
    }

    private Rectangle newRectangle() {
        Rectangle rectangle = new Rectangle(RandomLongProducer.get(),
                RandomLongProducer.get(), "rectangle");
        return rectangle;
    }

    private RightTriangle newRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle(RandomLongProducer.get(),
                RandomLongProducer.get(), "right triangle");
        return rightTriangle;
    }

    private Square newSquare() {
        Square square = new Square(RandomLongProducer.get(), RandomLongProducer.get(),
                "square");
        return square;
    }
}
