package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    ColorSupplier randomColor = new ColorSupplier();
    Random randomNumber = new Random();

    public Figure getRandomFigure() {
        int index = new Random().nextInt(FigureType.values().length);
        switch (FigureType.values()[index]) {
            case CIRCLE:
                return new Circle(randomColor.getRandomColor(), randomNumber.nextInt());
            case SQUARE:
                return new Square(randomColor.getRandomColor(), randomNumber.nextInt());
            case RECTANGLE:
                return new Rectangle(randomColor.getRandomColor(), randomNumber.nextInt(), randomNumber.nextInt());
            case RIGHTTRIANGLE:
                return new RightTriangle(randomColor.getRandomColor(), randomNumber.nextInt());
            default:
                return new IsoscelesTrapezoid(randomColor.getRandomColor(), randomNumber.nextInt(), randomNumber.nextInt(), randomNumber.nextInt());
        }
    }

    public Figure getDefaultFigure(){
        return new Circle("white",10);
    }
}
