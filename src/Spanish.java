public class Spanish extends Human {
    public Spanish(String name){
        super(name);
    }


    @Override
    public void talk(){
        System.out.println("Hola, mi amor " + name + "Gangsta.");
    }

}
