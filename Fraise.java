/**
 *
 * @author gaju_mamy
 */
public class Fraise {
    private double prix;
    private String origine;
	
    public Fraise() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Fraise(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;   
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Fraise de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 fraises sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Fraise fr = (Fraise) o;
            return (prix == fr.prix && origine.equals(fr.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une fraise a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
	System.out.println("premier test Fraise");
        Fraise fr=new Fraise(1.99,"France");
        Fraise ch=new Fraise(0.99,"Suisse");
        System.out.println(fr.toString());
        fr.setPrix(4.00);
        System.out.println(fr.toString());
        System.out.println(ch.toString());
        ch.setOrigine("Mexico");
        //System.out.println(ch.toString());
    }
 
   }
