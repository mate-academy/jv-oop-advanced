package core.basesyntax;

import java.util.Random;

public class FiguresFactory {
    private static final int NUMBER_OF_FIGURES = 5;

    public static int getNumberOfFigures() {
        return NUMBER_OF_FIGURES;
    }

    public Figure getFigure(int type) {
        switch (type) {
            case 0:
                return new Square(randomParameter(), new ColorProducer().get());
            case 1:
                return new Rectangle(randomParameter(),
                                     randomParameter(),
                                     new ColorProducer().get());
            case 2:
                return new RightTriangle(randomParameter(),
                                         randomParameter(),
                                         new ColorProducer().get());
            case 3:
                return new Circle(randomParameter(), new ColorProducer().get());
            case 4:
            default:
                return createTrapzoid();
        }
    }

    private int randomParameter() {
        return (new Random().nextInt(50) + 1); // 1 <= randomParameter <= 50
    }

    /** This method creates a convex isosceles trapezoid. A quadrilateral exists when
     * its largest side is less than the sum of the others. The isIsoscelesTrapezoidExists
     * method is responsible for this check, the createTrapzoid method creates three random
     * numbers: a and b are the bases of the trapezoid, and c are the sides. If the
     * isIsoscelesTrapezoidExists method returns false, then the createTrapzoid method calls
     * itself, creates a new set of values for the sides, until it creates a set of values
     * with which isIsoscelesTrapezoidExists returns true, then the createTrapzoid method
     * will create a trapezoid.*/
    private IsoscelesTrapezoid createTrapzoid() {
        double a = randomParameter();
        double b = randomParameter();
        double c = randomParameter();
        if (isIsoscelesTrapezoidExists(a, b, c)) {
            return new IsoscelesTrapezoid(a, b, c, new ColorProducer().get());
        }
        return createTrapzoid();
    }

    private boolean isIsoscelesTrapezoidExists(double a, double b, double c) {
        if (a < b + c + c) {
            return true;
        }
        return b < a + c + c;
    }
}
