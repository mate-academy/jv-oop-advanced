package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    /*
    //First time I guessed that it will be a great idea, but after reading a checklist
    //I found it useless. I will let it lay here, just in case it may become helpful once

    public Figure[] generateRandomFigureList(Figure[] figures) {
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = getRandomFigure();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = getDefaultFigure();
        }
        return figures;
    }
    */
    public Figure getRandomFigure() {
        final int AmountOfFigures = 5;
        int randomFigure = new Random().nextInt(AmountOfFigures - 1) + 1;
        switch (randomFigure) {
            default: return new Figure("");
            case 1: return getRandomCircle();
            case 2: return getRandomIsoscelesTrapezoid();
            case 3: return getRandomRectangle();
            case 4: return getRandomRightTriangle();
            case 5: return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        String color = Color.WHITE.toString();
        double radius = 10;
        return new Circle(color, radius);
    }

    public Figure getRandomCircle() {
        String color = Color.WHITE.toString();
        double radius = new Random().nextInt(20) + 1;
        return new Circle(color, radius);
    }

    public Figure getRandomIsoscelesTrapezoid() {
        String color = new ColorSupplier().getRandomColor();
        double baseSideLine = new Random().nextInt(20) + 1;
        double topSideLine = new Random().nextInt(20) + 1;
        double height = new Random().nextInt(20) + 1;
        return new IsoscelesTrapezoid(color, baseSideLine, topSideLine, height);
    }

    public Figure getRandomRectangle() {
        String color = new ColorSupplier().getRandomColor();
        double sideOne = new Random().nextInt(20) + 1;
        double sideTwo = new Random().nextInt(20) + 1;
        return new Rectangle(color, sideOne, sideTwo);
    }

    public Figure getRandomRightTriangle() {
        String color = new ColorSupplier().getRandomColor();
        double firstLeg = new Random().nextInt(20) + 1;
        double secondLeg = new Random().nextInt(20) + 1;
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    public Figure getRandomSquare() {
        String color = new ColorSupplier().getRandomColor();
        double side = new Random().nextInt(20) + 1;
        return new Square(color, side);
    }
}
