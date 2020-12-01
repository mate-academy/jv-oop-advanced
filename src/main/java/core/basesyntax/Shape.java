package core.basesyntax;

import java.util.Random;

public abstract class  Shape {

    private Random rand;
    private String name;
    private String color;

    public Shape(String name){
        this.name = name;
        this.color = randomColor();
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

    private String randomColor(){
        String color = "";
        String[] array = {"white", "black", "yellow", "red", "orange",
                            "pink", "purple", "grey", "brown" , "golden",
                            "green", "blue"};
        int rand = (int)(Math.random() * array.length);
        color += array[rand];
        return color;
        }
    }



