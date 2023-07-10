package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        Figure figure = null;
        Random random = new Random();
        int randomNumber = random.nextInt(5);
        switch (randomNumber) {
            case 0 :
                figure = new Circle();
                break;
            case 1 :
                figure = new IsoscelesTrapezoid();
                break;
            case 2 :
                figure = new Rectangle();
                break;
            case 3 :
                figure = new RightTriangle();
                break;
            case 4 :
                figure = new Square();
                break;
            default:
                System.out.println("Figure not founded");
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
