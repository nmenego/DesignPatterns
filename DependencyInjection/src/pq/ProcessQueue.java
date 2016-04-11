package pq;

import pq.service.ProcessQueueServiceVersion1;

/**
 * 
 * @author NMEnego
 *
 */
//An example without dependency injection
public class ProcessQueue {
	// Internal reference to the service used by this client
//	private ProcessQueueService service;
	private ProcessQueueServiceVersion1 service;
	// Constructor
	public ProcessQueue() {
		// Specify a specific implementation 
		//in the constructor instead of using dependency injection
		this.service = new ProcessQueueServiceVersion1();
	}
	// Method within this client that uses the services
	public void next() {
		System.out.println(service.next());
	}
	
	public void drop(Integer id) {
		System.out.println(service.drop(id));
	}
}

