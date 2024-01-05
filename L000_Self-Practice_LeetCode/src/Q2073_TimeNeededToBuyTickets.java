import java.util.LinkedList;
import java.util.Queue;

public class Q2073_TimeNeededToBuyTickets {
  public static int timeRequiredToBuy(int[] tickets, int k) {
    int out = -1;
    // declare a queue by linkedlist
    Queue<Integer> queue = new LinkedList<>();
    for (int i = 0; i < tickets.length; i++) {
      queue.add(i);
    }  // 0, 1, 2, 3, 4, 5
    // tickets[0]
    //System.out.println(queue);
    int second = 0;
    int head = 0;
    while (!queue.isEmpty()) {
      head = queue.poll();
      System.out.println(head);
      second ++;
      // check if outstandinf ticket to buy > 0
      if (--tickets[head] > 0) {
        queue.add(head);
        continue;
      }
      if (head == k) {
        System.out.println("done");
        break;
      }
    }
    return out = second;
  }
  // ===========================================================================
  public static void main(String[] args) {
    // tickets = [noOfTicketsWantToBuy, noOfTicketsWantToBuy]
    // 1 ticket take 1 second to be sold
    // each person can only buy 1 ticket at each time
    int[] tickets1 = new int[] {2, 3, 2};
    int[] tickets2 = new int[] {5, 1, 1, 1};
    int k1 = 2;
    int k2 = 0;
    System.out.println(timeRequiredToBuy(tickets1, k1));
    System.out.println(timeRequiredToBuy(tickets2, k2));
  }
}