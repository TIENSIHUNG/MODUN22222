public class Square extends Shape implements Colorable, Resizeable{
    private double side = 1.0;

    public Square() {
    }


    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    public String toString() {
        return "A Square with side="
                + getSide()+", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public void resize(double percent) {
        System.out.println(getArea()*(percent/100));
    }
}
