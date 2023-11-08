interface A{
    void a();
    void b();
    void c();
    void d();
}
abstract class B implements A{
    public void c(){
        System.out.println("I am C");
    }
}
class C extends B{
    public void a(){
        System.out.println("I am a");
    }

    @Override
    public void b() {
        System.out.println("I am b");
    }
    public void d(){
        System.out.println("I am d");
    }
}
class inter{
    public static void main(String[] args) {
        A a=new C();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}