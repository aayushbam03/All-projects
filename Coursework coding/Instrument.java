public class Instrument
{
    // instance variables - replace the example below with your own
    private int x;
    static int instrumentId=0;
    private String instrumentName;
    private String customerName;
    private int customerPanNo;
    private String customerPhone;
    private String customerAddress;
    int instrumentid;
    
    public Instrument(String InstrumentName)
    {
        // initialise instance variables
        this.instrumentName=InstrumentName;
        this.instrumentid=Instrument.instrumentId;  //Instrument id increament while calling a intanse
        Instrument.instrumentId++;
        this.customerName="";
        this.customerPanNo=0;
        this.customerPhone="";
        this.customerAddress="";
        
        
    }
    
    public static void main(){
        Instrument ins= new Instrument("Guitar");
        ins.display();
        
        Instrument ins2=new Instrument("Piano");
        ins2.display();
    }
    
    public void setCustomerName(String value){
        this.customerName=value;
    }
    
    public String getCustomerName(){
        return this.customerName;
    }
    
    public void setInstrumentName(String value){
        this.instrumentName=value;
    }
    
    public String getInstrumentName(){
        return this.instrumentName;
    }
    
    public void setCustomerAddress(String value){
        this.customerAddress=value;
    }
    
    public String getCustomerAddress(){
        return this.customerAddress;
    }
    
    public void setCustomerPhone(String value){
        this.customerPhone=value;
    }
    
    public String getCustomerPhone(){
        return this.customerPhone;
    }
    
    public void setCustomerPanNo(int value){
        this.customerPanNo=value;
    }
    
    public int getCustomerPanNo(){
        return this.customerPanNo;
    }
    
    public void display(){
    {
        System.out.println("Instrument Id=> "+this.instrumentId+"\n"+"Instrument Name=> "+this.instrumentName+"\n"+"Customer Name=> "+this.customerName+"\n"+"Customer Address=> "+this.customerAddress+"\n"+"Customer Pan No=> "+this.customerPanNo+"\n"+"Customer Phone no=>"+this.customerPhone);
    }
}