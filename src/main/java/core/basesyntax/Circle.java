package core.basesyntax;

public class Circle extends Shape {

    private StringBuilder message = new StringBuilder();
    private double roundness;

    public Circle(String name, FigureProducer producer) {
        super(name);
        this.roundness = producer.generatorNumber();
    }

    @Override
    public double calculateArea() {
        return (int) (radius() * Math.PI);
    }

    @Override
    public double perimeter() {
        return radius() * 2 * Math.PI;
    }

    @Override
    public void draw() {
        System.out.print("Drawing Circle");
    }

    @Override
    public String info() {
        return message.append(super.info()).append(",area: " + this.calculateArea() + " sq.unit,")
        .append("radius:" + this.radius() + " units,").toString();
    }

    public double radius() {
        return (int) (roundness / (2 * Math.PI));
    }
}

