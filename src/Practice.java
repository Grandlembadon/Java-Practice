public class Practice {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }
    public int diff21(int n) {
        if (n > 21){
            return (21 - n) * 2;
        }else{
            return (21 - n);
        }
    }

}
