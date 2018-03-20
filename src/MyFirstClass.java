public class MyFirstClass {

    public static void main(String[] args){
        //sout atspausdinti
    System.out.println("Hello world");
    //kuriamas klases objektas kad pasiekti ne statini metoda
        //sukurtas objektas
        int a=10;
        MyFirstClass myFirstClass = new MyFirstClass();

        //nestatinis pasiekiam metoda per objekta
        myFirstClass.myNotStaticMethod(a);

        //kvieciame per varda toje pacioje klaseje
        myStaticMethod();

        //kintaimieji

        float b =4.6f;
        double c=2.4;

        boolean d=true;  //nepriskyrus default faulse

        char e ='a';

        String f = "This is string!!!"; //string ne kaip tipas kaip klase
    }

    //nestatinis objektas
    private void myNotStaticMethod(int numb){
        System.out.println("Jusu skaicius "+numb);
    }


    //statinis objektas
    private static void myStaticMethod(){
        System.out.println("Cia yra statinis metodas");
    }
}
