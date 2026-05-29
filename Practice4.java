public class Practice4{
    public static void main(String[] args) {
       int[] points = new int[4];
       double[] weights = new double[5];
       boolean[] answers = new boolean[3];
       String[] names = new  String[3];


    //4-2
       int[] moneylist = {121902, 8302, 55100};
       for (int i = 0; i < moneylist.length; i++){
        System.out.println(moneylist[i]);
       }
       for (int m : moneylist){
        System.out.println(m);
       }
    //4-4
       int[] numbers = {3,4,9};
       System.out.println("1桁の数字を入力してください");
       int input = new java.util.Scanner(System.in).nextInt();
       for (int n : numbers){
        if(n == input){
            System.err.println("あたり！");
        }
       }

    }
}

