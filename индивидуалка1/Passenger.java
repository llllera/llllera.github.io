public class Passenger extends Plane {
    int kolvo;
    Passenger(String mark, int vol, int km, int kolvo){
        super(mark, vol, km);
        this.kolvo=kolvo;
    }
    void setKolvo(int kolvo){
        this.kolvo=kolvo;
    }
    int getKolvo(){
        return kolvo;
    }
    public String toString(){
        return super.toString()+"\nКол-во посадочных мест: " + kolvo;
    }
}
