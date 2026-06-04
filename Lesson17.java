public class Lesson17{
    public static void main(String[] args) {
        int a = 10; int b = 2;
        int total = tasu(a,b);
        int delta = hiku(a,b);
        System.out.println("足すと" + total + "、引くと" + delta);
        System.out.println("元気が出ないよ");
    }
    public static int tasu (int a , int b){
        return (a + b);
    }
    public static int hiku (int a, int b){
        return (a - b);
    }
    
    
}