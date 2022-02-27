import java.util.ArrayList;

public class soal5 {

    public static void main(String[] args) {
         // String[] nama= {"A","R","I","N"};
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("A");
        nama.add("R");
        nama.add("I");
        nama.add("N");

        System.out.println("ArrayList sebelum remove: ");
        for(String var: nama){
            System.out.println(var);
        }
        //Soal nomor 4
        //Tentukan hasil yang didapatkan ketika dilakukan perintah ini : remove(0), remove(3), remove(2)
        nama.remove(0);
        nama.remove(3);
        nama.remove(2);
        System.out.println("ArrayList setelah remove: ");
        for (String var2: nama){
            System.out.println(var2);
        }
    }
    
}
