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
    private final DatabaseHelper2.Stub mBinder = new DatabaseHelper2.Stub() {
        @Override
        public int AutoButton(int num) throws RemoteException {
            // TODO Auto-generated method stub
            return num;

        }
        public int AutoButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            return num;

        }
        public int AcButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            return num;

        }
        public int AcButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            return num;

        }
        public int DefrostButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            return num;

        }
        public int DefrostButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            return num;

        }

        public int RearDefrostButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            return num;

        }
        public int RearDefrostButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            return num;

        }
        public int UserButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            return num;

        }
        public int UserButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            return num;

        }

    };
}