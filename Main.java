import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in) ;
        int max = 0 ;
        while (ad.hasNextInt()){
            int q = ad.nextInt() ;
            if ( q > max ){
                max = q ;
            }
        }
        System.out.println(max);
    }
}