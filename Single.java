package MultiThreading;

class Single {
    public static void main(String[] args)
    {
        A ao=new A();
        B bo=new B();
        C co=new C();
        ao.hello1();
        bo.hello2();
        co.hello3();
    }
    
}

class A {
    public void hello1(){
        for(int i=1;i<=5;i++){
        System.out.println("A..."+i);
    }
 }
}

class B {
    public void hello2(){
        for(int i=6;i<=10;i++){
        System.out.println("B..."+i);
    }
}
}

class C {
    public void hello3(){
        for(int i=11;i<=15;i++){
        System.out.println("C..."+i);
    }
}
}

