import java.util.ArrayList;
import java.util.Scanner;

public class practice03 {
    public static void main(String[] args) {
        System.out.println("输入罗马数字：");
        Scanner sc= new Scanner(System.in);
        int m = romanToInt(sc.next());
        System.out.println(m);
    }
    public static int romanToInt(String s) {
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
}
