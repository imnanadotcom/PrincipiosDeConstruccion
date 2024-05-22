public interface FizzBuzz {
    void print( int from, int to );
}

class ConsoleBasedFizzBuzz implements FizzBuzz {

    @Override
    public void print(int from, int to) {
        for ( int i = from; i <= to; i++ ){
            if ( i % 5 == 0 && i % 3 == 0) {
                System.out.println( "FizzBuzz" );

            } else if ( i % 5 == 0 ) {
                System.out.println( "Buzz" );

            } else if ( i % 3 == 0 ) {
                System.out.println( "Fizz" );
                
            } else {
                System.out.println( i );

            }
        }
        
    }
    
}

class Main {
    public static void main( String[] args ) {

        FizzBuzz prueba = new ConsoleBasedFizzBuzz();
        prueba.print(1, 100);

    }
}