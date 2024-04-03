
/**
 * Escreva uma descrição da classe GroundTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GroundTransportation extends Transport
{
    //Atributos
    private String licensePlate;
    private static final double HONORARY = 3;
    
    public GroundTransportation(String licensePlate)
    {
        super();
        
        if(licensePlate != null || licensePlate != "")
        {
            this.licensePlate = licensePlate;
        }
        
        else {licensePlate = "1234";}
        
    }
    
    /** GETS **/
    
    public String getLicensePlate()
    {
        return licensePlate;
    }
    
    public double getFees()
    {
        return HONORARY;
    }
    
    @Override
    public double getPriceWithFees()
    {
        double price = getPrice();
        return price * (1.0 + (this.HONORARY * 0.01));
        
    }
    
    @Override
    public String getTransportType()
    {
        return "Transporte Terrestre";
    }
    
    
    /** SETS **/
    
    public void setLicensePlate(String newLicensePlate)
    {
        licensePlate = newLicensePlate;
    }
    
    
    /** METHODS **/
    
    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", getTransportType()));  
        sb.append(String.format("%15s: %s\n", "ID", super.getId()));
        sb.append(String.format("%15s: %s\n", "Origem", super.getOrigin()));
        sb.append(String.format("%15s: %s\n", "Destino", super.getDestination()));
        sb.append(String.format("%15s: %5.2f€\n", "Preço", super.getPrice()));
        sb.append(String.format("%15s: %4.2f%%\n", "Honorarios", getFees()));
        sb.append(String.format("%15s: %4.2f€\n", "Preço Final", getPriceWithFees()));
        sb.append(String.format("%15s: %s\n", "Matricula", getLicensePlate()));
     
        return sb.toString();
    }
}
