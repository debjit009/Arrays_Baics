public class Name {
    public static void main(String[] args) {
        
        String names[]= {"Sam","Rohan","Sudipto","Arka","Atanu"};

        // Using for loop to print all the names 

        for(int i = 0; i < names.length; i++) {
            System.out.println("Name is:"+names[i]);



            // Using for-each loop --->

            for(String name:names){
                System.out.println("for each:"+ name);
            }
            
        }
    }
    
}
