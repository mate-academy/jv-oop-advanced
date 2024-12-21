package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public AbstractFigure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        int figureType = random.nextInt(5);
        switch (figureType) {
            case 0: //Circle
                double radius = 1 + random.nextInt(10);
                return new Circle(color,radius);
            case 1: //RightTriangle
                double base = 1 + random.nextInt(10);
                double heigth = 1 + random.nextInt(10);
                return new RightTriangle(color,base,heigth);
            case 2: //Square
                double side = 1 + random.nextInt(10);
                return new Square(color,side);
            case 3: //IsoscelesTrapezoid
                double side1 = 1 + random.nextInt(10);
                double side2 = 1 + random.nextInt(10);
                heigth = 1 + random.nextInt(10);
                return new IsoscelesTrapezoid(color,side1,side2,heigth);
            case 4: //Rectangle
                double length = 1 + random.nextInt(10);
                double width = 1 + random.nextInt(10);
                return new Rectangle(color,length,width);
            default:
                throw new IllegalStateException("Unexpected value: " + figureType);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white",10);
    }
}
