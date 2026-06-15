package core.basesyntax;

public class IsoscelesTrapezoid extends Figure{
    private Double topBase;
    private Double bottomBase;
    private Double height;

    public IsoscelesTrapezoid(String color, Double topBase, Double bottomBase, Double height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }
}
