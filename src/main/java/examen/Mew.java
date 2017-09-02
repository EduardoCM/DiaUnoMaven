package examen;

@FunctionalInterface
public interface Mew {
    
    public int meow();
    public default void purr(){}
}
