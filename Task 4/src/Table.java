public class Table {
    Boolean available;

    public Boolean isAvailable() {
        return available;
    }

    public void markAvailable(Boolean available) {
        this.available = available;
    }
    public void markUnavailable(Boolean available) {
        this.available = false;
    }
}
