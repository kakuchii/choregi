public class Practice6{
    public static void main(String[] args) {
        String title = "お誘い";
        String address = "dummy@xxxx.com";
        String text = "今度、飲みにいきませんか";
        email(title,address,text);
    }
    public static void email(String tittle, String address,String text){
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名:" + tittle);
        System.out.println("本文:" + text);
        System.out.println("眠い");
    }
}