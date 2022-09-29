package core.basesyntax;

public abstract class Figure implements Behaviour {

    private String color;

    public Figure() {

    }

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("color: " + color);
    }

    public double getArea() {
        return 0;
    }
}
