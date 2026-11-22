class notificationService{
    private static notificationService ns;
    private notificationService() {
    }
    public static notificationService getinstance(){
        if(ns==null){
            ns=new notificationService();
        }
        return ns;
    }
    public notification sendnotification(String type){
        if(type.equalsIgnoreCase("email")){
            notification n=new emailnotification();
            return n;
        }
        else if(type.equalsIgnoreCase("sms")){
            notification n=new smsnotification();
            return n;
        }
        else if(type.equalsIgnoreCase("push")){
            notification n=new pushnotification();
            return n;
        }
        else{
            System.out.println("Invalid notification type.");
            return null;
        }
    }
}

interface notification{
    void notifyuser();
}

class emailnotification implements notification {
    public void notifyuser() {
        System.out.println("Email notification sent.");


    }
}
class smsnotification implements notification {
    public void notifyuser() {
        System.out.println("SMS notification sent.");
    }
}
class pushnotification implements notification {
    public void notifyuser() {
        System.out.println("Push notification sent.");
    }
}

public class b1_task2 {
    public static void main(String[] args) {
       notificationService ns=notificationService.getinstance();
       notification n= ns.sendnotification("email");
        n.notifyuser();
    }
}