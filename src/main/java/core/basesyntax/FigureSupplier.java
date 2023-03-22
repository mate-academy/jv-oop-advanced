package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String WHITE = "white";
    private static final int RADIUS_DEFAULT = 10;
    private static final int MAX_RANDOM = 25;
    private static final int ONE = 1;
    private Random random = new Random();
    private int randomInt;

    private int randomNumberForLegs() {
        int numericFofLegs;
        numericFofLegs = random.nextInt(MAX_RANDOM) + ONE;
        return numericFofLegs;
    }

    private String color() {
        return new ColorSupplier().getRandomColor();
    }

    public Figure getDefaultFigure() {
        return new Circle(RADIUS_DEFAULT,WHITE);
    }

    private Figure circle() {
        int radius = randomNumberForLegs();
        return new Circle(radius, color());
    }

    private Figure isoscelesTrapezoid() {
        int firstLeg = randomNumberForLegs();
        int secondLeg = randomNumberForLegs();
        int fourthLeg = randomNumberForLegs() + secondLeg;
        return new IsoscelesTrapezoid(firstLeg,secondLeg,fourthLeg,color());
    }

    private Figure rectangle() {
        int firstLeg = randomNumberForLegs();
        int secondLeg = randomNumberForLegs();
        return new Rectangle(firstLeg, secondLeg, color());
    }

    private Figure rightTriangle() {
        int firstLeg = randomNumberForLegs();
        return new Square(firstLeg,color());
    }

    private Figure square() {
        int firstLeg = randomNumberForLegs();
        return new Square(firstLeg,color());
    }

    public Figure getRandomFigure() {
        Figure randomFigure;
        randomInt = random.nextInt(5) + 1;
        switch (randomInt) {
            case 1: {
                randomFigure = circle();
                break;
            }
            case 2: {
                randomFigure = isoscelesTrapezoid();
                break;
            }
            case 3: {
                randomFigure = rectangle();
                break;
            }
            case 4: {
                randomFigure = rightTriangle();
                break;
            }
            case 5: {
                randomFigure = square();
                break;
            }
            default:
                randomFigure = getDefaultFigure();
                break;
        }
        return randomFigure;
    }
}
