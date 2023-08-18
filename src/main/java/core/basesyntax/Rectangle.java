package core.basesyntax;

public class Rectangle extends Figure {
    private double height;
    private double weight;

    public Rectangle(String name,String color,double height, double weight) {
        super(name, color);
        this.height = height;
        this.weight = weight;
        setArea();
    }

    @Override
    public double getArea() {
        return height * weight;
    }

    @Override
    public void draw() {
        System.out.println("---------------------------------");
        System.out.println("name: " + getName());
        System.out.println("color: " + getColor());
        System.out.println("area: " + getArea());
        System.out.println("height: " + height);
        System.out.println("weight: " + weight);
    }
}
