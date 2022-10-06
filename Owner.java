import java.util.*;

public class Owner {
    private int idOwner;
    private String name, address;
    // private SailBoat sailboat;
    private ArrayList <SailBoat> sailboat;
    // private MotorBoat motorboat;
    private ArrayList <MotorBoat> motorboat;
    // private Stack boat = new Stack<Boat>();

    Owner(String name, String address){
        this.idOwner = ++BoatStorage.id;
        this.name = name;
        this.address = address;
        this.sailboat = new ArrayList<SailBoat>();
        this.motorboat = new ArrayList<MotorBoat>();
    }

    public void setIdOwner(int setIdOwner){
        this.idOwner = setIdOwner;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setboat(Boat kapal){
        if(kapal instanceof SailBoat){
            this.sailboat.add((SailBoat) kapal);
        }else if(kapal instanceof MotorBoat){
            this.motorboat.add((MotorBoat) kapal);
        }
    }

    public int getIdOwner(){
        return this.idOwner;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public SailBoat getSailBoat(int i){
        return this.sailboat.get(i);
    }

    public MotorBoat getMotorBoat(int i){
        return this.motorboat.get(i);
    }

    public double totalAsuransi(){
        double total = 0;
        for(int i = 0; i < sailboat.size(); i++){
            total += sailboat.get(i).sewaGudang();
        }
        for(int i = 0; i < motorboat.size(); i++){
            total += motorboat.get(i).sewaGudang();
        }
        return total;
    }

    public ArrayList<SailBoat> getAllSailBoat(){
        return this.sailboat;
    }

    public ArrayList<MotorBoat> getAllMotorBoat(){
        return this.motorboat;
    }
}