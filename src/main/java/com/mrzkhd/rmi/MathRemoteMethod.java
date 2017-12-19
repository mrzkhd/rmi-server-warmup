package com.mrzkhd.rmi;

import java.rmi.Remote;

public interface MathRemoteMethod extends Remote {

    public Integer getPositiveNumber(Integer number);

    public Integer getSumNumbers(Integer number1, Integer number2);
}
