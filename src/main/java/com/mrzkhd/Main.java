package com.mrzkhd;

import com.mrzkhd.rmi.MathServiceImpl;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;

public class Main {

    public static void main(String[] args)  throws Exception{

        if (System.getSecurityManager()== null)
            System.setSecurityManager(new RMISecurityManager());

        MathServiceImpl mathService = new MathServiceImpl();

        Naming.bind("rmi://127.0.0.1/MathRemoteMethod",mathService);

        System.out.println("System service is bound...");

    }
}
