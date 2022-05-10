import java.util.ArrayList;

public class localOffice implements  ExamObservable, ExamObserver {

    protected ExamObservable office;
    protected double gasPrice;
    private ArrayList<ExamObserver> stations = new ArrayList<ExamObserver>();

    public localOffice(ExamObservable office) {
        this.office = office;
        this.office.add(this);
    }
    @Override
    public void pushUpdate() {
        for (ExamObserver observer : stations) {
            observer.update(gasPrice);
        }

    }
    @Override
    public void remove(ExamObserver station) {
        stations.remove(station);
    }

    @Override
    public void update(double gasPrice) {
        this.gasPrice = gasPrice;

    }

    @Override
    public void add(ExamObserver station) {
        stations.add(station);
        
    }

    public void setPrice(double gasPrice) {
        this.gasPrice = gasPrice;
        pushUpdate();

    }

}
