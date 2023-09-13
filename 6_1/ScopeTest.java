public class ScopeTest {
    
    public static void main(String[] args) {
        int i = 0;
        
        for(int b = 64; b >0; b=b/2 ){
            System.out.print(b +" ");
        } 
        
        System.out.println(i);
        
        System.out.println("");
        for(int j = 0; j<=5; j++){
            System.out.print(j +" ");
        }
        
        System.out.println("");
        for(int j = 5; j>=0; j--){
            System.out.print(j +" ");
        }
        
        System.out.println("");
        for(int k = 2; k<=64; k=k*2){
            System.out.print(k +" ");
        }
        

    }  
}
