package core.basesyntax;

import java.util.Random;

public class CreateFigure {
    public static void getCreateFigure(Figure[] myFigureArray) {
        Random random = new Random();

        int generateFigure = random.nextInt(5);

        for (int i = 0; i < myFigureArray.length; i++) {

            Figure shape = null;

            switch (generateFigure) {
                case 0:
                    shape = new Square(random.nextInt(6));
                    break;
                case 1:
                    shape = new Rectangle(random.nextInt(7), random.nextInt(3));
                    break;
                case 2:
                    shape = new Triangle(random.nextInt(5), random.nextInt(8));
                    break;
                case 3:
                    shape = new Circle(random.nextInt(4));
                    break;
                case 4:
                    shape = new Trapezoid(random.nextInt(8), random.nextInt(9),
                            random.nextInt(8));
                    break;
                default:
                    break;
            }

            myFigureArray[i] = shape;
        }
    }
}
