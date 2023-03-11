package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    Random random = new Random();

    public int randomNumberForLegs() {
        int numericFofLegs;
        Random random = new Random();
        numericFofLegs = random.nextInt(25);
        if (numericFofLegs == 0){
            while (numericFofLegs > 0) {
                numericFofLegs = random.nextInt(25);
            }
        }
        return numericFofLegs;
    }

    public int randomForMassive() {
        int result;
        result = random.nextInt(5);
        return result;
    }

    private void getDefaultFigure() {
        Circle circle = new Circle(10);
        circle.setColor("white");
        circle.draw();
    }

    private int[] isoscelesTrapezoid() {
        int[] legs = new int[4];
        int firstLeg = randomNumberForLegs();
        int secondLeg = randomNumberForLegs();
        int fourthLeg = randomNumberForLegs();
        if ((firstLeg + firstLeg + secondLeg) < (fourthLeg + secondLeg) || secondLeg == fourthLeg || (secondLeg + fourthLeg) / 2 > firstLeg || (secondLeg + fourthLeg) > firstLeg ) {
            while (fourthLeg != secondLeg && fourthLeg > (firstLeg + firstLeg + secondLeg) && firstLeg > (secondLeg + fourthLeg) / 2 && firstLeg > secondLeg + fourthLeg) {
                fourthLeg = randomNumberForLegs() + secondLeg;
            }
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
        while (firstLeg == thirdLeg || firstLeg >= secondLeg || firstLeg == 0 || thirdLeg == 0 || thirdLeg >= secondLeg) {
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

    public Figure getRandomFigure(int randomInt) {
        Figure randomFigure;
        switch (randomInt){
            case 1 : {
                randomFigure =  new Circle(randomNumberForLegs());
                randomFigure.draw();
                break;
            }
            case 2 : {
                randomFigure = new IsoscelesTrapezoid(isoscelesTrapezoid());
                randomFigure.draw();
                break;
            }
//            case 3 : {
//                randomFigure = new Rectangle(rectangle());
//                break;
//            }
//            case 4 : {
//                randomFigure = new RightTriangle(rightTriangle());
//                break;
//            }
            case 5 : {
                randomFigure = new Square(square());
                randomFigure.draw();
                break;
            }
            default:
                randomFigure = new Circle();
                randomFigure.draw();
                break;
        }
        return randomFigure;
    }
}
