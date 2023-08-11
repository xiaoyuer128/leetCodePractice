
/*
给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。

回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

例如，121 是回文，而 123 不是。
 */
import java.util.Scanner;

public class practice02 {
    public static void main(String[] args) {
        System.out.println("请输入整数");
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println(isPalindrome(x));
        System.out.println(isPalindrome1(x));
    }

    public static boolean isPalindrome(int x) {
        int m= 0;
        int y = x;
        if(x<0){
            return false;
        }else if(0 <= x && x<10) {
            return true;
        }else{
            while(y!=0){
                m = m*10 + y%10;
                y = y/10;
            }
            return m==x;
        }
    }
    public static boolean isPalindrome1(int x){
        {
                //边界判断
                if (x < 0) return false;
                int div = 1;
                while (x / div >= 10) div *= 10;
                while (x > 0) {
                    int left = x / div;
                    int right = x % 10;
                    if (left != right) return false;
                    x = (x % div) / 10;
                    div /= 100;
                }
                return true;}

}
    public static boolean isPalindrome2(int x) {
                //思考：这里大家可以思考一下，为什么末尾为 0 就可以直接返回 false
                if (x < 0 || (x % 10 == 0 && x != 0)) return false;
                int revertedNumber = 0;
                while (x > revertedNumber) {
                    revertedNumber = revertedNumber * 10 + x % 10;
                    x /= 10;
                }
                return x == revertedNumber || x == revertedNumber / 10;
            }
}