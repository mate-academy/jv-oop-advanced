package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getDefaultFigure() {
        return new Circle(10,Color.WHITE);
    }

    public Figure getRandomFigure() {

        Random random = new Random();
        Figure randomFigure = null;
        int randomIndex = random.nextInt(5);

        switch (randomIndex) {

            case 0:
                randomFigure = new Square(random.nextInt(50));
                break;

            case 1:
                randomFigure = new Circle(random.nextInt(50));
                break;

            case 2:
                randomFigure = new Rectangle(random.nextInt(50), random.nextInt(50));
                break;

            case 3:
                randomFigure = new RightTriangle(random.nextInt(50));
                break;

            case 4:
                randomFigure = new IsoscelesTrapezoid(random.nextInt(50),
                        random.nextInt(50),
                        random.nextInt(50));
                break;

            default:
                break;
        }

        randomFigure.setColor(new ColorSupplier().getRandomColor());

        return randomFigure;
    }

}
