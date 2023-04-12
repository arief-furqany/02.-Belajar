package projectBelajar;

public class PersegiPanjang {
    public static void main(String[] args) {
        
        int panjang, lebar, tinggi;
        panjang = 10;
        lebar = 12;
        tinggi = 8;

        for (int i = 0; i < panjang; i++){
            for (int j = 0; j < lebar; j++){
                for (int k = 0; k < tinggi; k++){
                    System.out.println("*");
                }
                
            } 
                System.out.println('\n');
        }

    }
}
