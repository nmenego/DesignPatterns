package pq.service;

/**
 * 
 * @author NMEnego
 *
 */
public interface ProcessQueueService {

	public String next();
	public String drop(Integer id);
}
