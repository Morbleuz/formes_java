package epsi.software.formes.models;

public class Triangle extends ShapeAbs{

    public Triangle(){

    }
    public Triangle(int number){
        setNumber(number);
    }
    @Override
    public void display() {
        for(int x = 0; x < getNumber() +1; x ++ ){
            for(int y = 0; y < x;y++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
