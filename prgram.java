abstract class A{
abstract void Shape();
}
class Cuboid extends A{
    void Shape(){
        System.out.println("This is a Cuboid");
    }
}
class Prisim extends A{
    void Shape(){
        System.out.println("This is a Prisim");
    }
}
class Sphere extends A{
    void Shape(){
        System.out.println("This is a Sphere");
    }
}
class program{
    public static void main(String[] args) {
        A o1=new Cuboid();
        o1.Shape();
        A o2=new Sphere();
        o2.Shape();
        A o3=new Prisim();
        o3.Shape();
    }

}
