
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
    private static final double honorary = 0.04;

    public AirTransportation(String name, int numberOfContainers)
    {
        super();
        if(name!=null|| name !=""){
            this.name = name;
        }
        
        if(numberOfContainers!=0){ this.numberOfContainers = 1;}
        else{
            this.numberOfContainers = numberOfContainers;
        }
    }
    
    public void setName(String name)
    {
        if(name!=null|| name !=""){
            this.name = name;
        }
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setNumberOfContainers(int numberOfContainers)
    {
        if(numberOfContainers!=0){ this.numberOfContainers = 1;}
        else{
            this.numberOfContainers = numberOfContainers;
        }
    }
    
    public int getNumberOfContainers()
    {
        return this.numberOfContainers;
    }
}
