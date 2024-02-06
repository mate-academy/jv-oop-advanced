package core.basesyntax.model;

public class Rectangle extends Figure {
    private int lenght;
    private int width;
    private String color;

    public Rectangle(String color, int lenght, int width) {

        super(color);
        this.lenght = lenght;
        this.width = width;
        this.color = color;
    }

    public int getLenght() {
        return lenght;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int calculateArea() {
        return lenght * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: "
                + calculateArea()
                + " sq.units, lenght: "
                + lenght
                + " units, width: "
                + width
                + " units, color: "
                + getColor());
    }
}

