import java.util.*;

public class Main {
  public static void main(String[] a) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> students = new ArrayList<>();
    while (true) {
      System.out.println("1.Add 2.View 3.Exit");
      int c = sc.nextInt(); sc.nextLine();
      if (c == 1) { System.out.print("Name: "); students.add(sc.nextLine()); }
      else if (c == 2) { for (String s : students) System.out.println(s); }
      else break;
    }
  }
}
