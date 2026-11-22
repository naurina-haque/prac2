interface shape{
    void draw();
}
class Circle implements shape{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}
class Square implements shape{
    public void draw(){
        System.out.println("Drawing Square");
    }
}
class shapefactory{
    public static shape getinstance(String s){
        if(s.equalsIgnoreCase("Circle")){
            return new Circle();
        }

        if(s.equalsIgnoreCase("Square")) {
            return new Square();
        }

        return null;
    }
}



public class Factory {
    public static void main(String[] args) {
        System.out.println("Factory class is running.");
        shape sh = shapefactory.getinstance("Circle");
        sh.draw();
    }

}
