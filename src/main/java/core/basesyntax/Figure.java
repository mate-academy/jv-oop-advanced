package core.basesyntax;

public abstract class Figure implements Drawing {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    @Override
    public void draw() {
        System.out.println("I am not a valid variant");
    }
}
