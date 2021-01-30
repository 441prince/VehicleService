package com.example.vehicleservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.Toast;

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
        public int add(int num1,int num2) throws RemoteException {
            // TODO Auto-generated method stub

            return (num1+num2);
        }
    };
}