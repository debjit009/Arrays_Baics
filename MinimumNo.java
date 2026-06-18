public class MinimumNo {
    public static void main(String[] args) {
        
        int numbers[]={10,21,30,45,55};

        int min = Integer.MAX_VALUE;

        for (int number : numbers) {
            if(number < min) {
                min = number;
            }
        }
        System.out.println("minimun no is:"+min);
    }    
}
