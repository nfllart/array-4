import java.util.ArrayList;

public class arrayli {
    public static void main(String[] args) {
        ArrayList <Integer> angka = new ArrayList<Integer>();

        System.out.println("ukuran sebelum arraylist: "+angka.size());
        System.out.println("==============");
        System.out.println("mengisi arraylist");
        System.out.println("==============");
        for (int i=0; i<10;i++){
            angka.add(i);
        }
        System.out.println("menampilkan arraylist");
        System.out.println("==============");
        for (int nilai : angka){
            System.out.println("angka: "+nilai);
        }
    }
}
