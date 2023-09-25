public class Point {
    private int x, y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    int getX(){return x;}
    int getY(){return y;}
    void setX(int x){this.x=x;}
    void setY(int y){this.y=y;}

    double dist(int x, int y){
        int dx=this.x-x;
        int dy=this.y-y;
        return Math.sqrt(dx*dx+dy*dy);
    }
    double dist(Point p){
        return dist(p.getX(), p.getY());
    }
    int chet() {
        if (x > 0 && y > 0) return 1;
        if (x < 0 && y > 0) return 2;
        if (x < 0 && y < 0) return 3;
        if (x > 0 && y < 0) return 4;
        return 0;
    }
}
