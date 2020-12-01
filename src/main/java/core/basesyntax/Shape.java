package core.basesyntax;

import java.util.Random;

public abstract class  Shape {

    private Random rand;
    private String name;
    private String color;

    public Shape(String name, String color){
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public abstract double calculateArea();

    public abstract  double perimeter();

    public abstract void draw();

    public abstract String info();
}


