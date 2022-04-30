/**
 * Write a description of class example here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class example
{
    // Eksempel på equals()
    @override
    public boolean equals(object obj)
    {
        if(this == obj){
            return true;
    }
        if(!(obj instanceof Animal)) {
            return false;
    }
    return animalType.equals(other.animalType);
}

    // Eksempel på hashCode()
    @Override
    public int hashCode(){
    {
        return (int) id * brand.hashCode() * color.hashCode();
    }
}
    
}
