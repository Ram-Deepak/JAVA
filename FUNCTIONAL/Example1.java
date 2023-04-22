@FunctionalInterface
interface Drawable{
    void draw();
}

class Example1{
    public static void main(String[] args){
        Drawable d1 = ()->{System.out.println("Draw circle");};
        d1.draw();
    }
}