import java.util.Scanner;

public class OperatorPenugasan{
    

    public static void main(String[] args) {
        try (Scanner scan = new Scanner (System.in)) {
            System.out.println("masukkan angka penugasan 1");
            int input_penugasan1 = scan.nextInt();
            System.out.println("Masukkan angka penugasan 2");
            int input_penugasan2 = scan.nextInt();

            System.out.println("pilih operator penugasan yang di inginkan");
            System.out.println("a. tambah sama dengan");
            System.out.println("b. kurang sama dengan");
            System.out.println("c. kali sama dengan");
            System.out.println("d. bagi sama dengan");
            System.out.println("e. modulus sama dengan");
   
            int a = input_penugasan1 += input_penugasan2;
            int b = input_penugasan1 -= input_penugasan2;
            int c = input_penugasan1 *= input_penugasan2;
            int d = input_penugasan1 /= input_penugasan2;
            int e = input_penugasan1 %= input_penugasan2;

            int assignmentinput = scan.nextInt();

            if (assignmentinput == a) {
                System.out.println("input satu ditambah sama dengan input dua adalah : " +a);
            } else if (assignmentinput == b){
                System.out.println("input satu dikurang sama dengan input dua adalah : " + b);
            } else if (assignmentinput == c){
                System.out.println("input satu dikali sama dengan input dua adalah : " +c);
            } else if (assignmentinput == d){
                System.out.println("input satu dibagi sama dengan input dua adalah : " +d);
            } else if (assignmentinput == e){
                System.out.println("hasil modulus dari input satu dengan input dua adalah : " +e);
            }else {
                System.out.println("goblok amat lu tolol");
            }
        }

    }  


}


        