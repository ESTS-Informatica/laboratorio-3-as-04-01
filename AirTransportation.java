
/**
 * Escreva uma descrição da classe AirTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AirTransportation extends Transport
{
    //Atributos
    private String name;
    private int numberOfContainers;
    private static final double HONORARY = 4;

    public AirTransportation(String name, int numberOfContainers)
    {
        super();
        if(name!=null|| name !=""){
            this.name = name;
        }
        
        if(numberOfContainers<=0){ this.numberOfContainers = 10;}
        else{
            this.numberOfContainers = numberOfContainers;
        }
    }
    

    /** GETS **/
    
    public String getName()
    {
        return this.name;
    }
    
    public int getNumberOfContainers()
    {
        return this.numberOfContainers;
    }
    
    @Override
    public double getPriceWithFees()
    {
        return super.getPriceWithFees() * (1.0 +(this.HONORARY * 0.01));
    }
    
    public String getTransportType()
    {
        return "Transporte Aereo";
    }
    
    
    /** SETS **/
    

    public void setName(String name)
    {
        if(name!=null|| name !=""){
            this.name = name;
        }
    }
    
    public void setNumberOfContainers(int numberOfContainers)
    {
        if(numberOfContainers <=0){ this.numberOfContainers = 15;}
        else{
            this.numberOfContainers = numberOfContainers;
        }
    }
    
    /** METHODS **/
    @Override
    public String toString()
    {
        super.toString();
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", this.getTransportType()));  
        sb.append(String.format("%15s: %s\n", "ID", super.getId()));
        sb.append(String.format("%15s: %s\n", "Origem", super.getOrigin()));
        sb.append(String.format("%15s: %s\n", "Destino", super.getDestination()));
        sb.append(String.format("%15s: %5.2f€\n", "Preço", super.getPrice()));
        sb.append(String.format("%15s: %4.2f%%\n", "Honorarios", this.HONORARY));
        sb.append(String.format("%15s: %4.2f€\n", "Preço Final", this.getPriceWithFees()));
        sb.append(String.format("%15s: %s\n", "Nome", this.getName()));
        sb.append(String.format("%15s: %s\n", "NºContentores", this.getNumberOfContainers()));
        return sb.toString();

    }
}
