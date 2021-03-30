package core.basesyntax;

public abstract class Figure {
    private String name;
    private String color;
    private Property property;

    public Figure(String name, String color, Property property) {
        this.name = name;
        this.color = color;
        this.property = property;
    }

    public void draw() {
        System.out.printf("Figure: %s, area: %.2f sq. units, %s length: %.2f units, color: %s%n",
                name, calculateArea(), property.getName(),
                property.getValue(), color);
    }

    public abstract double calculateArea();

    public Property getProperty() {
        return property;
    }

}
