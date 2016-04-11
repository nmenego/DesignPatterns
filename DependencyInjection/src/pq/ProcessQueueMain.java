package pq;

public class ProcessQueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProcessQueue pq = new ProcessQueue();
		pq.drop(1);
		pq.drop(2);
		pq.next();
		pq.next();
		pq.next();
		pq.next();
	}

}
