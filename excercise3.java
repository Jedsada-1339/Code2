public class excercise3 {
    public static void main(String[] args) {
        if(args.length ==2 ){
            float float1 = Float.parseFloat(args[0]);
            float float2 = Float.parseFloat(args[1]);
            System.err.println(float1+" + "+float2 +" = "+(float1+float2));
        }
        else{
            System.err.println("Usage:java Adder <num1> <num2>");
        }
    }
    
}
