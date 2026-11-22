class single{
    private static single instance = null;
    private single()    {

    }
    static single getinstance()
    {
        if(instance == null)
        {
            instance = new single();
        }
        return instance;
    }
}

public class Singleton {
    public static void main(String[] args) {
        single s1=single.getinstance();
        single s2=single.getinstance();
        System.out.println(s1 == s2);
    }
}
