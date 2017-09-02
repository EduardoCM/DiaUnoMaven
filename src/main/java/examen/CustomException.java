package examen;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class CustomException extends IOException implements AutoCloseable {

    @Override
    public void close() throws Exception {
        throw new CustomException();
     }
    
    public static void main(String[] args) throws Exception {
        
        Queue<Integer> q = new LinkedList<>();
        q.add(new Integer(6));
        q.add(new Integer(6));
        System.out.println(q.size() + " " + q.contains(6L));
        
        
    }
}
