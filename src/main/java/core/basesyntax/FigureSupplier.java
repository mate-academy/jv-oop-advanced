package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    public Figure getRandomFigure() {
        String color = "";
        Random figure = new Random();
        int num = figure.nextInt(5) + 1;

        switch (num) {
            case (1):
                return new IsoscelesTrapezoid();
            case (2):
                return new Square();
            case (3):
                return new RightTriangle();
            case (4):
                return new Circle();
            case (5):
                return new Rectangle();
            default:
                return new Square();
        }
    }

    /*public static void main(String[] args) {
        int sideA;
        int sideB;
        int height;
        int firstLeg;
        int secondLeg;
        int radius;
        Random figure = new Random();
        int num = figure.nextInt(5) + 1;
        for (int i = 0; i < num; i++) {
            sideA = Math.abs(figure.nextInt(10) + 1);
            sideB = Math.abs(figure.nextInt(10) + 1);
            height = Math.abs(figure.nextInt(10) + 1);
            firstLeg = Math.abs(figure.nextInt(10) + 1);
            secondLeg = Math.abs(figure.nextInt(10) + 1);
            radius = Math.abs(figure.nextInt(10) + 1);
            Figure temp = getRandomFigure();
            temp.Parameters(sideA, sideB, height, firstLeg, secondLeg, radius, getRandomColor());
            double a = temp.getArea();
            System.out.println(temp.behaviour());
        }
    }*/
}
