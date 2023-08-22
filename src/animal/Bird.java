package animal;


public class Bird extends Animal
{
    private int featherColour;
    private String SFeatherColour;

    public String getSFeatherColour() 
    {
        return SFeatherColour;
    }

    public void setSFeatherColour(String SFeatherColour) 
    {
        this.SFeatherColour = SFeatherColour;
    }

    public int getFeatherColour() 
    {
        return featherColour;
    }

    public void setFeatherColour(int featherColour) 
    {
        this.featherColour = featherColour;
    }
    
    @Override
    public void input()
    {
        switch(getFeatherColour())
        {           
            case 1:
                SFeatherColour = "Grey";
                setSFeatherColour(SFeatherColour);
            break;
            case 2:
                SFeatherColour = "White";
                setSFeatherColour(SFeatherColour);
            break;
            case 3:
                SFeatherColour = "Black";
                setSFeatherColour(SFeatherColour);
            break;              
        }
    }    
    
    @Override
    public void output()
    {
                
        System.out.println("Data has been displayed"
                + "\n(Child bird Class)");
    }
}
