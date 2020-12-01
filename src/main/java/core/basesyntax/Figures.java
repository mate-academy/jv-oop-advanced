package core.basesyntax;

import java.util.Random;

public class Figures {
    private double area;
    private String color;
    private double uniqueParameter;

    public Figures(double uniqueParameter, String color) {
        this.color = color;
        this.uniqueParameter = uniqueParameter;
    }

    public void setUniqueParameter(double uniqueParameter) {
        this.uniqueParameter = uniqueParameter;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getColor() {
        return color;
    }

    public double getUniqueParameter() {
        return uniqueParameter;
    }

    public double getArea() {
        return area;
    }

    public void print() {
        System.out.println("Its just a figure!");
    }

    public static void main(String[] args) {
        String[] colors = new String[] {"white", "blue", "red", "yellow", "green"};
        Random rand = new Random();
        Figures[] figures = new Figures[rand.nextInt(20)];

        for (int i = 0; i < figures.length; i++) {
            switch (rand.nextInt(5)) {
                case 0:
                    figures[i] = new Circle(rand.nextInt(10), colors[rand.nextInt(5)]);
                    break;
                case 1:
                    figures[i] = new IzoscelesTrapezoid(rand.nextInt(10) + 2, rand.nextInt(10),
                            rand.nextInt(10), colors[rand.nextInt(5)]);
                    break;
                case 2:
                    figures[i] = new Rectangle(rand.nextInt(20), rand.nextInt(10),
                            colors[rand.nextInt(5)]);
                    break;
                case 3:
                    figures[i] = new RightTriangle(rand.nextInt(10), rand.nextInt(10),
                            colors[rand.nextInt(5)]);
                    break;
                case 4:
                    figures[i] = new Square(rand.nextInt(10), colors[rand.nextInt(5)]);
                    break;
                default:
                    break;
            }
        }
        for (Figures figure : figures) {
            figure.print();
        }
    }
}
