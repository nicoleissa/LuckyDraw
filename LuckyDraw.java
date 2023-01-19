import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

/**
* The LuckyDraw class is a program which hands out pots of gold to designated winners.
* 
* This class contains one method and utilizes the Queue and LinkedList data structures. 
* 
* @author Nicole Issagholian
*
*/

public class LuckyDraw {
	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		int input = data.nextInt();
		
		Queue<Integer> queue = new LinkedList<>();
		
		for (int i=0; i < input; i++) {
			queue.offer(data.nextInt());
		}
		
		while (queue.size() > 1) {
			boolean pairsRemoved = false;
			
			for (int i=0; i<queue.size()-1; i++) {				
				int tickNum1 = queue.poll();
				int tickNum2 = queue.poll();
				
				if ((tickNum1 + tickNum2) % 2 == 0) {
					pairsRemoved = true;
				} 
				else {
					queue.offer(tickNum1);
					queue.offer(tickNum2);
				}
			}
			
			if (!pairsRemoved) {
				break;
			}
		}
		System.out.print(queue.size());
		
		data.close();
	}

}

