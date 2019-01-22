import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int numb1 = Integer.parseInt(reader.readLine());
        int numb2 = Integer.parseInt(reader.readLine());
        int numb3 = Integer.parseInt(reader.readLine());
        
        int count_positive = 0;
        int count_negative = 0;
        
        if(numb1 > 0 ){
            count_positive ++;
        }
        if(numb2 > 0 ){
            count_positive ++;
        }
        if(numb3 > 0 ){
            count_positive ++;
        }
        
        if(numb1 < 0 ){
            count_negative ++;
        }
        if(numb2 < 0 ){
            count_negative ++;
        }
        if(numb3 < 0 ){
            count_negative ++;
        }
        
        
        System.out.println("количество отрицательных чисел: " + count_positive );
        System.out.println("количество положительных чисел: " + count_negative);
    }
    
}
