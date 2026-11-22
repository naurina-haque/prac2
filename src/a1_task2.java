interface backend{
    String process();
}
class pdf implements backend{
    public String process(){
        return "pdf";
    }
}
class html implements backend{
    public String process(){
      return"html";
    }
}

abstract class doc{
    backend b;
    public doc(backend b) {
        this.b = b;
    }
    public abstract String display();

}
class report extends doc{
    public report(backend b) {
        super(b);
    }
    public String display(){
        return "Report is displayed in "+b.process();
    }
}
class invoice extends doc{
    public invoice(backend b){
        super(b);
    }
    public String display(){
        return "Invoice is displaying in " +b.process();
    }
}


public class a1_task2 {
    public static void main(String[] args) {
        System.out.println("a1_task2 class is running.");
        doc d=new report(new pdf());
        System.out.println(d.display());
    }
}
