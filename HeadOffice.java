
import java.util.ArrayList;

public class HeadOffice implements ExamObservable {
    private double gasPrice;
    private ArrayList<ExamObserver> stations = new ArrayList<ExamObserver>();

    @Override
    public void add(ExamObserver station) {
        stations.add(station);

    }

    @Override
    public void remove(ExamObserver station) {
        stations.remove(station);

    }

    @Override
    public void pushUpdate() {
        for (ExamObserver observer : stations) {
            observer.update(gasPrice);
        }

    }

    public void setPrice(double gasPrice) {
        this.gasPrice = gasPrice;
        pushUpdate();

    }

    public double getPrice() {
        return gasPrice;

    }
}
