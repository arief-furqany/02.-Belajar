package BelajarProsedural;

public class perulanganFor {
    public static void main(String[]args){
        System.out.println("Mencari Nilai Rata - rata");
        int nilai_ujian[] = {20, 30, 20, 30, 20};
        // int nilai_ujian = 10;?
        int hasil = 0;

        for (int i = 0; i < nilai_ujian.length; i++){
            hasil = hasil +  nilai_ujian[i];
        

        }
        // System.out.println("Rata - rata adalah " + hasil + "" + 5);
        System.out.println("Rata - rata adalah " + hasil);
    }
    
}
