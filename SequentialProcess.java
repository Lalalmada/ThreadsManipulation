public class SequentialProcess{

    public static void main(String[] args){
        var runner1 = new Runner1();
        var runner2 = new Runner2();

        runner1.execute();
        runner2.execute();// algoritmo time slicing, executa um, executa outro
        
    }
}

class Runner1{
    public void execute(){
        for(int i=0; i<10;++i){
            System.out.println("Runner1: "+i);
        }
    }
}

class Runner2{
    public void execute(){
        for(int i=0; i<10;++i){
            System.out.println("Runner2: "+i);
        }
    }
}
