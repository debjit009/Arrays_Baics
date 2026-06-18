public class MaximumNo {
    public static void main(String[] args) {
        int numbers[]={10,21,3,45,90,27,25,};

        int max =Integer.MIN_VALUE;

        for (int number : numbers) {
            if(number > max){
                max = number;
            }
            
        }
        System.out.println("Max is:"+max);


    }
    
}
