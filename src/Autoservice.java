public class Autoservice {
    public String modify (String marka){
        marka = marka.replace('a', 'o');
        marka = marka.replace('A', 'O');
        marka = marka.replace('I', 'E');
        marka = marka.replace('i', 'e');

        marka = marka.toUpperCase();
        return marka;
    }
}
