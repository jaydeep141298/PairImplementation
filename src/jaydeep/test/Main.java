package jaydeep.test;

final class Pair{
     private int a;
     private int b;
     private boolean isASet= false;
     private boolean isBSet = false;
    Pair(){

    }
    Pair(int a,int b){
        this.isASet = true;
        this.a = a;
        this.b = b;
    }
    public int first(){
        return this.a;
    }
    public int second(){
        return this.b;
    }
    public void first(int a){
        if(this.isASet == false){
            this.isASet = true;
            this.a = a;
        }

    }
    public void second(int b){
        if(this.isBSet == false){
            this.isBSet = true;
            this.b = b;
        }
    }

    @Override
    public boolean equals(Object obj) {

         Class v= obj.getClass();
         Class w = this.getClass();
         if(v != w){
             System.out.println("Patre Randi");
             return false;
         }
        Pair pp = (Pair)obj;
        System.out.println(obj.getClass());
        if((this.a == pp.a)&&(this.b == pp.b)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "(" + this.a + ", " + this.b + ")";
    }

    @Override
    public int hashCode() {
        return (31 * this.a + this.b);
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Pair p1  = new Pair(2,3);
        Pair p5 = new Pair();
        System.out.println("The Value of p5 = " + p5);
        p5.first(7);
        p5.second(9);
        System.out.println("The Value of p5 = " + p5);
        System.out.println(p1.first());
        System.out.println(p1.second());
        Pair p2 = new Pair(5,4);
        Pair p3 = new Pair(2,3);
        String str = new String("randi");
        System.out.println(p1.equals(str));
        System.out.println(p1.equals(p3));
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
