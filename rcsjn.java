public class rcsjn {
 public static int sum(int k) {
    if (k>0) {
        return k+sum (k-1);

    }  else {
        return 0;
    }
}
 public static void main(String[] args) {
    int result= sum(1060);
    System.out.println(result );
 }  
} 
