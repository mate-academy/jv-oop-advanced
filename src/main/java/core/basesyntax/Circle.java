package core.basesyntax;

class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super("circle", color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public long draw() {
        String figureDetails = "radius: " + radius + " unit, " + "color: " + getColor();

        System.out.println(super.draw());
        System.out.println(figureDetails);
        return 0;
    }
}
