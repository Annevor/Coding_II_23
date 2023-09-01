public class GabeRand{
    public static void main(String[] args) {
        double seed = System.currentTimeMillis();
        Math.floor(seed);
        double usage = seed;
        if((int)usage % 2 == 0){
            usage = Math.cos(Math.sin(usage));
            usage = Math.sqrt(Math.pow(usage, 2)) / 0x5F3759DF;
        } else {
            usage = Math.cos(Math.sqrt(Math.sqrt(usage))) / usage;
        }
        System.out.println(usage);
    }
}