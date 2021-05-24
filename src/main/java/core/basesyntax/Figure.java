package core.basesyntax;

public abstract class Figure implements Drawable {
    private final String color;
    private final String name;

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }
    
    public String getColor() {
        return color;
    }

    public double getArea(double area) {
        return area;
    }
}


