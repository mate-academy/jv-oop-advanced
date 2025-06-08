package core.basesyntax;

public class IsoscelesTrapezoid extends Figure{
    double topBase;
    double bottomBase;
    double height;

    public IsoscelesTrapezoid(String color, double topBase, double bottomBase, double height){
        this.color = color;
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    double getArea() {
        return(topBase + bottomBase) * height / 2;
    }

    @Override
    void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() +
                " sq. units, height: " + height +
                " units, top base: " + topBase +
                " units, bottom base: " + bottomBase +
                " units, color: " + color);
    }

}
