import java.util.function.*;


public class LambdaTest{

  public static Function<Double,Double> f = x -> 3*x*x;
  public static BiFunction<Double,Double,Double> pythagoras = (x,y) -> Math.sqrt(x*x+y*y);

  public static void main(String[] args){
    System.out.println(f.apply(2.0));
    System.out.println(pythagoras.apply(2.0,2.0));
  }
}
