public class Main {
    public static void main(String[] args) {
    Fighter f1=new Fighter("man1",10,120,95,13,14,12,4);
    Fighter f2=new Fighter("man2",12,100,90,9,17,10,7);

    Match m1 = new Match(f1,f2,80,100);

    m1.run();

    }
}