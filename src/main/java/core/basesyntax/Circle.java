package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String colour, double radius) {
        super(colour);
        this.radius = super.roundValues(radius);
    }

    @Override
    public double calculateArea() {
        return super.roundValues(Math.PI * radius * radius);
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
