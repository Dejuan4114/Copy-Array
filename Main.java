class Main {
  public static void main(String[]                                         args) {

      String[] listOne = {"Derrick", "Alex", "Henry", "Sarrah", "Marriah", "Junior", "Layla", "Solomon", "Owen", "Jacob" };

      String[] listTwo = new String                                        [10];

      for( int i = 0; i < 9; i++){
        listTwo[i] = listOne[i];
        System.out.print("An award was given to " + listTwo[i]);
      }

    }
}