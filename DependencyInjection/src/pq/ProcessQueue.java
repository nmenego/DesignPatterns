package pq;

import pq.service.ProcessQueueService;

/**
 * 
 * @author NMEnego
 *
 */
//An example without dependency injection
public class ProcessQueue {
	// Internal reference to the service used by this client
	private ProcessQueueService service;
	// Constructor
	public ProcessQueue() {
		// Specify a specific implementation 
		//in the constructor instead of using dependency injection
		this.service = new ProcessQueueServiceVersion1();
	}
	// Method within this client that uses the services
	public String next() {
		return service.getNext();
	}
	
	public String drop(Integer id) {
		return service.drop(id);
	}
}

