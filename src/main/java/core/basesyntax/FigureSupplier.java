package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private int randomInt;

    public int randomNumberForLegs() {
        int numericFofLegs;
        numericFofLegs = random.nextInt(25) + 1;
        return numericFofLegs;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(10);
        circle.setColor("white");
        circle.draw();
        return circle;
    }

    private int[] isoscelesTrapezoid() {
        int[] legs = new int[4];
        int firstLeg = randomNumberForLegs();
        int secondLeg = randomNumberForLegs();
        int fourthLeg = randomNumberForLegs() + secondLeg;

        while (firstLeg == secondLeg || secondLeg == fourthLeg
                || firstLeg + secondLeg < fourthLeg || secondLeg + fourthLeg < firstLeg) {
            firstLeg = randomNumberForLegs();
            secondLeg = randomNumberForLegs();
            fourthLeg = randomNumberForLegs() + secondLeg;
        }

        legs[0] = firstLeg;
        legs[1] = secondLeg;
        legs[2] = firstLeg;
        legs[3] = fourthLeg;
        return legs;
    }

    private int[] rectangle() {
        int[] legs = new int[4];
        int firstLeg = randomNumberForLegs();
        int secondLeg = randomNumberForLegs();

        if (firstLeg != secondLeg && secondLeg > firstLeg) {
            legs[0] = firstLeg;
            legs[1] = secondLeg;
            legs[2] = firstLeg;
            legs[3] = secondLeg;
        } else {
            while (firstLeg != secondLeg && secondLeg > firstLeg) {
                firstLeg = randomNumberForLegs();
                secondLeg = randomNumberForLegs();
            }
            legs[0] = firstLeg;
            legs[1] = secondLeg;
            legs[2] = firstLeg;
            legs[3] = secondLeg;
        }
        return legs;
    }

    private int[] rightTriangle() {
        int[] legs = new int[3];
        int firstLeg = randomNumberForLegs();
        int thirdLeg = randomNumberForLegs();
        int secondLeg = (int) Math.sqrt(firstLeg * firstLeg + thirdLeg * thirdLeg);
        while (firstLeg == thirdLeg || firstLeg >= secondLeg
                || firstLeg == 0 || thirdLeg == 0 || thirdLeg >= secondLeg) {
            firstLeg = randomNumberForLegs();
            thirdLeg = randomNumberForLegs();
            secondLeg = (int) Math.sqrt(firstLeg * firstLeg + thirdLeg * thirdLeg);
        }
        legs[0] = firstLeg;
        legs[1] = secondLeg;
        legs[2] = thirdLeg;
        return legs;
    }

    private int[] square() {
        int[] legs = new int[1];
        int firstLeg = randomNumberForLegs();
        legs[0] = firstLeg;
        return legs;
    }

    public Figure getRandomFigure() {
        Figure randomFigure;
        randomInt = random.nextInt(5) + 1;
        switch (randomInt) {
            case 1: {
                randomFigure = new Circle(randomNumberForLegs());
                randomFigure.draw();
                break;
            }
            case 2: {
                randomFigure = new IsoscelesTrapezoid(isoscelesTrapezoid());
                randomFigure.draw();
                break;
            }
            case 3: {
                randomFigure = new Rectangle(rectangle());
                randomFigure.draw();
                break;
            }
            case 4: {
                randomFigure = new RightTriangle(rightTriangle());
                randomFigure.draw();
                break;
            }
            case 5: {
                randomFigure = new Square(square());
                randomFigure.draw();
                break;
            }
            default:
                randomFigure = new Circle(10);
                randomFigure.setColor("white");
                randomFigure.draw();
                break;
        }
        return randomFigure;
    }
}
