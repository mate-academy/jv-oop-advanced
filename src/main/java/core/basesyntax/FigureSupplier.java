package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        switch (new Random().nextInt(4)) {
            case 0:
                return new Circle();
            case 1:
                return new IsoscelesTrapezoid();
            case 2:
                return new Rectangle();
            case 3:
                return new RightTriangle();
            case 4:
                return new Square();
            default:
                return new Figure() {
                    @Override
                    public double getArea() {
                        return 0;
                    }

                    @Override
                    public void draw() {
                        System.out.println("I am figure!");
                    }
                };
        }
    }
}
