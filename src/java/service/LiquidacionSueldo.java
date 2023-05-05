/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author micke
 */
@WebService(serviceName = "LiquidacionSueldo")
public class LiquidacionSueldo {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public Boolean hello(@WebParam(name = "name") String strNombreUsuario, @WebParam(name = "pass") String strPassUsuario) {
        String strNombreUsuarioLocal = "admin";
        String strPassUsuarioLocal = "1234";
        if(strNombreUsuario.equals(strNombreUsuarioLocal) && strPassUsuario.equals(strPassUsuarioLocal) ){
         return true;
        } else {
            return false;
        }
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "calcular_sueldo_liquido")
    public double calcular_sueldo_liquido(@WebParam(name = "sueldo_bruto") double dobSueldoBruto) {
        double dobBonoMobilizacion = dobSueldoBruto * 0.2;
        double dobBonoCumplimiento = dobSueldoBruto * 0.15;
        double dobDescSalud = dobSueldoBruto * 0.07;
        double dobDescAFP = dobSueldoBruto * 0.12;
        double dobSueldoLiquido = dobSueldoBruto + dobBonoMobilizacion + dobBonoCumplimiento - dobDescSalud - dobDescAFP;
        
        //dobSueldoBruto
        return dobSueldoLiquido;
    }
}
