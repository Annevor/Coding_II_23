public class P9 {
    public static void main(String[] args) {
        double temp;
        for(double i = 1; i < 1000; i++){
            for(double j = 1; j < 1000; j++){
                temp = Math.sqrt(i * i + j * j);
                if((int)temp - temp == 0 && ((long)temp+i+j) == 1000){
                    System.out.println((int)i + ", " +(int)j + ", " +(int)temp);
                    System.out.println((long)(temp + i + j));
                }
            }
        }
    }
}
