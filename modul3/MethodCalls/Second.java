public class Second
{
    int int1Second;
    String string1Second;
    public Second(){
        int1Second = 10;
        string1Second = "I'm from Second!";
        
    }
    
    public void intAndStringFromSecond(){
        System.out.println(int1Second + string1Second);
    }
    
    public static void staticMethodSecond(){
        System.out.println("I am a static method!");
    }
}
