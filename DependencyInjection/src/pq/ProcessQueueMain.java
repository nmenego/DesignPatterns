package pq;

import pq.service.ProcessQueueService;
import pq.service.ProcessQueueServiceVersion1;
import pq.service.ProcessQueueServiceVersion2;

public class ProcessQueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProcessQueueService s1 = new ProcessQueueServiceVersion1();
		ProcessQueueService s2 = new ProcessQueueServiceVersion2();

		ProcessQueue pq = new ProcessQueue(s1);
		pq.drop(1);
		pq.drop(2);
		pq.next();
		pq.next();
		pq.next();
		pq.next();

		pq.setService(s2);
		pq.drop(1);
		pq.drop(2);
		pq.next();
		pq.next();
		pq.next();
		pq.next();

	}

}
