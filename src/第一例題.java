import java.util.Scanner;

public class 第一例題 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char v = sc.next().charAt(0);
        if( v - 'A' >= 0 && v - 'A' <= 26){
            System.out.println(Character.toString(v).toLowerCase());
        }
        else if(v -'a' >= 0 && v - 'a' <= 26){
            System.out.println(Character.toString(v).toUpperCase());
        }
        else{
            System.out.println("非英文字母");
        }
    }
}
