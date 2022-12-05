public abstract class IDBConnectionState {
    DBConnection connection;
    IDBConnectionState(DBConnection connection){
        this.connection = connection;
    }
    abstract void open();
    abstract void process();
    abstract void close();
}
