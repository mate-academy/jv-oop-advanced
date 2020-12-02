package core.basesyntax;

import java.util.Random;

public class HelloWorld {

    public static final int FIGURES_TYPES = 5;

    public static void main(String[] args) {

        Random random = new Random();

        FigureMaker figureMaker = new FigureMaker();
        Figure[] figures = figureMaker.makeFigures(random.nextInt(10));

        for (int i = 0; i < figures.length; i++) {

            System.out.println("Name: " + figures[i].getName());
            System.out.println("Color: " + figures[i].getColor());
            System.out.println("Area: " + figures[i].getArea());
            figures[i].unicMetod();

        }
    }
}
