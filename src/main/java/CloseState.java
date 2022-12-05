public class CloseState extends IDBConnectionState{
    CloseState(DBConnection connection) {
        super(connection);
    }

    @Override
    void open() {
        //change state to open
        System.out.println("close -> open");
        connection.changeState(new OpenState(connection));
    }

    @Override
    void process() {
        //do nothing
        System.out.println("can not process because closed");
    }

    @Override
    void close() {
        //do nothing
        System.out.println("already closed");
    }
}
