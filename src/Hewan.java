import java.util.ArrayList;

public class Hewan {
    public static void main(String args[]){
        ArrayList<String> dataHewan = new ArrayList<>(); // create object arraylist dataHewan
        ArrayList<String> deleteHewan = new ArrayList<>(); // create object arraylist deleteHewan
        // set data to first arraylist
        dataHewan.add("Kupu-kupu");
        dataHewan.add("Capung");
        dataHewan.add("Burung");
        dataHewan.add("Belalang");
        dataHewan.add("Kelelawar");
        // set data to second arraylist
        deleteHewan.add("Kelelawar");
        deleteHewan.add("Belalang");
        System.out.println("Hewan: " + dataHewan);
        dataHewan.removeAll(deleteHewan); // removeAll -> delete data second arraylist in first arraylist
        System.out.println("Hewan yang dihapus: " + dataHewan);

        System.out.println(deleteHewan);
    }

}
