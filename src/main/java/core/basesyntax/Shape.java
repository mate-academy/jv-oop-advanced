package core.basesyntax;

public abstract class Shape {

    private String name;
    private String color;
    private StringBuilder message = new StringBuilder();

    public Shape(String name, ColorProducer producer) {
        this.name = name;
        this.color = producer.randomColor();
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public abstract double calculateArea();

    public abstract double getPerimeter();

    public abstract void draw();

    public String displayInfo() {
        return message.append("Shape: ").append(this.getName())
        .append(", color: " + this.getColor()).toString();
    }
}



