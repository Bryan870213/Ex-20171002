import java.util.Scanner;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char v = sc.next().charAt(0);
        if( v - 'A' >= 0 && v - 'A' <= 26){
        }
        else if(v -'a' >= 0 && v - 'a' <= 26){
        }
        else{
            System.out.println("非英文字母");
        }
    }
}
