class Avto {
    String marka, number, vin;
    int year, price, km;
    double vol;
    Avto(String marka, String number, String vin, int year, double vol, int price, int km){
        this.marka=marka;
        this.number=number;
        this.vin=vin;
        this.year=year;
        this.vol=vol;
        this.price=price;
        this.km=km;
    }
    public String toString(){
        return "Marka:" + marka+"\nNumber:"+number+"\nVin"+vin+"\nYear"+year+"\nVol"+vol+"\nPrice"+price+"\nProbeg"+km;
    }
    String getNumber(){
        return number;
    }
    String getVin(){
        return vin;
    }
    int getYear(){
        return year;
    }
    double getVol(){
        return vol;
    }
   int getPrice(){
        return price;
    }
    int getKm(){
        return km;
    }
    String getMarka(){
        return marka;
    }
    void setNumber(String number){
        this.number=number;
    }
    void setVin(String vin){
        this.vin=vin;
    }
    void setYear(int year){
        this.year=year;
    }
    void setVol(double vol){
        this.vol=vol;
    }
    void setPrice(int price){
        this.price=price;
    }
    void setKm(int km){
        this.km=km;
    }
    void setMarka(String marka){
        this.marka=marka;
    }
}

