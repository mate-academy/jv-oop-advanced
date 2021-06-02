package core.basesyntax;

public class Circle extends Figure implements Draw{

    private double radius;

    public Circle(String color,double radius){
        this.color = color;
        this.radius = radius;
    }


    @Override
    public void draw() {

    }
}
