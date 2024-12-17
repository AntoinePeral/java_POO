public class Wilder {
    // Attribues
    private String firstName;
    private boolean aware;

    // Constructor
    public Wilder(String firstName, boolean aware){
        this.firstName = firstName;
        this.aware = aware;
    }

    // Getters 
    public String getFirstName(){
        return this.firstName;
    }

    public boolean isAware (){
        return this.aware;
    }

    // Setters
    public void setFirstName(String newName){
        this.firstName = newName;
    }

    public void setAware(boolean isAware){
        this.aware = isAware;
    }

    // Methods 
    public String whoAmI(){
        if(this.isAware()){
            return "Je m'appelle "+  this.getFirstName() + " et je suis aware";
        } else{
            return "Je m'appelle "+  this.getFirstName() + " et je ne suis pas aware";
        }
    }

    public static String sayHello(){
        return "Hello !";
    }
}
