package core.basesyntax;

public class Circle extends Figure {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
        area = Math.PI * Math.pow(radius, 2);
        color = "white";
        name = "circle";
        System.out.println("Figure: " + name + ", area: " + area + " sq.units, radius: " + radius + " units," + " color: " +  color);
    }

    public Circle(int radius,String color){
        this.radius = radius;
        this.color = color;
        area = Math.PI * Math.pow(radius, 2);
        name = "circle";
        System.out.println("Figure: " + name + ", area: " + area + " sq.units, radius: " + radius + " units," + " color: " +  color);
    }
}
