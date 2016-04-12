package pq;

import pq.service.ProcessQueueService;

/**
 * 
 * @author NMEnego
 *
 */
// An example without dependency injection
public class ProcessQueue {
	// Internal reference to the service used by this client
	// private ProcessQueueService service;
	private ProcessQueueService service;
	// Constructor
	public ProcessQueue(ProcessQueueService service) {
		// Specify a specific implementation
		// in the constructor instead of using dependency injection
		this.service = service;
	}
	// Method within this client that uses the services
	public void next() {
		System.out.println(service.next());
	}

	public void drop(Integer id) {
		System.out.println(service.drop(id));
	}

	public void setService(ProcessQueueService service) {
		this.service = service;
	}
}
