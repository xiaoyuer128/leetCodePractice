import java.util.ArrayList;
import java.util.Scanner;

public class practice03 {
    public static void main(String[] args) {
        System.out.println("输入罗马数字：");
        Scanner sc= new Scanner(System.in);
        int m = romanToInt(sc.next());
        System.out.println(m);
    }
   /* public static int romanToInt(String s) {
        int sum= 0;
        if(s.equals("IV"))return 4;
        else if (s.equals("IX")) return 9;
        else{
            char[] m = new char[100];
            m = s.toCharArray();
            for (int i = 0; i < m.length; i++) {
                String c = String.valueOf(m[i]);
                switch (c){
                    case "I":{
                        if(String.valueOf(m[i+1])=="V"){
                            sum+=4;
                            i++;
                            break;
                        }
                        else if(String.valueOf(m[i+1])=="X"){
                            sum+=9;
                            i++;
                            break;

                        }
                        else sum+=1;
                        break;
                    }

                    case "X":{
                        if(String.valueOf(m[i+1])=="L"){
                            sum+=40;
                            i++;
                            break;

                        }
                        else if(String.valueOf(m[i+1])=="C"){
                            sum+=90;
                            i++;
                            break;

                        }
                        else sum+=10;
                        break;
                    }

                    case "V":sum+=5;
                        break;

                    case "L":sum+=50;
                        break;

                    case "C":{
                        if(String.valueOf(m[i+1])=="D"){
                            sum+=400;
                            i++;
                            break;

                        }
                        else if(String.valueOf(m[i+1])=="M"){
                            sum+=900;
                            i++;
                            break;

                        }
                        else sum+=100;
                        break;
                    }
                    case "D":sum+=500;
                        break;

                    case "M":sum+=1000;
                        break;

                    default:
                        break;


                }
            }
            return sum;
        }


    }
}*/


        public static int romanToInt(String s) {
            int sum = 0;
            int preNum = getValue(s.charAt(0));
            for(int i = 1;i < s.length(); i ++) {
                int num = getValue(s.charAt(i));
                if(preNum < num) {
                    sum -= preNum;
                } else {
                    sum += preNum;
                }
                preNum = num;
            }
            sum += preNum;
            return sum;
        }

        private static int getValue(char ch) {
            switch(ch) {
                case 'I': return 1;
                case 'V': return 5;
                case 'X': return 10;
                case 'L': return 50;
                case 'C': return 100;
                case 'D': return 500;
                case 'M': return 1000;
                default: return 0;
            }
        }
    }

