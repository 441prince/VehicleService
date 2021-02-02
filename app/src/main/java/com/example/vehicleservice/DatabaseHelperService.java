package com.example.vehicleservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.example.vehicleservice.DatabaseHelperService;

public class DatabaseHelperService extends Service {
    public IBinder onBind(Intent intent) {
        // TODO Auto-generated method stub
        return mBinder;
    }

    /**
     * IAdd definition is below
     */
    private final IDatabaseHelperInterface.Stub mBinder = new IDatabaseHelperInterface.Stub() {
        @Override
        public int autoButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            return num;

        }
        public int autoButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
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