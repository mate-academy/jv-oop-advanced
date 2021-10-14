package core.basesyntax;

public class Square extends Figure {
    private final String name = "Square";
    int side;

    public Square(String color, int side) {
        super.color = color;
        this.side = side;
    }

    @Override
    public int getArea (){
        return side * side;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void draw() {
        StringBuilder draw = new StringBuilder();
        draw.append("Figure: " + getName());
        draw.append(", area: " +  getArea() + " sq.units");
        draw.append(", side: " + side);
        draw.append(", color: " + color);
        System.out.println(draw.toString());
    }
}
