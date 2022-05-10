public class GasStation implements ExamObserver {
    protected ExamObservable office;
    protected double gasPrice;

    public GasStation(ExamObservable office) {
        this.office = office;
        this.office.add(this);
    }

    public void changeSubscription(ExamObservable office) {
        this.office.remove(this);
        this.office = office;
        this.office.add(this);

    }

    @Override
    public void update(double gasPrice) {
        this.gasPrice = gasPrice;

    }

}
