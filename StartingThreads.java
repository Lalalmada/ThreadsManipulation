class Runner1 implements Runnable{
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

public class StartingThreads{
    public static void main(String[] args){
        var t1 = new Thread(new Runner1());
        var t2 = new Thread(new Runner2());

        t1.start();// sempre que se chama o metodo start, se aloca recursos do sistema para o novo thread
        t2.start(); 
    }
}