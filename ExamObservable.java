public interface ExamObservable {

	public void add(ExamObserver station);
	public void remove(ExamObserver station);
	public void pushUpdate();
	
}
