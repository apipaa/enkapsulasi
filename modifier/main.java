
package modifier;

public class main {
     
    public static void main(String[] args){
        
        person Person = new person();
        Person.setName("tarot");
        
        Modifier modifier = new Modifier();
        modifier.setName("rita");
        
        System.out.println("person name: " + Person.getName());
        System.out.println("Modifier name : " + modifier.getName());
        
        
    }
}
