package core.basesyntax;

public class Circle implements Figure {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: " + getArea() 
                + " sq. units, radius: "
                + radius + " units, color: " + color);
    }
}

/*package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }
    @Override 
     public double getArea() {
        return Math.PI * radius * radius;
     }
    @Override
    public void draw() {
        System.out.println("Figure : Circle, area :" + getArea() 
        + " units, radius : " + radius + " units, color :" + color);
    }
}*/
