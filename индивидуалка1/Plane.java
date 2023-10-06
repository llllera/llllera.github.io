public class Plane {
    String mark;
    int vol, km;
    Plane(String mark, int vol, int km){
        this.mark=mark;
        this.vol=vol;
        this.km=km;
    }
    public String toString(){
        return "Марка: "+mark+"\nОбъем топливного бака: "+ vol+"\nМаксимальная дальность полета: "+km;
    }
    String getMark(){
        return mark;
    }
    int getVol(){
        return vol;
    }
    int getKm(){
        return km;
    }
    void setMark(String mark){
        this.mark=mark;
    }
    void setVol(int vol){
        this.vol=vol;
    }
    void setKm(int km){
        this.km=km;
    }
}
