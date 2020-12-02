package core.basesyntax;

import java.util.Random;

public class HelloWorld {
    public static void main(String[] args) {

        Random random = new Random();

        Figure[] figures = new Figure[random.nextInt(10)];

        for (int i = 0; i < figures.length; i++) {
            switch (random.nextInt(5)) {
                case 0:
                    figures[i] = new Circle();
                    break;

                case 1:
                    figures[i] = new IsoscelesTrapezoid();
                    break;

                case 2:
                    figures[i] = new Rectangle();
                    break;

                case 3:
                    figures[i] = new RightTriangle();
                    break;

                case 4:
                    figures[i] = new Square();
                    break;
            }

            figures[i].setColor(Color.values()[random.nextInt(3)]);
            figures[i].setArea(random.nextInt(25));

            System.out.println("Имя: " + figures[i].getName());
            System.out.println("Цвет: " + figures[i].getColor());
            System.out.println("Площадь: " + figures[i].getArea());
            figures[i].unicMetod();
        }
    }
}
