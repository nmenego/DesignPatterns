package pq.service;

/**
 * Naive design
 * @author NMEnego
 *
 */
public class ProcessQueueServiceVersion1 {

	public String next() {
		return "next in line...";
	}
	public String drop(Integer id) {
		return "dropped: " + id;
	}
}
