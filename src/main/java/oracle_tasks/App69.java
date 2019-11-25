package oracle_tasks;

public class App69 {
  static int count = 0;
  int i = 0;

  public void changeCount(){
      while (i < 5) {
          i++;
          count++;
      }
  }

    public static void main(String[] args) {
        App69 ap = new App69();
        App69 ap2 = new App69();
        ap.changeCount();
        ap2.changeCount();
        System.out.print(ap.count + " : " + ap2.count);
    }
}
