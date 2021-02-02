package com.example.vehicleservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class DatabaseHelperService extends Service {

    //private DatabaseServer databaseServer;
    //private DatabaseHelperServer databaseHelperServer;
    private DatabaseHelperServer2 databaseHelperServer2;
    public String auto ="Off";

    public IBinder onBind(Intent intent) {
        // TODO Auto-generated method stub
        //this.databaseServer = new DatabaseServer();
        //this.databaseHelperServer = new DatabaseHelperServer(this);
        this.databaseHelperServer2 = new DatabaseHelperServer2(this);
        return mBinder;
    }

    /**
     * IAdd definition is below
     */
    private final IDatabaseHelperInterface.Stub mBinder = new IDatabaseHelperInterface.Stub() {

        @Override
        public int autoButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            //databaseServer.setAutoButtonOn("On");
            auto="On";
            databaseHelperServer2.insertAutoData(auto);

            return num;

        }
        public int autoButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            auto="On";
            databaseHelperServer2.insertAutoData(auto);
            return num;

        }
        public int acButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            return num;

        }
        public int acButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            return num;

        }
        public int frontDefrostButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            return num;

        }
        public int frontDefrostButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            return num;

        }

        public int rearDefrostButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            return num;

        }
        public int rearDefrostButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            return num;

        }
        public int userButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            return num;

        }
        public int userButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            return num;

        }

    };
}