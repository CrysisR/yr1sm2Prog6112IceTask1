package animal;

public class Animal 
{
    private int IDTag;
    private String species;

    public int getIDTag() 
    {
        return IDTag;
    }

    public void setIDTag(int IDTag) 
    {
        this.IDTag = IDTag;
    }

    public String getSpecies() 
    {
        return species;
    }

    public void setSpecies(String species) 
    {
        this.species = species;
    }
    
    public void input()
    {
        System.out.println("Data has been captured"
                + "\n(Parent Class)");
    }
    
    public void output()
    {
        System.out.println("Data has been displayed"
                + "\n(Parent Class)");
    }
    
}
