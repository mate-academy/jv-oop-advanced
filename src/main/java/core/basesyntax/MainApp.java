package core.basesyntax;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        ColorSupplier colorSupplier = new ColorSupplier();
        int sideA;
        int sideB;
        int height;
        int firstLeg;
        int secondLeg;
        int radius;
        String color;
        Random figure = new Random();
        int num = figure.nextInt(5) + 1;

        for (int i = 0; i < num; i++) {
            sideA = Math.abs(figure.nextInt(10) + 1);
            sideB = Math.abs(figure.nextInt(10) + 1);
            height = Math.abs(figure.nextInt(10) + 1);
            firstLeg = Math.abs(figure.nextInt(10) + 1);
            secondLeg = Math.abs(figure.nextInt(10) + 1);
            radius = Math.abs(figure.nextInt(10) + 1);
            color = colorSupplier.getRandomColor();
            Figure randomFigure = figureSupplier.getRandomFigure();
            randomFigure.setParameters(sideA, sideB, height, firstLeg, secondLeg, radius, color);
            System.out.println(randomFigure.behaviour());
        }
    }
}
