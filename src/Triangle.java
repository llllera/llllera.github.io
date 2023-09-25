public class Triangle {
    private Point p1, p2, p3;
    Triangle(Point p1, Point p2, Point p3){
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    }
    double getA(){return p1.dist(p2);}
    double getB(){return p2.dist(p3);}
    double getC(){return p1.dist(p3);}
    double p(){return getA()+getB()+getC();}
    double s(){
        double per=p()/2;
        return Math.sqrt(per*(per-getA())*(per-getB())*(per-getC()));}
}
