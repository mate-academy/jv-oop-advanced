package core.basesyntax;

public class Square extends Figure {
    private String typeOfFigure;
    private int side;
    private double area;

    {
        typeOfFigure = "Square";
    }

    public Square(String color,int side) {
        this.color = color;
        this.side = side;
        this.area = side * side;
    }

    public Square(){
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + typeOfFigure
                + ", area: " + area
                + " sq.units, side: " + side
                + " units, color: " + color);
    }
}
