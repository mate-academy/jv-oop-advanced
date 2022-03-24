package model;

public abstract class Figure implements Area, Draw {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return 0;
    }

    public void drawing() {
        System.out.println("This is figure!");
    }
}
