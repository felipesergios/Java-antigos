public class NumerosPrimos {

 

        public static void main(String[] args) {

              

                int limit = 1000;

              



              

                for(int i=1; i < limit; i++){

                       

                        boolean ehPrimo = true;

                      

                        for(int j=2; j < i ; j++){

                              

                                if(i % j == 0){

                                        ehPrimo = false;

                                        break;

                                }

                        }

 

if(ehPrimo)

  System.out.print(i + " ");

                }

        }

}
