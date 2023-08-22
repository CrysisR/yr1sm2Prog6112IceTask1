package animal;

public class Reptile extends Animal
{
    private double bloodTemp;

    public double getBloodTemp() 
    {
        return bloodTemp;
    }

    public void setBloodTemp(double bloodTemp) 
    {
        this.bloodTemp = bloodTemp;
    }
    
    @Override
    public void input()
    {
        System.out.println("Data has been captured"
                + "\n(Child Reptile Class)");
    }
    
    @Override
    public void output()
    {
                
        System.out.println("Data has been displayed"
                + "\n(Child reptile Class)");
    }
}
