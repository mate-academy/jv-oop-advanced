package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String colour, double radius) {
        super(colour);
        setRadius(radius);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return roundValues(Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        String output = this.getColour() + " "
                + this.getClass().getSimpleName() + " Has a radius :"
                + this.radius + " units \nAnd it's area is :" + calculateArea()
                + " square units \n";
        System.out.println(output);
    }
}
