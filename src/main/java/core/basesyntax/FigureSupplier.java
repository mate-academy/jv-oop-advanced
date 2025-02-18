package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

        private double getRandomProperty() {
        Random randomNumber = new Random(); // random properties
        double randomProperty = randomNumber.nextInt(10);
        return randomProperty;
    }

    public Figure getRandomFigure() {
        Random randomFigure = new Random();
        ColorSupplier randomColor = new ColorSupplier();
        String[] figures = {"rightTriangle", "square", "isoscelesTrapezoid", "circle", "rectangle"};
        int randomIndex = randomFigure.nextInt(figures.length);
        String fortuneFigure = figures[randomIndex];
        return switch (fortuneFigure) {
            case "rightTriangle": {
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setFirstLeg(getRandomProperty());
                rightTriangle.setSecondLeg(getRandomProperty());
                rightTriangle.setColor(randomColor.getRandomColor());
                {
                    rightTriangle.print();
                    break;
                }
            }
            case "square": {
                Square square = new Square();
                square.setSide(getRandomProperty());
                square.setColor(randomColor.getRandomColor());
                square.print();
                break;
            }
            case "isoscelesTrapezoid": {
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setFirstLeg(getRandomProperty());
                isoscelesTrapezoid.setSecondLeg(getRandomProperty());
                isoscelesTrapezoid.setHeight(getRandomProperty());
                isoscelesTrapezoid.setColor(randomColor.getRandomColor());
                isoscelesTrapezoid.print();
                break;
            }
            case "circle": {
                Circle circle = new Circle();
                circle.setRadius(getRandomProperty());
                circle.setColor(randomColor.getRandomColor());
                circle.print();
                break;
            }
            case "rectangle": {
                Rectangle rectangle = new Rectangle();
                rectangle.setFirstLeg(getRandomProperty());
                rectangle.setSecondLeg(getRandomProperty());
                rectangle.setColor(randomColor.getRandomColor());
                rectangle.print();
                break;
            }
            default: {
                System.out.println("Draw again.");
                break;
            }
        }

        public Figure getDefaultFigure () {
            Circle constantCircle = new Circle();
            constantCircle.setRadius(10);
            constantCircle.setColor("white");
            return constantCircle;
        }
    }
}
