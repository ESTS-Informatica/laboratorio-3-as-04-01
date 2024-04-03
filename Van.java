
/**
 * Escreva uma descrição da classe Van aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Van extends GroundTransportation
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int packages;

    /**
     * Construtor para objetos da classe Van
     */
    public Van(int packages, String licencePlate)
    {
        super(licencePlate);
        
        if(packages<=0){ this.packages = 1;}
        else{
            this.packages = packages;
        }
    }
    
    /** GETS **/
    
    public int getNumberOfPackages()
    {
        return this.packages;
    }
    
    /** SETS **/
    public void setNumberOfPackages(int packages)
    {
        if(packages <= 0){ this.packages = 1;}
        else{
            this.packages = packages;
        }
    }

    /** METHODS **/
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", getTransportType()));  
        sb.append(String.format("%15s: %s\n", "ID", super.getId()));
        sb.append(String.format("%15s: %s\n", "Origem", super.getOrigin()));
        sb.append(String.format("%15s: %s\n", "Destino", super.getDestination()));
        sb.append(String.format("%15s: %5.2f€\n", "Preço", super.getPrice()));
        sb.append(String.format("%15s: %4.2f%%\n", "Honorarios", getFees()));
        sb.append(String.format("%15s: %4.2f€\n", "Preço Final", getPriceWithFees()));
        sb.append(String.format("%15s: %s\n", "Matricula", getLicensePlate()));
        sb.append(String.format("%15s: %s\n", "Packages", this.getNumberOfPackages()));
     
        return sb.toString();
    }
}
