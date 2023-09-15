package com.example.vehicleservice;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

public class MainDataService extends Service {

    private MainData mainData;
    private DatabaseHelper databaseHelper;

    public MainDataService() {
        Log.d("VS MainDataService"," Constructor");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("VS MainDataService"," onCreate");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("VS MainDataService"," onDestroy");
    }

    public IBinder onBind(Intent intent) {
        // TODO Auto-generated method stub
        Log.d("VS MainDataService", "OnBind Called");
        this.mainData = new MainData();
        this.databaseHelper = new DatabaseHelper(this);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                Intent intent1 = new Intent();
                intent1.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
                intent1.setAction("com.example.vehicleservice");
                intent1.putExtra("data", "Engine Full Charged");
                sendBroadcast(intent1);
            }
        }, 25000);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                Intent intent1 = new Intent();
                intent1.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
                intent1.setAction("com.example.vehicleservice");
                intent1.putExtra("data", "Hello User! Today's Climate is Under Your Control");
                sendBroadcast(intent1);
            }
        }, 5000);

        //return new Test(this);
        return mBinder;

    }

    /**
     * IAdd definition is below
     */
    private final IMainDataInterface.Stub mBinder = new IMainDataInterface.Stub() {


        @Override
        public int autoButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            mainData.setAuto("On");
            databaseHelper.insertMainData(mainData);

            return num;

        }
        public int autoButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            mainData.setAuto("Off");
            databaseHelper.insertMainData(mainData);
            return num;

        }
        public int acButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            mainData.setAc("On");
            databaseHelper.insertMainData(mainData);
            return num;

        }
        public int acButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            mainData.setAc("Off");
            databaseHelper.insertMainData(mainData);
            return num;

        }
        public int left_seatButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            mainData.setLeft_seat("On");
            databaseHelper.insertMainData(mainData);
            return num;

        }
        public int left_seatButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            mainData.setLeft_seat("Off");
            databaseHelper.insertMainData(mainData);
            return num;

        }
        public int fanButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            mainData.setFan("On");
            databaseHelper.insertMainData(mainData);
            return num;

        }
        public int fanButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            mainData.setFan("Off");
            databaseHelper.insertMainData(mainData);
            return num;

        }
        public int right_seatButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            mainData.setRight_seat("On");
            databaseHelper.insertMainData(mainData);
            return num;

        }
        public int right_seatButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            mainData.setRight_seat("Off");
            databaseHelper.insertMainData(mainData);
            return num;

        }
        public int frontDefrostButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            mainData.setFront_defrost("On");
            databaseHelper.insertMainData(mainData);
            return num;

        }
        public int frontDefrostButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            mainData.setFront_defrost("Off");
            databaseHelper.insertMainData(mainData);
            return num;

        }

        public int rearDefrostButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            mainData.setRear_defrost("On");
            databaseHelper.insertMainData(mainData);
            return num;

        }
        public int rearDefrostButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            mainData.setRear_defrost("Off");
            databaseHelper.insertMainData(mainData);
            return num;

        }
        public int dogModeButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            mainData.setDog_mode("On");
            databaseHelper.insertMainData(mainData);
            return num;

        }
        public int dogModeButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            mainData.setDog_mode("Off");
            databaseHelper.insertMainData(mainData);
            return num;

        }

        public int campModeButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            mainData.setCamp_mode("On");
            databaseHelper.insertMainData(mainData);
            return num;

        }
        public int campModeButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            mainData.setCamp_mode("Off");
            databaseHelper.insertMainData(mainData);
            return num;

        }

        public int userModeButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            mainData.setUser_mode("On");
            databaseHelper.insertMainData(mainData);
            return num;

        }
        public int userModeButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            mainData.setUser_mode("Off");
            databaseHelper.insertMainData(mainData);
            return num;

        }
    };

}