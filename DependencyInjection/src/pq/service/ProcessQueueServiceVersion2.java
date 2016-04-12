package pq.service;

/**
 * Naive design
 * 
 * @author NMEnego
 *
 */
public class ProcessQueueServiceVersion2 implements ProcessQueueService {

	public String next() {
		return "v2: next in line...";
	}
	public String drop(Integer id) {
		return "v2: dropped: " + id;
	}
}
