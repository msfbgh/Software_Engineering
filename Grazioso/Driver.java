import java.util.ArrayList;
import java.util.Scanner;

public class Driver
{
   private static ArrayList<Dog> dogList = new ArrayList<Dog>();
   private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
   
   // Add a loop that displays the menu, accepts the users input
   // and takes the appropriate action.
// For the project submission you must also include input validation
   // and appropriate feedback to the user.
   //method to display menu and get choice form user 
   //execute appropriate function
   
   // This method prints the menu options
   public static void displayMenu() 
   {
       System.out.println("\n");
       System.out.println("\t\t\t\tRescue Animal System Menu");
       System.out.println("[1] Intake a new dog");
       System.out.println("[2] Intake a new monkey");
       System.out.println("[3] Reserve an animal");
       System.out.println("[4] Print a list of all dogs");
       System.out.println("[5] Print a list of all monkeys");
       System.out.println("[6] Print a list of all animals that are not reserved");
       System.out.println("[q] Quit application");
       System.out.println();
       System.out.println("Enter a menu selection");
       Scanner sc=new Scanner(System.in);
       char input=sc.nextLine().charAt(0);
       switch(input)
       {
        case '1':
            intakeNewDog(sc);
            break;
        case '2':
            intakeNewMonkey(sc);
            break;
        case '3':
            reserveAnimal(sc);
            break;
        case '4':
            printAnimals('4');
            break;
        case '5':
            printAnimals('5');
            break;
        case '6':
            printAnimals('6');
        case 'q':
         System.exit(0);
        default:
         System.out.println("Select an existing menu");
         displayMenu(); 
       }
   }
   //initialize array list(dogList) 
// Adds dogs to a list for testing
   public static void initializeDogList() 
   {
       Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
       Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
       Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");
       dogList.add(dog1);
       dogList.add(dog2);
       dogList.add(dog3);
   }
   // Adds monkeys to a list for testing
   //Initialize array list(monkeyList)
   public static void initializeMonkeyList() 
   {
       Monkey monkey1 = new Monkey("Al", "Guenon", "3.4", "5.3", "20.6", "female", "3", "14.4", "07-01-2019", "United States", "in service", false, "United States");
       Monkey monkey2 = new Monkey("Be", "Marmoset", "6.5", "4.5", "18.7", "male", "2", "13.5", "12-05-2008", "United States", "Phase I", true, "United States");
       Monkey monkey3 = new Monkey("Cole", "Capuchin", "3.6", "3.8", "5.4", "male", "1", "15.6", "12-10-2014", "United States", "intake", true, "United States");
       monkeyList.add(monkey1);
       monkeyList.add(monkey2);
       monkeyList.add(monkey3);
   }
   
// Complete the intakeNewDog method
   // The input validation to check that the dog is not already in the list
   //get input from the user
   //validate the input
   //and initialize to the dogList
   public static void intakeNewDog(Scanner scanner)
   {
       System.out.println("What is the dog's name?");
       String name = scanner.nextLine();
       for(Dog dog: dogList) 
       {
           if(dog.getName().equalsIgnoreCase(name))
           {
               System.out.println("\n\nThis dog is already in our system\n\n");
               displayMenu();
           }
       }
       System.out.println("What is the dog's breed?");
       String breed = scanner.nextLine();
       System.out.println("What is the dog's gender?");
       String gender = scanner.nextLine();
       System.out.println("What is the dog's age?");
       String age = scanner.nextLine();
       System.out.println("What is the dog's weight?");
       String weight = scanner.nextLine();
       System.out.println("What is the dog's acquisition date?");
       String acqDate = scanner.nextLine();
       System.out.println("What is the dog's acquisition country?");
       String acqCountry = scanner.nextLine();
       System.out.println("What is the dog's training status?");
       String ts = scanner.nextLine();
       System.out.println("Is the dog reserved?");
       boolean res = scanner.nextBoolean();
       scanner.nextLine();
       System.out.println("What is the dog's in Service Country?");
       String isc = scanner.nextLine();
    // Add the code to instantiate a new dog and add it to the appropriate list
       Dog newdog=new Dog(name,breed,gender,age,weight,acqDate,acqCountry,ts,res,isc);
       dogList.add(newdog);
       displayMenu();
   }
   // Complete intakeNewMonkey
  	//Instantiate and add the new monkey to the appropriate list
          // For the project submission you must also  validate the input
  	// to make sure the monkey doesn't already exist and the species type is allowed

   //get input from the user
   //and initialize to the monkeyList
   public static void intakeNewMonkey(Scanner scanner) 
   {
       System.out.println("What is the monkey's name?");
       String name = scanner.nextLine();
       for(Monkey monkey: monkeyList) 
       {
           if(monkey.getName().equalsIgnoreCase(name)) 
           {
               System.out.println("\n\nThis monkey is already in our system\n\n");
               displayMenu();
           }
       }
       System.out.println("What is the monkey's species?");
       String species = scanner.nextLine();
       if(!(species.equalsIgnoreCase("Capuchin")) && !(species.equalsIgnoreCase("Guenon")) && !(species.equalsIgnoreCase("Macaque")) && !(species.equalsIgnoreCase("Marmoset")) && !(species.equalsIgnoreCase("Squirrel Monkey")) && !(species.equalsIgnoreCase("Tamarin"))){
           System.out.println("\n\nThis monkey's species is not allowed\n\n");
           return;
       }
       System.out.println("What is the monkey's tail length?");
       String tailLength = scanner.nextLine();
       System.out.println("What is the monkey's height?");
       String height = scanner.nextLine();
       //get body length
       System.out.println("What is the monkey's body length?");
       //get it as string
       String bodyLength = scanner.nextLine();
       //get gender
       System.out.println("What is the monkey's gender?");
       String gender = scanner.nextLine();
       //get age
       System.out.println("What is the monkey's age?");
       //get it as string
       String age = scanner.nextLine();
       //get weight
       System.out.println("What is the monkey's weight?");
       String weight = scanner.nextLine();
       //get date
       System.out.println("What is the monkey's acquisition date?");
       String acqDate = scanner.nextLine();
       //get country
       System.out.println("What is the monkey's acquisition country?");
       String acqCountry = scanner.nextLine();
       //get status
       System.out.println("What is the monkey's training status?");
       String ts = scanner.nextLine();
       //get reservation status
       System.out.println("Is the monkey reserved?");
       boolean res = scanner.nextBoolean();scanner.nextLine();
       //get service country
       System.out.println("What is the monkey's in Service Country?");
       String isc = scanner.nextLine();
       Monkey newmonkey=new Monkey(name,species,tailLength,height,bodyLength,gender,age,weight,acqDate,acqCountry,ts,res,isc);
       monkeyList.add(newmonkey);
       displayMenu();
   }
// Complete reserveAnimal
   // You will need to find the animal by animal type and in service country
   //get input from the user
   //check the availability and set it as reserved
   public static void reserveAnimal(Scanner scanner) 
   {
       System.out.println("Enter animal type");
       String animalTyp=scanner.next();
       System.out.println("Enter In Service Country");
       String isc=scanner.next();
       if(animalTyp.equalsIgnoreCase("Dog"))
       {
        for(int i=0;i<dogList.size();i++)
        {
         if(dogList.get(i).getInServiceLocation().equals(isc))
         {
          dogList.get(i).setReserved(true);
          break;
         }
        }
        displayMenu();
       }
       else if(animalTyp.equalsIgnoreCase("Monkey"))
       {
        for(int i=0;i<monkeyList.size();i++)
        {
         if(monkeyList.get(i).getInServiceLocation().equals(isc))
         {
          monkeyList.get(i).setReserved(true);
          break;
         }
        }
        displayMenu();
       }
       else
       {
        System.out.println("Given animal type is not exist");
        System.out.println("Existing animal type are Dog and Monkey");
        displayMenu();
       }
   }
// Complete printAnimals
   // Include the animal name, status, acquisition country and if the animal is reserved.
// Remember that this method connects to three different menu items.
   // The printAnimals() method has three different outputs
   // based on the listType parameter
   // dog - prints the list of dogs
   // monkey - prints the list of monkeys
   // available - prints a combined list of all animals that are
   // fully trained ("in service") but not reserved 
// Remember that you only have to fully implement ONE of these lists. 
// The other lists can have a print statement saying "This option needs to be implemented".

   //print list of available animals
   public static void printAnimals(char choice) 
   {
       if(choice=='4')
       {
        System.out.println("Name\tTraining_Status In_Service_Location Is_Reserved");
        for(int i=0;i<dogList.size();i++)
        {
         System.out.println(dogList.get(i).getName()+"\t"+dogList.get(i).getTrainingStatus()+"\t\t"+dogList.get(i).getInServiceLocation()+"\t "+dogList.get(i).getReserved());
        }
        displayMenu();
       }
       else if(choice=='5')
       {
        System.out.println("Name\tTraining_Status In_Service_Location Is_Reserved");
        for(int i=0;i<monkeyList.size();i++)
        {
         System.out.println(monkeyList.get(i).getName()+"\t"+monkeyList.get(i).getTrainingStatus()+"\t\t"+monkeyList.get(i).getInServiceLocation()+"\t "+monkeyList.get(i).getReserved());
        }
        displayMenu();
       }
       else if(choice=='6')
       {
        System.out.println("Name\tTraining_Status In_Service_Location Is_Reserved");
        for(int i=0;i<dogList.size();i++)
        {
         if(!dogList.get(i).getInServiceLocation().isEmpty()&&!dogList.get(i).getReserved())
         {
          System.out.println(dogList.get(i).getName()+"\t"+dogList.get(i).getTrainingStatus()+"\t\t"+dogList.get(i).getInServiceLocation()+"\t "+dogList.get(i).getReserved());
         }
        }
        for(int i=0;i<monkeyList.size();i++)
        {
         if(!monkeyList.get(i).getInServiceLocation().isEmpty()&&!monkeyList.get(i).getReserved())
         {
          System.out.println(monkeyList.get(i).getName()+"\t"+monkeyList.get(i).getTrainingStatus()+"\t\t"+monkeyList.get(i).getInServiceLocation()+"\t "+monkeyList.get(i).getReserved());
         }
        }
        displayMenu();
       }
   }
   //main method to initialize the class members
   public static void main(String[] args) 
   {
       initializeDogList();
       initializeMonkeyList();
       displayMenu();
   }
}
//create class 
class Monkey extends RescueAnimal 
{
   public String bodyLength;
   public String tailLength;
   public String height;
   public String species;
   //constructor to initialize the monkey specifications
   public Monkey(String name,String species, String tailLength,String height,String bodyLength,String gender,String age,String weight,String acqDate,String acqCountry,String ts,boolean res,String isc)
   {
    setName(name);
    setSpecies(species);
    setTailLength(tailLength);
    setHeight(height);
    setBodyLength(bodyLength);
    setGender(gender);
    setAge(age);
    setWeight(weight);
    setAcquisitionDate(acqDate);
    setAcquisitionLocation(acqCountry);
    setTrainingStatus(ts);
    setReserved(res);
    setInServiceCountry(isc);
   }
   //getters 
public String getBodyLength() 
{
 return bodyLength;
}
public String getTailLength() 
{
 return tailLength;
}
public String getHeight()
{
 return height;
}
public String getSpecies()
{
 return species;
}
//setters 
public void setBodyLength(String bodyLength) 
{
 this.bodyLength = bodyLength;
}
public void setTailLength(String tailLength)
{
 this.tailLength = tailLength;
}
public void setHeight(String height) 
{
 this.height = height;
}
public void setSpecies(String species) 
{
 this.species = species;
}
}
//create class
class RescueAnimal 
{
//varibales
private String name;
private String animalType;
private String gender;
private String age;
private String weight;
private String acquisitionDate;
private String acquisitionCountry;
private String trainingStatus;
private boolean reserved;
private String inServiceCountry;
//default constructor
public RescueAnimal() 
{
}
//getters and setters
public String getName() 
{
 return name;
}
public void setName(String name) 
{
 this.name = name;
}
public String getAnimalType() 
{
 return animalType;
}
public void setAnimalType(String animalType) 
{
 this.animalType = animalType;
}
public String getGender() 
{
 return gender;
}
public void setGender(String gender) 
{
 this.gender = gender;
}
public String getAge() 
{
 return age;
}
public void setAge(String age) 
{
 this.age = age;
}
public String getWeight() 
{
 return weight;
}
public void setWeight(String weight) 
{
 this.weight = weight;
}
public String getAcquisitionDate() 
{
 return acquisitionDate;
}
public void setAcquisitionDate(String acquisitionDate) 
{
 this.acquisitionDate = acquisitionDate;
}
public String getAcquisitionLocation() 
{
 return acquisitionCountry;
}
public void setAcquisitionLocation(String acquisitionCountry) 
{
 this.acquisitionCountry = acquisitionCountry;
}
public boolean getReserved() 
{
 return reserved;
}
public void setReserved(boolean reserved)
{
 this.reserved = reserved;
}
public String getInServiceLocation() 
{
 return inServiceCountry;
}
public void setInServiceCountry(String inServiceCountry) 
{
 this.inServiceCountry = inServiceCountry;
}
public String getTrainingStatus() 
{
 return trainingStatus;
}
public void setTrainingStatus(String trainingStatus) 
{
 this.trainingStatus = trainingStatus;
}
}
//create class
class Dog extends RescueAnimal 
{
private String breed;
//initialize the variables with values
public Dog(String name, String breed, String gender, String age,String weight, String acquisitionDate, String acquisitionCountry,String trainingStatus, boolean reserved, String inServiceCountry) 
{
 setName(name);
 setBreed(breed);
 setGender(gender);
 setAge(age);
 setWeight(weight);
 setAcquisitionDate(acquisitionDate);
 setAcquisitionLocation(acquisitionCountry);
 setTrainingStatus(trainingStatus);
 setReserved(reserved);
 setInServiceCountry(inServiceCountry);
}
public String getBreed() 
{
 return breed;
}
public void setBreed(String dogBreed) 
{
 breed = dogBreed;
}
}
