import java.lang.*;


public class InstumentToRent extends Instrument
{
    static String[][] instrumentAvailable={{"Guitar","available"},{"Piano","available"},{"Madal","available"},{"Flute","available"},{"Sarangi","available"},{"Violin","available"}};
    private float chargePerDay;
    private String dateOfRent;
    private String dateOfReturn;
    private int noOfDays;
    boolean isRented;
    private float totalPrice;
    
    
    //Constructor of InstrumentToRent class
    public static void main(){
        
        //Exception handeling if the instrument is not available in store
        try
        {
            InstumentToRent ins1=new InstumentToRent("Guitar",500);
            ins1.rentInstrument("Pralhad Aryal","9817202410","Hetauda",123456,"2020-2-10","2022-2-15",5);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        try{
            InstumentToRent ins2=new InstumentToRent("Guitar",500);
            ins2.rentInstrument("Pralhad Aryal","9817202410","Hetauda",123456,"2020-2-10","2022-2-15",5);
        }
        catch (Exception e){
            System.out.println("Instrument not available or already rented\n");
        }
        
        try{
            InstumentToRent ins3=new InstumentToRent("Piano",500);
            ins3.rentInstrument("Pralhad Aryal","9817202410","Hetauda",123456,"2020-2-10","2022-2-15",5);
        }
        catch (Exception e){
            System.out.println("Instrument not available or aldready rented\n");
        }
        
        InstumentToRent.returnInstrument("Guitar");
        
        
    }
    
    public InstumentToRent(String instrumentName,float chargePerDay) throws Exception
    {
        super(instrumentName);
        this.chargePerDay=chargePerDay;
        this.dateOfRent="";
        this.dateOfReturn="";
        this.noOfDays=0;
        this.isRented=false;
        
        //It gives error when the instrument is not available.
        if(!this.checkInstrument()){
            throw new Exception("Instrument not available");
        }
    }
    
    //Getter and setter method for all instance veriable of class InstrumetnToRent
    
    public void setChargePerDay(int value){
        this.chargePerDay=value;
    }
    
    public float getChargePerDays(){
        return this.chargePerDay;
    }
    
    
    public void setDateOfRent(String value){
        this.dateOfRent=value;
    }
    
    public String getDateOfRent(){
        return this.dateOfRent;
    }
    
    public void setDateOfReturn(String value){
        this.dateOfReturn=value;
    }
    
    public String getDateOfReturn(){
        return this.dateOfReturn;
    }
    
    public void setNoOfDays(int value){
        this.noOfDays=value;
    }
    
    public int getNoOfDays(){
        return this.noOfDays;
    }
    
    public void setTotalPrice(float value){
        this.totalPrice=value;
    }

    public float getTotalPrice(){
        return this.totalPrice;
    }
    
    
    //Rent Instrument method
    public void rentInstrument(String customerName, String customerPhone, String cutomerAddress, int customerPan, String dateOfRent, String dateOfReturn,int noOfDays){
            this.setCustomerName(customerName);
            this.setCustomerPhone(customerPhone);
            this.setCustomerAddress(cutomerAddress);
            this.setCustomerPanNo(customerPan);
            this.setCustomerPhone(customerPhone);
            this.setDateOfRent(dateOfRent);
            this.setDateOfReturn(dateOfReturn);
            this.setNoOfDays(noOfDays);
            float charge=this.getNoOfDays()*this.getChargePerDays();
            this.setTotalPrice(charge);
            this.isRented=true;
            this.display();
    }
    
    //Checks If the instrument is available or not
    
    public boolean checkInstrument(){
        
        for(int i=0;i < InstumentToRent.instrumentAvailable.length;i++){
            if(InstumentToRent.instrumentAvailable[i][0]==this.getInstrumentName() && InstumentToRent.instrumentAvailable[i][1]=="available"){
                InstumentToRent.instrumentAvailable[i][1]="unavailable";
                return true;
            }
        }
        return false;
    }
    
    //Static method to return instrument
    public static void returnInstrument(String instrumentName){
        for(int i=0;i < InstumentToRent.instrumentAvailable.length;i++){
            if(InstumentToRent.instrumentAvailable[i][0]==instrumentName && InstumentToRent.instrumentAvailable[i][1]=="unavailable"){
                InstumentToRent.instrumentAvailable[i][1]="available";
                System.out.println("Thanks please give us a chance to service again.");
                return;
            }
        }
        System.out.println("Instrument was not rented.");
    }
    
    public void display(){
        super.display();
        System.out.println("Total price=> "+this.totalPrice+"\n");   
    }
}
