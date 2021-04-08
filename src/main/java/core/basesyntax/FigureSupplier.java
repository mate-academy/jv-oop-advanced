package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int RANDOMPROPERTIES = 10;

    static Circle getCircle() {
        Random random = new Random();
        int radius = random.nextInt(RANDOMPROPERTIES) + 1;
        String name = "Circle";
        String color = new ColorSupplier().getColor();
        return new Circle(color,name,radius);
    }

    static Square getSquare() {
        Random random = new Random();
        int size = random.nextInt(RANDOMPROPERTIES) + 1;
        String name = "Square";
        String color = new ColorSupplier().getColor();
        return new Square(color,name,size);
    }

    static RightTriangle getTriangle() {
        Random random = new Random();
        int firstLeg = random.nextInt(RANDOMPROPERTIES) + 1;
        int secondLeg = random.nextInt(RANDOMPROPERTIES) + 1;
        String name = "Triangle";
        String color = new ColorSupplier().getColor();
        return new RightTriangle(color,name,firstLeg,secondLeg);
    }

    static Rectangle getRectangle() {
        Random random = new Random();
        int length = random.nextInt(RANDOMPROPERTIES) + 1;
        int width = random.nextInt(RANDOMPROPERTIES) + 1;
        String name = "Rectangle";
        String color = new ColorSupplier().getColor();
        return new Rectangle(color,name,length,width);
    }

    static IsoscelesTrapezoid getTrapezoid() {
        Random random = new Random();
        int topBase = random.nextInt(RANDOMPROPERTIES) + 1;
        int lowBase = random.nextInt(RANDOMPROPERTIES) + 1;
        int height = random.nextInt(RANDOMPROPERTIES) + 1;
        String name = "Trapezoid";
        String color = new ColorSupplier().getColor();
        return new IsoscelesTrapezoid(color,name,topBase,lowBase,height);
    }
}
