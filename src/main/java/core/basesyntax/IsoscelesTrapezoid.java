package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final String name = "Isosceles Trapezoid";
    int sideA;
    int sideB;
    int height;


    public IsoscelesTrapezoid (String color, int sideA, int sideB, int height) {
        super.color = color;
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }


    @Override
    public int getArea() {
        return (sideA + sideB) / 2 * height;
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
        draw.append(", sideA: " + sideA);
        draw.append(", sideB: " + sideB);
        draw.append(", height: " + height);
        draw.append(", color: " + color);
        System.out.println(draw.toString());
    }

}
