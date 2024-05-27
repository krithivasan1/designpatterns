package com.example.designpatterns.Singleton.assignment3;


import java.util.ArrayList;
import java.util.List;

public class ConnectionPoolImpl implements ConnectionPool {
    private static ConnectionPoolImpl instance =null;
    private static List<DatabaseConnection> databaseConnectionList = null;
    private int maxConnections;

    private ConnectionPoolImpl(int maxConnections){
        this.maxConnections = maxConnections;
    }


    public static ConnectionPoolImpl getInstance(int maxConnections){
        if(instance==null){
            synchronized(ConnectionPoolImpl.class)
            {
                if(instance==null){
                    instance = new ConnectionPoolImpl(maxConnections);
                    databaseConnectionList = new ArrayList<DatabaseConnection>();
                }
            }
        }

        return instance;
    }
    @Override
    public void initializePool() {
        for(int i=0;i<maxConnections;i++){
            databaseConnectionList.add(new DatabaseConnection("Connection Number:"+i, true));

        }

    }

    @Override
    public DatabaseConnection getConnection() {
        for(int i=0;i<maxConnections;i++){
            DatabaseConnection currentConnectionItem = databaseConnectionList.get(i);
            if( currentConnectionItem.isAvailable()){
                currentConnectionItem.setAvailable(false);
                return currentConnectionItem;
            }
        }
        return null;
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {
        connection.setAvailable(true);

    }

    @Override
    public int getAvailableConnectionsCount() {
        return (int)databaseConnectionList.stream().filter(c-> c.isAvailable()==true).count();
        // return 0;
    }

    @Override
    public int getTotalConnectionsCount() {
        return maxConnections;
    }

    public void resetInstance(){
        instance =null;
    }
}
