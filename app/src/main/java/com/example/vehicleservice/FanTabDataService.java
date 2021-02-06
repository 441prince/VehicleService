package com.example.vehicleservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class FanTabDataService extends Service {
    private FanData fandata;
    private DatabaseHelper databaseHelper;

    public IBinder onBind(Intent intent) {
        // TODO Auto-generated method stub
        this.fandata = new FanData();
        this.databaseHelper = new DatabaseHelper(this);
        return mBinder;
    }

    /**
     * IAdd definition is below
     */
    private final IFanTabDataInterface.Stub mBinder = new IFanTabDataInterface.Stub() {

        @Override
        public int faceDirectionButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            fandata.setAc_Direction("To Face On");
            databaseHelper.insertFanTabData(fandata);
            return num;

        }
        public int faceDirectionButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub

            fandata.setAc_Direction("Off");
            databaseHelper.insertFanTabData(fandata);
            return num;

        }
        public int feetDirectionButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            fandata.setAc_Direction("On");
            databaseHelper.insertFanTabData(fandata);
            return num;

        }
        public int feetDirectionButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            fandata.setAc_Direction("Off");
            databaseHelper.insertFanTabData(fandata);
            return num;

        }
        public int faceFeetDirectionButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            fandata.setAc_Direction("On");
            databaseHelper.insertFanTabData(fandata);
            return num;

        }
        public int faceFeetDirectionButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            fandata.setAc_Direction("Off");
            databaseHelper.insertFanTabData(fandata);
            return num;

        }
        public int faceFeetWindShieldDirectionButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            fandata.setAc_Direction("On");
            databaseHelper.insertFanTabData(fandata);
            return num;

        }
        public int faceFeetWindShieldDirectionButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            fandata.setAc_Direction("Off");
            databaseHelper.insertFanTabData(fandata);
            return num;

        }
        public int maxAcButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            fandata.setMax_Ac("On");
            databaseHelper.insertFanTabData(fandata);
            return num;

        }
        public int maxAcButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            fandata.setMax_Ac("Off");
            databaseHelper.insertFanTabData(fandata);
            return num;

        }
        public int airCirculateButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            fandata.setAir_Circulate("On");
            databaseHelper.insertFanTabData(fandata);
            return num;

        }
        public int airCirculateButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            fandata.setAir_Circulate("Off");
            databaseHelper.insertFanTabData(fandata);
            return num;

        }

        public int bioHazardButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            fandata.setBio_Hazard("On");
            databaseHelper.insertFanTabData(fandata);
            return num;

        }
        public int bioHazardButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            fandata.setBio_Hazard("Off");
            databaseHelper.insertFanTabData(fandata);
            return num;

        }
        public int rearFanButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            fandata.setRear_Fan("On");
            databaseHelper.insertFanTabData(fandata);
            return num;

        }
        public int rearFanButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            fandata.setRear_Fan("Off");
            databaseHelper.insertFanTabData(fandata);
            return num;

        }
        public int fanSpeed(int num) throws RemoteException{
            // TODO Auto-generated method stub
            fandata.setFan_Speed(num);
            databaseHelper.insertFanTabData(fandata);
            return num;
        }

    };
}