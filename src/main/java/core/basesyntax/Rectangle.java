package core.basesyntax;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle() {
    }

    public Rectangle(String color) {
        super(color);
    }

    public Rectangle(String color, double height, double width) {
        super(color);
       this.color = color;
       this.width = width;
       this.height = height;
       area = width * height;
    }


    public void draw() {
        System.out.println("Figure: rectangle, area: " + area + " sq.units," +
                " height: " + height + " units," +
                " width: " + width + " units," +
                " color: " + color);
    }
}

