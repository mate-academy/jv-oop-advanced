package core.basesyntax;

public class Circle extends Shape {

    private StringBuilder message = new StringBuilder();
    private double roundness;

    public Circle(String name, FigureProducer producer) {
        super(name);
        this.roundness = producer.generateRandomNumber();
    }

    @Override
    public double calculateArea() {
        return Math.round(getRadius() * Math.PI);
    }

    @Override
    public double getPerimeter() {
        return getRadius() * 2 * Math.PI;
    }

    @Override
    public void draw() {
        System.out.print("Drawing Circle");
    }

    @Override
    public String displayInfo() {
        return message.append(super.displayInfo()).append(",area: " + this.calculateArea() + " sq.unit,")
        .append("radius:" + this.getRadius() + " units,").toString();
    }

    public double getRadius() {
        return Math.round(roundness / (2 * Math.PI));
    }
}

