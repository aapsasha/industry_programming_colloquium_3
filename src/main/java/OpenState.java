public class OpenState extends IDBConnectionState {
    OpenState(DBConnection connection) {
        super(connection);
    }

    @Override
    void open() {
        //do nothing
        System.out.println("already opened");
    }

    @Override
    void process() {
        //change state to process
        System.out.println("open -> process");
        connection.changeState(new ProcessState(connection));
    }

    @Override
    void close() {
        //change state to close
        System.out.println("open -> close");
        connection.changeState(new CloseState(connection));
    }
}
