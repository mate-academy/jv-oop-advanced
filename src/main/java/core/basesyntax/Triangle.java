package core.basesyntax;

public class Triangle extends Figure {
    private String typeOfFigure;
    private int side;
    private int height;
    private double area;

    {
        typeOfFigure = "Triangle";
    }

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
        System.out.println("Figure: " + typeOfFigure
                + ", area: " + area
                + " sq.units, side: " + side
                + " units, height: " + height
                + " units, color: " + color);
    }
}
