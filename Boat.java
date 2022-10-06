public class Boat {
    private String name;
    private double height, length, width, chargeRate = 10, boatValue;
    private Owner pemilik;
    private SailBoat sailboat;
    private MotorBoat motorboat;

    Boat(String name, double height, double length, double width){
        this.name = name;
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setBoatValue(double boatValue){
        this.boatValue = boatValue;
    }

    public void setOwner(Owner pemilik){
        this.pemilik = pemilik;
    }

    public void setChargeRate(double chargeRate){
        this.chargeRate = chargeRate;
    }

    public void setSailBoat(SailBoat sailboat){
        this.sailboat = sailboat;
    }

    public void setMotorBoat(MotorBoat motorboat){
        this.motorboat = motorboat;
    }

    public String getName(){
        return this.name;
    }

    public double getHeight(){
        return this.height;
    }

    public double getWidth(){
        return this.width;
    }

    public double getLength(){
        return this.length;
    }

    public double getChargeRate(){
        return this.chargeRate;
    }

    public double totalMonthlyCharge(){
        return sailboat != null ? this.sum() + sailboat.totalMonthlyCharge() + this.getBoatValue() : (this.sum() + motorboat.totalMonthlyCharge()) + this.getBoatValue();
    }

    public double sum(){
        return getHeight() * getLength() * getWidth() * getChargeRate();
    }

    public void setBoatValue(){
        if(sailboat != null){
            this.boatValue = (this.sum() + sailboat.totalMonthlyCharge()) * 0.0005;
        }else{
            this.boatValue = (this.sum() + motorboat.totalMonthlyCharge()) * 0.0005;
        }
    }

    public double getBoatValue(){
        this.setBoatValue();
        return this.boatValue;
    }
}