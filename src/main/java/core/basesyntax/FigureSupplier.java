package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        int index = new Random().nextInt(5);
        String color = new ColorSupplier().getRandomColor();
        int param1 = new Random().nextInt(100);
        int param2 = new Random().nextInt(100);
        int param3 = new Random().nextInt(50);
        switch (index) {
            case 1:
                return new Square(color, param1);
            case 2:
                return new Circle(color, param1);
            case 3:
                return new Rectangle(color, param1, param2);
            case 4:
                return new RightTriangle(color, param1, param2);
            default:
                return new IsoscelesTrapezoid(color, param1, param2, param3);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
