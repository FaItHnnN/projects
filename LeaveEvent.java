import java.util.Optional;

class LeaveEvent extends Event {

    LeaveEvent(Customer c, double etime) {
        super(c, etime);
    }

    @Override
    protected boolean isLeaveEvent() {
        return true;
    }

    @Override
    public Pair<Optional<Event>,Shop> next(Shop shop) {
        return new Pair<>(Optional.of(this), shop);
    }
    
    @Override
    public String toString() {
        return super.toString() + super.getCustomer().map(x -> x.getId() + " leaves");
    }

}
