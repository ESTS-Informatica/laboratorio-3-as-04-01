
/**
 * Escreva uma descrição da classe Lorry aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Lorry extends GroundTransportation
{
    private int numberOfPallets;
    private int trailers;
    
    public Lorry(int numberOfPallets, int trailers, String licensePlate)
    {
        super(licensePlate);
        
        if(numberOfPallets < 0)
            this.numberOfPallets = 0;
        
        else
            this.numberOfPallets = numberOfPallets;
            
        if(trailers < 0)
            this.trailers = 0;
            
        else
            this.trailers = trailers;
        
    }
    
    /** GETS **/
    
    public int getNumberOfPallets()
    {
        return numberOfPallets;
    }
    
    public int getTrailers()
    {
        return trailers;
    }
    
    /** SETS **/
    
    public void setNumberOfPallets(int numberOfPallets)
    {
        this.numberOfPallets = numberOfPallets;
    }
    
    public void setTrailers(int trailers)
    {
        this.trailers = trailers;
    }
    
    /** METHODS **/
    
    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        
        sb.append(String.format("%15s: %s\n", "Número de Paletes", getNumberOfPallets()));
        sb.append(String.format("%15s: %s\n", "Número de atrelados", getTrailers()));
        
        return sb.toString();
    }
}
