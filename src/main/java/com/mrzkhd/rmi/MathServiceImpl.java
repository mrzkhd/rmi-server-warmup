package com.mrzkhd.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MathServiceImpl extends UnicastRemoteObject implements MathRemoteMethod {

    public Integer getPositiveNumber(Integer number) {
        return Math.abs(number);
    }

    public Integer getSumNumbers(Integer number1, Integer number2) {
        return number1+number2;
    }

    public MathServiceImpl() throws RemoteException{
        super();
    };
}
