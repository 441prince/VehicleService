package com.example.vehicleservice;

import android.content.Context;
import android.os.RemoteException;

public class Test extends IMainDataInterface.Stub {

    private MainData mainData = new MainData();
    private Context context;
    private DatabaseHelper databaseHelper = new DatabaseHelper(context);

    public Test(Context context) {
        this.context = context;
    }

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
}
