public class Photo {
    private int size;


    public Photo(boolean hasColors){
        this.size = hasColors ? 5 : 3 ;
    }

    public int getSize() {
        return size;
    }

}
