package core.basesyntax;

public abstract class Shape implements Drawable {

    private String name;
    private String color;
    private StringBuilder message = new StringBuilder();

    public Shape(String name, ColorProducer producer) {
        this.name = name;
        this.color = producer.generateRandomNumber();
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String displayInfo() {
        return message.append("Shape: ").append(this.getName())
        .append(", color: " + this.getColor()).toString();
    }
}
