package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        //creating int with number og Figure classes to pick up one of those
        Random randResult = new Random();
        int figureNum = randResult.nextInt(5);

        //double randomRange for multiplying with random doubles from switch-case statement
        double randomRange = 100.0;

        //getting ColorSupplier to set a random color for resulting Figure
        ColorSupplier randomColor = new ColorSupplier();

        //initializing Figure to be returned after switch-case statement
        Figure result;

        //choosing our Figure class based on random int from figureNum and then adding random parameters
        switch (figureNum) {
            case 0:
                double randomSide = new Random().nextDouble() * randomRange;
                result = new Square(randomSide);
                break;
            case 1:
                double randomSideA = new Random().nextDouble() * randomRange;
                double randomSideB = new Random().nextDouble() * randomRange;
                result = new Rectangle(randomSideA, randomSideB);
                break;
            case 2:
                double randomRadius = new Random().nextDouble() * randomRange;
                result = new Circle(randomRadius);
                break;
            case 3:
                double randomUpperBase = new Random().nextDouble() * randomRange;
                double randomLowerBase = new Random().nextDouble() * randomRange;
                double randomHeight = new Random().nextDouble() * randomRange;
                result = new IsoscelesTrapezoid(randomUpperBase, randomLowerBase, randomHeight);
                break;
            case 4:
                double randomFirstLeg = new Random().nextDouble() * randomRange;
                double randomSecondLeg = new Random().nextDouble() * randomRange;
                result = new RightTriangle(randomFirstLeg, randomSecondLeg);
                break;
            default:
                result = new Square(0.0);
        }
        //setting random color to Figure object
        result.setColor(randomColor.getRandomColor());
        return  result;
    }
}
