import java.util.ArrayList;

public class soal4 {

    public static void main(String[] args) {
        // String[] nama= {"A","R","I","N"};
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("A");
        nama.add("R");
        nama.add("I");
        nama.add("N");

        //Soal nomor 4
        //Tentukan hasil yang didapatkan ketika dilakukan perintah ini : indexOf(a), indexOf(c), indexOf(q)
        System.out.println(nama.indexOf("a"));
        System.out.println(nama.indexOf("c"));
        System.out.println(nama.indexOf("q"));
    }
    
}
