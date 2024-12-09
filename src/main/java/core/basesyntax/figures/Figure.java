package core.basesyntax.figures;

public class Figure implements Area, UnitInfo {
    private String color;
    private String name;

    public Figure(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    @Override
  public double getArea() {
        return 0;
    }

    @Override
      public String getUnitsInfo() {
        return "";
    }
}
