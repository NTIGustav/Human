public class English extends Human {
    public English(String name){
        super(name);
    }


    @Override
    public void talk(){
        System.out.println("Sup, my name is " + name + "Blood.");
    }

}