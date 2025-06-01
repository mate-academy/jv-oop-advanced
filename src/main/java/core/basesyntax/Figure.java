package core.basesyntax;

abstract class Figure {
   private String color;

   Figure(String color) {
       this.color = color;
   }

    public String getColor() {
        return color;
    }
}
