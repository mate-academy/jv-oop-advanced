package core.basesyntax;

public class Triangle extends Figure {
    private int side;
    private int height;
    private double area;

    public Triangle(String color,int side,int heigth) {
        this.color = color;
        this.side = side;
        this.height = heigth;
        this.area = side * heigth * 0.5;
    }

    public Triangle(){
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName()
                + ", area: " + area
                + " sq.units, side: " + side
                + " units, height: " + height
                + " units, color: " + color);
    }

    @Override
    public void getArea() {
        System.out.println(this.area);
    }
}
