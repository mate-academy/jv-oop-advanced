package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color){
        super(color);
        this.radius = radius;
    }

    public void setRadius (int radius) {
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public void draw() {
        System.out.println("Figure: circle, area: " + (Math.PI*radius*radius) + " sq. units, radius: " + radius
                + " units, color: " + super.getColor());
    }

    public void area() {
        System.out.println("Area: " + (Math.PI*radius*radius));
    }
}
