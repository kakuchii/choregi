public class Lesson16{
    public static int [] makeArray(int size){
        int[]newAray = new int[size];
        for (int i = 0; i < newAray.length; i++){
            newAray[i] = i;
        }
        return newAray;
    }
    public static void main(String[] args) {
        int[] array = makeArray(3);
        for (int i : array){
            System.out.println(i);
        }
    }
}