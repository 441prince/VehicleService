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
    private final DatabaseHelper.Stub mBinder = new DatabaseHelper.Stub() {
        @Override
        public int add(int num1, int num2) throws RemoteException {
            // TODO Auto-generated method stub
            return (num1 + num2);
        }
    };
}