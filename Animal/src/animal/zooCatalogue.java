package animal;

import java.util.Scanner;

public class zooCatalogue 
{
    static Animal an = new Animal();
    static Bird brd = new Bird();
    static Reptile rept = new Reptile();

    public static void main(String[] args) 
    {
        menu();
    }
    
    public static void menu()
    {
        Scanner kb = new Scanner(System.in);
        int speciesChoice;
        System.out.print("Enter 1 for \"Bird\" and 2 for \"Reptile\">>>>");
        speciesChoice = kb.nextInt();
        
        switch(speciesChoice)
        {
            case 1:
                birdSubClass();
            break;
            case 2:
                reptileSubClass();
            break;
            default:
                System.out.println("Invalid choice entered! ");
                menu();
            break;
        }
    }
    
    public static void birdSubClass()
    {
        int IDTag;
        String species;
        int featherColour;
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter the ID Tag of the Bird>>>> ");
        IDTag = kb.nextInt();
        kb.nextLine();
        System.out.print("Enter the species of the Bird>>>> ");        
        species = kb.nextLine();
        System.out.println("Select the colour of the birds feather from the list below:"
                + "\n1 for \"Grey\""
                + "\n2 for \"White\""
                + "\n3 for \"Black\"");
        featherColour = kb.nextInt();
        
        an.setIDTag(IDTag);
        an.setSpecies(species);
        brd.setFeatherColour(featherColour); 
        brd.input();
        
        
        System.out.println("Animal Details: "
                + "\nID Number: " + an.getIDTag()
                + "\nSpecies: " + an.getSpecies()
                + "\nFeather Colour: " + brd.getSFeatherColour());
    }
    
    public static void reptileSubClass()
    {
        int IDTag;
        String species;
        double bloodTemperature;
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter the ID Tag of the reptile>>>> ");
        IDTag = kb.nextInt();
        kb.nextLine();
        System.out.print("Enter the species of the reptile>>>> ");
        species = kb.nextLine();
        System.out.println("Enter the blood temperature of the animal correct to 2 decimal places and with a comma>>>> ");
        bloodTemperature = kb.nextDouble();
        
        an.setIDTag(IDTag);
        an.setSpecies(species);
        rept.setBloodTemp(bloodTemperature);
        
        System.out.println("Animal Details: "
                + "\nID Number: " + an.getIDTag()
                + "\nSpecies: " + an.getSpecies()
                + "\nBlood Temperature: " + rept.getBloodTemp() + "C");
        
    }
   
}
