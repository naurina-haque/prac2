interface target{
    void move();
}
class car {
    public void carmove(){
        System.out.println("Car is moving");
    }
}
class adapterr implements target{
    private car c;
    public adapterr(car ca){
        this.c = ca;
    }
   @Override
    public void move(){

        c.carmove();
    }
}

public class Adapter {
    public static void main(String[] args) {
        System.out.println("Adapter class is running.");
        target t= new adapterr(new car());
        t.move();
    }
}
