

public class ExtendedEuclidian{

  public static int euclidianAlgorithm(int a, int b){
      if(b==0){
        return a;
      }else{
        return euclidianAlgorithm(b,a%b);
      }
  }



  public static void main(String[] args){
    System.out.println(euclidianAlgorithm(99,78));
  }
}
