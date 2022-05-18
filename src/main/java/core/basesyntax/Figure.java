package core.basesyntax;

public class Figure {
    private String name;
    private String color;

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int area() {
        return 0;
    }

    public String giveAllTheInformation() {
        return "Figure: " + getName() + "area: " + area() + "color: " + getColor();
    }
}
