public class InstrumentToSell extends Instrument
{
    static String[][] instrumentAvailable={{"Guitar","not sold"},{"Piano","not sold"},{"Madal","not sold"},{"Flute","not sold"},{"Sarangi","not sold"},{"Violin","not sold"}};
    private String dateOfSell;
    boolean isSold;
    private float totalPrice;
    
    //Constructor of InstrumentToRent class
    
    public InstrumentToSell(String instrumentName,float priceOfInstrument) throws Exception
    {
        super(instrumentName);
        this.dateOfSell="";
        this.isSold=false;
        this.totalPrice=priceOfInstrument;
        
        //It gives error when the instrument is not available.
        if(!this.checkInstrument()){
            throw new Exception("Instrument not available");
        }
    }
    
    //main static method to use this class
    
    public static void main(){
        try{
            InstrumentToSell ins1=new InstrumentToSell("Guitar",4000);
            ins1.sellInstrument("Pralhad Aryal","9817202410","Hetauda",72727272,"2006-10-21");
        }
        catch(Exception e){
            System.out.println("Instrument not available or sold\n");
        }
        
        try{
            InstrumentToSell ins2=new InstrumentToSell("Guitar",4000);
            ins2.sellInstrument("Pralhad Aryal","9817202410","Hetauda",72727272,"2006-10-21");
        }
        catch(Exception e){
            System.out.println("Instrument not available or sold\n");
        }
        
        try{
            InstrumentToSell ins3=new InstrumentToSell("Piano",4000);
            ins3.sellInstrument("Pralhad Aryal","9817202410","Hetauda",72727272,"2006-10-21");
        }
        catch(Exception e){
            System.out.println("Instrument not available or sold\n");
        }
        
    }
    
    //Getter and setter metho for all instance veriable of class InstrumetnToRent
    
    public void setDateOfSell(String value){
        this.dateOfSell=value;
    }
    
    public String getDateOfSell(){
        return this.dateOfSell;
    }
    
    public void setTotalPrice(float value){
        this.totalPrice=value;
    }

    public float getTotalPrice(){
        return this.totalPrice;
    }
    //Rent Instrument method
    
    public void sellInstrument(String customerName, String customerPhone, String cutomerAddress, int customerPan, String dateOfSell){
        this.setCustomerName(customerName);
        this.setCustomerPhone(customerPhone);
        this.setCustomerAddress(cutomerAddress);
        this.setCustomerPanNo(customerPan);
        this.setCustomerPhone(customerPhone);
        this.isSold=true;
        this.display();
    }
    
    //Display if instrument is not available
    
    public void notAvailable(){
        System.out.println(this.getInstrumentName()+" instrument is not available");
    }
    
    //Checks If the instrument is available or not
    
    public boolean checkInstrument(){
        
        for(int i=0;i < InstrumentToSell.instrumentAvailable.length;i++){
            if(InstrumentToSell.instrumentAvailable[i][0]==this.getInstrumentName() && InstrumentToSell.instrumentAvailable[i][1]=="not sold"){
                InstrumentToSell.instrumentAvailable[i][1]="sold";
                return true;
            }
        }
        return false;
    }
    
    //Display method
    
    public void display(){
        super.display();
        System.out.println("Total price=> "+this.totalPrice+"\n");   
    }
}
