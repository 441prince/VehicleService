package com.example.vehicleservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class SeatHeaterTabDataService extends Service {

    private SeatHeaterData seatHeaterData;
    private DatabaseHelper databaseHelper;

    public IBinder onBind(Intent intent) {
        // TODO Auto-generated method stub
        this.seatHeaterData = new SeatHeaterData();
        this.databaseHelper = new DatabaseHelper(this);
        return mBinder;
    }

    /**
     * IAdd definition is below
     */
    private final ISeatHeaterTabDataInterface.Stub mBinder = new ISeatHeaterTabDataInterface.Stub() {

        @Override
        public int driverSeatButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub

            seatHeaterData.setDriver_seat("On");
            databaseHelper.insertSeatTabData(seatHeaterData);
            return num;

        }
        public int driverSeatButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub

            seatHeaterData.setDriver_seat("Off");
            databaseHelper.insertSeatTabData(seatHeaterData);
            return num;

        }
        public int pillionSeatButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            seatHeaterData.setPillion_seat("On");
            databaseHelper.insertSeatTabData(seatHeaterData);
            return num;

        }
        public int pillionSeatButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            seatHeaterData.setPillion_seat("Off");
            databaseHelper.insertSeatTabData(seatHeaterData);
            return num;

        }
        public int thirdSeatButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            seatHeaterData.setThird_seat("On");
            databaseHelper.insertSeatTabData(seatHeaterData);
            return num;

        }
        public int thirdSeatButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            seatHeaterData.setThird_seat("Off");
            databaseHelper.insertSeatTabData(seatHeaterData);
            return num;

        }
        public int fourthSeatButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            seatHeaterData.setFourth_seat("On");
            databaseHelper.insertSeatTabData(seatHeaterData);
            return num;

        }
        public int fourthSeatButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            seatHeaterData.setFourth_seat("Off");
            databaseHelper.insertSeatTabData(seatHeaterData);
            return num;

        }
        public int fifthSeatButtonOn(int num) throws RemoteException {
            // TODO Auto-generated method stub
            seatHeaterData.setFifth_seat("On");
            databaseHelper.insertSeatTabData(seatHeaterData);
            return num;

        }
        public int fifthSeatButtonOff(int num) throws RemoteException {
            // TODO Auto-generated method stub
            seatHeaterData.setFifth_seat("Off");
            databaseHelper.insertSeatTabData(seatHeaterData);
            return num;

        }

        public int allOffButton(int num) throws RemoteException{
            // TODO Auto-generated method stub
            return num;
        }

    };
}