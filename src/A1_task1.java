import java.util.HashMap;
import java.util.Map;

interface asset{
    void display(String cell);
}
class tree implements asset{
    public void display(String cell){
        System.out.println("Tree is displayed at "+cell);
    }
}
class rock implements asset{
    public void display(String cell){
        System.out.println("Rock is displayed "+cell);
    }
}
class coin implements asset{
    public void display(String cell){
        System.out.println("Coin is displayed "+cell);
    }
}
class assetfactory{
    private static final Map<String,asset> map=new HashMap<>();
    private static assetfactory instance;
    private assetfactory(){}
    public static assetfactory getinstance(){
        if(instance==null){
            instance=new assetfactory();
        }
        return instance;
    }
    public asset getasset(String type){
        asset a=map.get(type);
        if(a==null){
            if(type.equalsIgnoreCase("tree")){
                a=new tree();
            }
            else if(type.equalsIgnoreCase("rock")){
                a=new rock();
            }
            else if(type.equalsIgnoreCase("coin")){
                a=new coin();
            }
            map.put(type,a);
            System.out.println("Creating new instance of "+type);
        }
        else{
            System.out.println("Returning existing instance of "+type);
        }
        return a;
    }

}


public class A1_task1 {
    public static void main(String[] args) {
     assetfactory a=assetfactory.getinstance();
     a.getasset("tree").display("cell1");
     a.getasset("coin").display("cell3");
     a.getasset("tree").display("cell2");
     a.getasset("tree").display("cell4");
    }
}
