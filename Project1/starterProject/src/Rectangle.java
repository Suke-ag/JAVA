public class Rectangle {
    private int length;
    private int breadth;
    int getarea(){
        return this.length*this.breadth;
    }
    void calculatePerimeter() {
       
        System.out.println("Perimeter of Rectangle is" + 2*(this.length + this.breadth));
    }
    void setlen(int len){
        this.length = len;
    }
    void setbred(int bred){
        this.breadth = bred;
    }
    public static void main(String[] args){
        Rectangle obj = new Rectangle();
        obj.setlen(20);
        obj.setbred(30);
        System.out.println("Area of Rectangle is "+obj.getarea());
        obj.calculatePerimeter();
        
    }
}
