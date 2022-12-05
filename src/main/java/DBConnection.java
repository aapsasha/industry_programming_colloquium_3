public class DBConnection {
    IDBConnectionState state;
    DBConnection(){
        state = new CloseState(this);
    }
    void changeState(IDBConnectionState state){
        this.state =state;
    }
    void open(){
        state.open();
    }
    void close(){ state.close();}
    void process(){state.process();}

}
