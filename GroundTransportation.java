
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
    private static final double honorary = 0.03;
    
    public GroundTransportation(String licensePlate)
    {
        super();
        
        if(licensePlate != null || licensePlate == "")
        {
            this.licensePlate = licensePlate;
        }
        
        else {licensePlate = "1234";}
        
        setFees(honorary);
    }
    
    /** GETS **/
    
    public String getLicensePlate()
    {
        return licensePlate;
    }
    
    /** SETS **/
    
    public void setLicensePlate(String newLicensePlate)
    {
        licensePlate = newLicensePlate;
    }
}
