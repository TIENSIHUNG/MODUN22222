import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Square square = new Square("red",true,1);
        Rectangle rectangle = new Rectangle(1,2,"yellow",true);
        Circle circle = new Circle(3,"blue",true);
        List<Shape>  shapeList = new ArrayList<>();
        shapeList.add(square);
        shapeList.add(rectangle);
        shapeList.add(circle);
//        for (Shape i :
//                shapeList) {
//            System.out.println(i);
//            if (i instanceof Colorable){
//                ((Colorable) i).howToColor();
//            }
//        }


        for (Shape i :
                shapeList) {
            if (i instanceof Circle){
                System.out.println(((Circle) i).getArea());
            }
            if (i instanceof Square){
                System.out.println(((Square) i).getArea());
            }
            if (i instanceof Rectangle){
                System.out.println(((Rectangle) i).getArea());
            }
        }
        for (Shape i :
                shapeList) {
            if (i instanceof Circle){
                ((Circle) i).resize(30);
            }
            if (i instanceof Square){
                ((Square) i).resize(30);
            }
            if (i instanceof Rectangle){
                ((Rectangle) i).resize(30);
            }
        }

    }
}
