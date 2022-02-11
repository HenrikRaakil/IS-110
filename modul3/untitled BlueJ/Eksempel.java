public class Eksempel
{
    private AnnetEksempel temp;
    
    public Eksempel(){
        temp = new AnnetEksempel();
    }
    
    public void print(){
        System.out.print("Heisann");
    }
    
    public void callPrint(){
        print();
    }
    
    public void callMethodNumber(){
        temp.number();
    }
}
