public class StartingThreads{
    public static void main(String[] args){
        var t1 = new Thread(new Runner1());  // algoritmo de time slicing, executa um e executa o outro
        var t2 = new Thread(new Runner2());

        t1.start();// sempre que se chama o metodo start, se aloca recursos do sistema para o novo thread
        t2.start(); 
    }
}

class Runner1 implements Runnable{ // interface executavel, possibilita instanciar o corredor
    @Override
    public void run(){
        for(int i=0; i<10;++i){
            System.out.println("Runner1: "+i);
        }
        
    }
}

class Runner2 implements Runnable{
    @Override
    public void run(){
        for(int i=0; i<10;++i){
            System.out.println("Runner2: "+i);
        }
    }
}