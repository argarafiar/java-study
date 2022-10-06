import java.util.ArrayList;

public class BoatStorage {
    public static int id = 0;
    public static int countSailBoat = 0;
    public static int countMotorBoat = 0;
    public static ArrayList <Owner> owner = new ArrayList<Owner>();
    public static void main(String[] args) {
        //soal no 1
        Owner owner1 = new Owner("Arga", "Surabaya");
        Owner owner2 = new Owner("Budi", "Malang");
        owner.add(owner1);
        owner.add(owner2);

        //soal no 2
        SailBoat sailBoat1 = new SailBoat("kapal layar", 10, 10, 10, 10, 10);
        owner1.setboat(sailBoat1);
        sailBoat1 = new SailBoat("kapal layar 2", 30, 30, 30, 30, 30);
        owner1.setboat(sailBoat1);

        MotorBoat motorBoat1 = new MotorBoat("kapal motor", 20, 20, 20, 20);
        // SailBoat sailBoat2 = new SailBoat("kapal layar", 30, 30, 30, 30, 30, 30);
        // MotorBoat motorBoat2 = new MotorBoat("kapal motor", 40, 40, 40, 40, 40);
        owner1.setboat(motorBoat1);
        owner2.setboat(motorBoat1);

        tampilOwner(owner1);
        tampilOwner(owner2);

        //soal no 4
        System.out.println("\nTotal biaya pemilik " + owner1.getIdOwner() + " adalah " + owner1.totalAsuransi());
        System.out.println("Total biaya pemilik " + owner2.getIdOwner() + " adalah " + owner2.totalAsuransi());
        System.out.println("Total Sail Boat : " + BoatStorage.countSailBoat);
        System.out.println("Total Motor Boat : " + BoatStorage.countMotorBoat);
        System.out.println("Total jumlah kapal : " + (BoatStorage.countSailBoat + BoatStorage.countMotorBoat));

        //soal no 5
        double totalAsuransi = 0;
        for (Owner o : owner) {
            totalAsuransi += o.totalAsuransi();
        }
        System.out.printf("\nTotal biaya seluruh kapal di gudang adalah %.2f\n", totalAsuransi);

        //soal no 6
        System.out.println();
        for (int i = 0; i < owner.size(); i++) {
            System.out.println(owner.get(i).getName());
        }

        //soal no 7
        owner1.getAllSailBoat().get(countMotorBoat-1).setName("Kapal jet");
        System.out.println("\nNama kapal pemilik " + owner1.getIdOwner() + " setelah di ganti : " + owner1.getAllSailBoat().get(countMotorBoat-1).getName());
    }

    public static void tampilOwner(Owner owner){
        for (int i = 0; i < owner.getAllSailBoat().size(); i++) {
            System.out.println("\n===== Pemilik " + owner.getIdOwner() + " =====");
            System.out.println("Nama Kapal: " + owner.getSailBoat(i).getName());
            System.out.println("Nama Pemilik: " + owner.getName());
            System.out.println("Alamat Pemilik: " + owner.getAddress());
            //soal no 3
            System.out.println("Total Biaya layar: " + owner.getSailBoat(i).totalMonthlyCharge());
            System.out.println("total Asuransi: " + owner.getSailBoat(i).asuransi());
            System.out.println("Total Biaya gudang: " + owner.getSailBoat(i).sewaGudang());
        }
        for (int i = 0; i < owner.getAllMotorBoat().size(); i++) {
            System.out.println("\n===== Pemilik " + owner.getIdOwner() + " =====");
            System.out.println("Nama Kapal: " + owner.getMotorBoat(i).getName());
            System.out.println("Nama Pemilik: " + owner.getName());
            System.out.println("Alamat Pemilik: " + owner.getAddress());
            // soal no 3
            System.out.println("Total Kebakaran: " + owner.getMotorBoat(i).totalMonthlyCharge());
            System.out.println("total Asuransi: " + owner.getMotorBoat(i).asuransi());
            System.out.println("Total Biaya Gudang: " + owner.getMotorBoat(i).sewaGudang());
        }
    }
}