
public class Prime {
    public static boolean kiemtranguyento(int N){
        for(int i =2; i<=Math.sqrt(N);i++){
            if(N%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int N = 2;
        while (N <= 200){
            if (kiemtranguyento(N)){
                System.out.println(N);
            }
            N ++;
        }

    }
}
