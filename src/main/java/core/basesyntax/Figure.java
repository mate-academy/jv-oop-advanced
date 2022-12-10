package core.basesyntax;

import java.util.Random;

public abstract class Figure implements AreaCalculation {
    private String color;
    private double area;
    //private Random random;
    private StringBuilder stringBuilder = new StringBuilder();

    public Figure() {

    }

    public Figure(Random random) {

    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public void setStringBuilder(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInformation() {
    }

    //public Figure getRandomFigure;

    @Override
    public double getArea() {
        return 0;
    }
}
