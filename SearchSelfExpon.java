public class SearchSelfExpon {
    public static void main(String[] args) {

        search(3);

    }
    //number 是位数
    public static void search(int number){
        double start = Math.pow(10,(number-1));
        double end = Math.pow(10,number)-1;
        int count =0;
        for (int i = (int)start; i <=(int)end ; i++) {

            double sum =0;
            int num = i;
            for (int j = 0; j < number; j++) {

                sum = Math.pow(num%10,number)+sum;
                num = num/10;
            }
            if(sum==i){
                count++;
                System.out.println(i);

            }
        }

        System.out.println((int)number+"位数中共有"+count+"个自幂数");
    }
}
