public class MotorBoat extends Boat{
    private double horsePower;
    private double  pajak = 0.1;

    MotorBoat(String name, double height, double length, double width, double horsePower){
        super(name, height, length, width);
        this.horsePower = horsePower;
        BoatStorage.countMotorBoat++;
    }

    @Override
    public double totalMonthlyCharge(){
        setMotorBoat(this);
        return this.horsePower * pajak;
    }

    public double sewaGudang(){
        return super.totalMonthlyCharge();
    }

    public double asuransi(){
        return super.getBoatValue();
    }
}