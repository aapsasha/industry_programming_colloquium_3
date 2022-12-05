public class ProcessState extends IDBConnectionState{
    ProcessState(DBConnection connection) {
        super(connection);
    }

    @Override
    void open() {
        //do nothing
        System.out.println("can not open because processed");
    }

    @Override
    void process() {
        //do nothing
        System.out.println("already processed");
    }

    @Override
    void close() {
        // change state to close
        System.out.println("process -> close");
        connection.changeState(new CloseState(connection));
    }
}
