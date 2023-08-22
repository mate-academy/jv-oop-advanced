package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends Figure {
    static final double MAX_NUMBER = 100.0;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = new Random().nextInt(TypeOfFigure.values().length);
        TypeOfFigure type = TypeOfFigure.values()[index];
        String randomColor = colorSupplier.getRandomColor();
        switch (type) {
            case Rectangle :
                return new Rectangle(randomColor,
                        random.nextDouble() * MAX_NUMBER,random.nextDouble() * MAX_NUMBER);
            case Circle:
                return new Circle(randomColor, random.nextDouble() * MAX_NUMBER);
            case Square:
                return new Square(randomColor, random.nextDouble() * MAX_NUMBER);
            case RightTriangle:
                return new RightTriangle(randomColor,
                        random.nextDouble() * MAX_NUMBER, random.nextDouble() * MAX_NUMBER);
            case IsoscelesTrapezoid:
                return new IsoscelesTrapezoid(randomColor,
                        random.nextDouble(), random.nextDouble() * MAX_NUMBER,
                        random.nextDouble() * MAX_NUMBER);
            default:
                System.out.println("There isn't such figure");
                return null;
        }
    }

    public Figure getDefaultFigure1() {
        int index = new Random().nextInt(TypeOfFigure.values().length);
        TypeOfFigure type1 = TypeOfFigure.values()[index];
        switch (type1) {
            case Square:
                return new Square(Color.Orange, 4.0);
            case Rectangle:
                return new Rectangle(Color.Red, 6.9, 4);
            case RightTriangle:
                return new RightTriangle(Color.Blue, 6.0, 2.8);
            case Circle:
                return new Circle(Color.White, 10.0);
            case IsoscelesTrapezoid:
                return new IsoscelesTrapezoid(Color.White, 4.0, 5.0,8.0);
            default:
                System.out.println("Cannot find default figure");
                return null;
        }
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {

    }

    @Override
    public void draw2() {

    }
}
