public class SailBoat extends Boat {
    private double mastHeight, sailArea;
    private double pajak = 0.1;

    SailBoat(String name, double height, double length, double width, double mastHeight, double sailArea){
        super(name, height, length, width);
        this.mastHeight = mastHeight;
        this.sailArea = sailArea;
        BoatStorage.countSailBoat++;
    }

    public void setMastHeight(double mastHeight){
        this.mastHeight = mastHeight;
    }

    public void setSailArea(double sailArea){
        this.sailArea = sailArea;
    }

    public double getMastHeight(){
        return this.mastHeight;
    }

    public double getSailArea(){
        return this.sailArea;
    }

    @Override
    public double totalMonthlyCharge(){
        setSailBoat(this);
        return (mastHeight * sailArea) * pajak;
    }

    public double sewaGudang(){
        return super.totalMonthlyCharge();
    }

    public double asuransi(){
        return super.getBoatValue();
    }
}