package core.basesyntax;

class Circle extends Figure {
    private final double radius;

    public Circle(double radius, String color) {
        super(Circle.class.getSimpleName(), color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        String figureDetails = "radius: " + radius + " unit, " + "color: " + getColor();

        super.draw();
        System.out.println("figure: " + getName() + ", square: "
                + calculateArea() + " sq.units.");
        System.out.println(figureDetails);
    }
}
