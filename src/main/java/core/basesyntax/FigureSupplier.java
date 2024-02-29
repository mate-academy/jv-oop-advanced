package core.basesyntax;

import java.util.Objects;
import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    private final Random random = new Random();
    public Figura getRandomFigure(){
        int caseIndex = random.nextInt(4);
        switch (caseIndex) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRightTriagle();
            case 3:
                return getRandomRectangle();
            default:
                System.out.println("Error");
        }
        return null;
    }

    public Square getRandomSquare() {
        return new Square(random.nextInt(100) + 1,getRandomColor());
    }

    public Rectangle getRandomRectangle() {
        return new Rectangle(random.nextInt(100) + 1,random.nextInt(100) + 1,getRandomColor());
    }

    public RightTriangle getRandomRightTriagle() {
        return new RightTriangle(random.nextInt(100) + 1,random.nextInt(100) + 1,getRandomColor());
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(100) + 1,random.nextInt(100) + 1,random.nextInt(100) + 1,getRandomColor());
    }

    public Figura getDefaultFigure() {
        return new Circle(10,getRandomColor());
    }

}
