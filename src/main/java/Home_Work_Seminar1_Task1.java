// 1. Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i
import java.util.Random;


public class Home_Work_Seminar1_Task1 {
    public static void main(String[] args) {

        System.out.println("Случайное целое числов диапазоне от -1000 до 1000:");
        System.out.println(randonumber(-1000,1000));
    }
    static int randonumber(int min,int max) {
        Random random = new Random();
        int i = random.nextInt(min,max); //это кидалка случайных чисел!)
        return  i;
    }
}
