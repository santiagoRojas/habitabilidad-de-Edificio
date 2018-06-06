/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo;

import Mundo.Habitacion;

/**
 *
 * @author TOSHIBA
 */
public class algoritmo {
    Habitacion habitacion101;
    Habitacion habitacion102;
    Habitacion habitacion103;
    Habitacion habitacion104;
    Habitacion habitacion105;
    Habitacion habitacion106;
    Habitacion habitacion201;
    Habitacion habitacion202;
    Habitacion habitacion203;
    Habitacion habitacion204;
    Habitacion habitacion205;
    Habitacion habitacion206;
    Habitacion habitacion301;
    Habitacion habitacion302;
    Habitacion habitacion303;
    Habitacion habitacion304;
    Habitacion habitacion305;
    Habitacion habitacion306;
    
    String[][] habitabilidad = new String[18][3]; 
    
    public algoritmo(Habitacion habitacion101, Habitacion habitacion102, Habitacion habitacion103, Habitacion habitacion104, Habitacion habitacion105, Habitacion habitacion106, Habitacion habitacion201, Habitacion habitacion202, Habitacion habitacion203, Habitacion habitacion204, Habitacion habitacion205, Habitacion habitacion206, Habitacion habitacion301, Habitacion habitacion302, Habitacion habitacion303, Habitacion habitacion304, Habitacion habitacion305, Habitacion habitacion306) {
        this.habitacion101 = habitacion101;
        this.habitacion102 = habitacion102;
        this.habitacion103 = habitacion103;
        this.habitacion104 = habitacion104;
        this.habitacion105 = habitacion105;
        this.habitacion106 = habitacion106;
        this.habitacion201 = habitacion201;
        this.habitacion202 = habitacion202;
        this.habitacion203 = habitacion203;
        this.habitacion204 = habitacion204;
        this.habitacion205 = habitacion205;
        this.habitacion206 = habitacion206;
        this.habitacion301 = habitacion301;
        this.habitacion302 = habitacion302;
        this.habitacion303 = habitacion303;
        this.habitacion304 = habitacion304;
        this.habitacion305 = habitacion305;
        this.habitacion306 = habitacion306;
    }
    
    public String[][] calcularHabitabilidad(){

    double temperatura;
    double olor;
        temperatura = 18;
        temperatura += calcularTemperaturaPiso(habitacion101.getSuelo(), null);
        temperatura += calcularTemperaturaTecho(habitacion101.getTecho(), habitacion201.getSuelo());
        temperatura += calcularTemperaturaParedes(habitacion101.getParedes(), habitacion102.getParedes(), habitacion106.getParedes());
        olor = 70;
        olor += calcularVentilacion(habitacion101.getVentilacion(), habitacion201.getVentilacion(), "ducto", habitacion102.getVentilacion(), habitacion106.getVentilacion());
        habitabilidad[0][0] = temperatura+"";
        habitabilidad[0][1] = olor+"";
        if((temperatura<22 && temperatura>15)&&(olor<=77)){
            habitabilidad[0][2] = "verde";
        }else if((temperatura>22 || temperatura<15)&&(olor>77)){
            habitabilidad[0][2] = "rojo";
        }else{
            habitabilidad[0][2] = "anaranjado";
        }
        
        temperatura = 18;
        temperatura += calcularTemperaturaPiso(habitacion102.getSuelo(), null);
        temperatura += calcularTemperaturaTecho(habitacion102.getTecho(), habitacion202.getSuelo());
        temperatura += calcularTemperaturaParedes(habitacion102.getParedes(), habitacion103.getParedes(), habitacion101.getParedes());
        olor = 70;
        olor += calcularVentilacion(habitacion102.getVentilacion(), habitacion202.getVentilacion(), "ducto", habitacion103.getVentilacion(), habitacion101.getVentilacion());
        habitabilidad[1][0] = temperatura+"";
        habitabilidad[1][1] = olor+"";
        if((temperatura<22 && temperatura>15)&&(olor<=77)){
            habitabilidad[1][2] = "verde";
        }else if((temperatura>22 || temperatura<15)&&(olor>77)){
            habitabilidad[1][2] = "rojo";
        }else{
            habitabilidad[1][2] = "anaranjado";
        }
        
        temperatura = 18;
        temperatura += calcularTemperaturaPiso(habitacion103.getSuelo(), null);
        temperatura += calcularTemperaturaTecho(habitacion103.getTecho(), habitacion203.getSuelo());
        temperatura += calcularTemperaturaParedes(habitacion103.getParedes(), habitacion104.getParedes(), habitacion102.getParedes());
        olor = 70;
        olor += calcularVentilacion(habitacion103.getVentilacion(), habitacion203.getVentilacion(), "ducto", habitacion102.getVentilacion(), habitacion104.getVentilacion());
        habitabilidad[2][0] = temperatura+"";
        habitabilidad[2][1] = olor+"";
        if((temperatura<22 && temperatura>15)&&(olor<=77)){
            habitabilidad[2][2] = "verde";
        }else if((temperatura>22 || temperatura<15)&&(olor>77)){
            habitabilidad[2][2] = "rojo";
        }else{
            habitabilidad[2][2] = "anaranjado";
        }
        
        temperatura = 18;
        temperatura += calcularTemperaturaPiso(habitacion104.getSuelo(), null);
        temperatura += calcularTemperaturaTecho(habitacion104.getTecho(), habitacion204.getSuelo());
        temperatura += calcularTemperaturaParedes(habitacion104.getParedes(), habitacion105.getParedes(), habitacion103.getParedes());
        olor = 70;
        olor += calcularVentilacion(habitacion104.getVentilacion(), habitacion204.getVentilacion(), "ducto", habitacion103.getVentilacion(), habitacion105.getVentilacion());
        habitabilidad[3][0] = temperatura+"";
        habitabilidad[3][1] = olor+"";
        if((temperatura<22 && temperatura>15)&&(olor<=77)){
            habitabilidad[3][2] = "verde";
        }else if((temperatura>22 || temperatura<15)&&(olor>77)){
            habitabilidad[3][2] = "rojo";
        }else{
            habitabilidad[3][2] = "anaranjado";
        }
        
        temperatura = 18;
        temperatura += calcularTemperaturaPiso(habitacion105.getSuelo(), null);
        temperatura += calcularTemperaturaTecho(habitacion105.getTecho(), habitacion205.getSuelo());
        temperatura += calcularTemperaturaParedes(habitacion105.getParedes(), habitacion104.getParedes(), habitacion106.getParedes());
        olor = 70;
        olor += calcularVentilacion(habitacion105.getVentilacion(), habitacion205.getVentilacion(), "ducto", habitacion104.getVentilacion(), habitacion106.getVentilacion());
        habitabilidad[4][0] = temperatura+"";
        habitabilidad[4][1] = olor+"";
        if((temperatura<22 && temperatura>15)&&(olor<=77)){
            habitabilidad[4][2] = "verde";
        }else if((temperatura>22 || temperatura<15)&&(olor>77)){
            habitabilidad[4][2] = "rojo";
        }else{
            habitabilidad[4][2] = "anaranjado";
        }
        
        temperatura = 18;
        temperatura += calcularTemperaturaPiso(habitacion106.getSuelo(), null);
        temperatura += calcularTemperaturaTecho(habitacion106.getTecho(), habitacion206.getSuelo());
        temperatura += calcularTemperaturaParedes(habitacion106.getParedes(), habitacion105.getParedes(), habitacion101.getParedes());
        olor = 70;
        olor += calcularVentilacion(habitacion106.getVentilacion(), habitacion206.getVentilacion(), "ducto", habitacion105.getVentilacion(), habitacion101.getVentilacion());
        habitabilidad[5][0] = temperatura+"";
        habitabilidad[5][1] = olor+"";
        if((temperatura<22 && temperatura>15)&&(olor<=77)){
            habitabilidad[5][2] = "verde";
        }else if((temperatura>22 || temperatura<15)&&(olor>77)){
            habitabilidad[5][2] = "rojo";
        }else{
            habitabilidad[5][2] = "anaranjado";
        }
        temperatura = 18;
        temperatura += calcularTemperaturaPiso(habitacion201.getSuelo(), habitacion101.getTecho());
        temperatura += calcularTemperaturaTecho(habitacion201.getTecho(), habitacion301.getSuelo());
        temperatura += calcularTemperaturaParedes(habitacion201.getParedes(), habitacion202.getParedes(), habitacion206.getParedes());
        olor = 70;
        olor += calcularVentilacion(habitacion201.getVentilacion(), habitacion301.getVentilacion(), habitacion101.getVentilacion(), habitacion202.getVentilacion(), habitacion206.getVentilacion());
        habitabilidad[6][0] = temperatura+"";
        habitabilidad[6][1] = olor+"";
        if((temperatura<22 && temperatura>15)&&(olor<=77)){
            habitabilidad[6][2] = "verde";
        }else if((temperatura>22 || temperatura<15)&&(olor>77)){
            habitabilidad[6][2] = "rojo";
        }else{
            habitabilidad[6][2] = "anaranjado";
        }
        
        temperatura = 18;
        temperatura += calcularTemperaturaPiso(habitacion202.getSuelo(), habitacion102.getTecho());
        temperatura += calcularTemperaturaTecho(habitacion202.getTecho(), habitacion302.getSuelo());
        temperatura += calcularTemperaturaParedes(habitacion202.getParedes(), habitacion203.getParedes(), habitacion201.getParedes());
        olor = 70;
        olor += calcularVentilacion(habitacion202.getVentilacion(), habitacion302.getVentilacion(), habitacion102.getVentilacion(), habitacion203.getVentilacion(), habitacion201.getVentilacion());
        habitabilidad[7][0] = temperatura+"";
        habitabilidad[7][1] = olor+"";
        if((temperatura<22 && temperatura>15)&&(olor<=77)){
            habitabilidad[7][2] = "verde";
        }else if((temperatura>22 || temperatura<15)&&(olor>77)){
            habitabilidad[7][2] = "rojo";
        }else{
            habitabilidad[7][2] = "anaranjado";
        }
        
        temperatura = 18;
        temperatura += calcularTemperaturaPiso(habitacion203.getSuelo(), habitacion103.getTecho());
        temperatura += calcularTemperaturaTecho(habitacion203.getTecho(), habitacion303.getSuelo());
        temperatura += calcularTemperaturaParedes(habitacion203.getParedes(), habitacion204.getParedes(), habitacion202.getParedes());
        olor = 70;
        olor += calcularVentilacion(habitacion203.getVentilacion(), habitacion303.getVentilacion(), habitacion103.getVentilacion(), habitacion202.getVentilacion(), habitacion204.getVentilacion());
        habitabilidad[8][0] = temperatura+"";
        habitabilidad[8][1] = olor+"";
        if((temperatura<22 && temperatura>15)&&(olor<=77)){
            habitabilidad[8][2] = "verde";
        }else if((temperatura>22 || temperatura<15)&&(olor>77)){
            habitabilidad[8][2] = "rojo";
        }else{
            habitabilidad[8][2] = "anaranjado";
        }
        
        temperatura = 18;
        temperatura += calcularTemperaturaPiso(habitacion204.getSuelo(), habitacion104.getTecho());
        temperatura += calcularTemperaturaTecho(habitacion204.getTecho(), habitacion304.getSuelo());
        temperatura += calcularTemperaturaParedes(habitacion204.getParedes(), habitacion205.getParedes(), habitacion203.getParedes());
        olor = 70;
        olor += calcularVentilacion(habitacion204.getVentilacion(), habitacion304.getVentilacion(), habitacion104.getVentilacion(), habitacion205.getVentilacion(), habitacion203.getVentilacion());
        habitabilidad[9][0] = temperatura+"";
        habitabilidad[9][1] = olor+"";
        if((temperatura<22 && temperatura>15)&&(olor<=77)){
            habitabilidad[9][2] = "verde";
        }else if((temperatura>22 || temperatura<15)&&(olor>77)){
            habitabilidad[9][2] = "rojo";
        }else{
            habitabilidad[9][2] = "anaranjado";
        }
        
        temperatura = 18;
        temperatura += calcularTemperaturaPiso(habitacion205.getSuelo(), habitacion105.getTecho());
        temperatura += calcularTemperaturaTecho(habitacion205.getTecho(), habitacion305.getSuelo());
        temperatura += calcularTemperaturaParedes(habitacion205.getParedes(), habitacion206.getParedes(), habitacion204.getParedes());
        olor = 70;
        olor += calcularVentilacion(habitacion205.getVentilacion(), habitacion305.getVentilacion(), habitacion105.getVentilacion(), habitacion204.getVentilacion(), habitacion206.getVentilacion());
        habitabilidad[10][0] = temperatura+"";
        habitabilidad[10][1] = olor+"";
        if((temperatura<22 && temperatura>15)&&(olor<=77)){
            habitabilidad[10][2] = "verde";
        }else if((temperatura>22 || temperatura<15)&&(olor>77)){
            habitabilidad[10][2] = "rojo";
        }else{
            habitabilidad[10][2] = "anaranjado";
        }
        
        temperatura = 18;
        temperatura += calcularTemperaturaPiso(habitacion206.getSuelo(), habitacion106.getTecho());
        temperatura += calcularTemperaturaTecho(habitacion206.getTecho(), habitacion306.getSuelo());
        temperatura += calcularTemperaturaParedes(habitacion206.getParedes(), habitacion205.getParedes(), habitacion201.getParedes());
        olor = 70;
        olor += calcularVentilacion(habitacion206.getVentilacion(), habitacion306.getVentilacion(), habitacion106.getVentilacion(), habitacion205.getVentilacion(), habitacion201.getVentilacion());
        habitabilidad[11][0] = temperatura+"";
        habitabilidad[11][1] = olor+"";
        if((temperatura<22 && temperatura>15)&&(olor<=77)){
            habitabilidad[11][2] = "verde";
        }else if((temperatura>22 || temperatura<15)&&(olor>77)){
            habitabilidad[11][2] = "rojo";
        }else{
            habitabilidad[11][2] = "anaranjado";
        }
        
        temperatura = 18;
        temperatura += calcularTemperaturaPiso(habitacion301.getSuelo(), habitacion201.getTecho());
        temperatura += calcularTemperaturaTecho(habitacion301.getTecho(), null);
        temperatura += calcularTemperaturaParedes(habitacion301.getParedes(), habitacion302.getParedes(), habitacion306.getParedes());
        olor = 70;
        olor += calcularVentilacion(habitacion301.getVentilacion(), "ducto", habitacion201.getVentilacion(), habitacion302.getVentilacion(), habitacion306.getVentilacion());
        habitabilidad[12][0] = temperatura+"";
        habitabilidad[12][1] = olor+"";
        if((temperatura<22 && temperatura>15)&&(olor<=77)){
            habitabilidad[12][2] = "verde";
        }else if((temperatura>22 || temperatura<15)&&(olor>77)){
            habitabilidad[12][2] = "rojo";
        }else{
            habitabilidad[12][2] = "anaranjado";
        }
        
        temperatura = 18;
        temperatura += calcularTemperaturaPiso(habitacion302.getSuelo(), habitacion202.getTecho());
        temperatura += calcularTemperaturaTecho(habitacion302.getTecho(), null);
        temperatura += calcularTemperaturaParedes(habitacion302.getParedes(), habitacion303.getParedes(), habitacion301.getParedes());
        olor = 70;
        olor += calcularVentilacion(habitacion302.getVentilacion(), "ducto", habitacion202.getVentilacion(), habitacion303.getVentilacion(), habitacion301.getVentilacion());
        habitabilidad[13][0] = temperatura+"";
        habitabilidad[13][1] = olor+"";
        if((temperatura<22 && temperatura>15)&&(olor<=77)){
            habitabilidad[13][2] = "verde";
        }else if((temperatura>22 || temperatura<15)&&(olor>77)){
            habitabilidad[13][2] = "rojo";
        }else{
            habitabilidad[13][2] = "anaranjado";
        }
        
        temperatura = 18;
        temperatura += calcularTemperaturaPiso(habitacion303.getSuelo(), habitacion203.getTecho());
        temperatura += calcularTemperaturaTecho(habitacion303.getTecho(), null);
        temperatura += calcularTemperaturaParedes(habitacion303.getParedes(), habitacion304.getParedes(), habitacion302.getParedes());
        olor = 70;
        olor += calcularVentilacion(habitacion303.getVentilacion(), "ducto", habitacion203.getVentilacion(), habitacion304.getVentilacion(), habitacion302.getVentilacion());
        habitabilidad[14][0] = temperatura+"";
        habitabilidad[14][1] = olor+"";
        if((temperatura<22 && temperatura>15)&&(olor<=77)){
            habitabilidad[14][2] = "verde";
        }else if((temperatura>22 || temperatura<15)&&(olor>77)){
            habitabilidad[14][2] = "rojo";
        }else{
            habitabilidad[14][2] = "anaranjado";
        }
        
        temperatura = 18;
        temperatura += calcularTemperaturaPiso(habitacion304.getSuelo(), habitacion204.getTecho());
        temperatura += calcularTemperaturaTecho(habitacion304.getTecho(), null);
        temperatura += calcularTemperaturaParedes(habitacion304.getParedes(), habitacion305.getParedes(), habitacion303.getParedes());
        olor = 70;
        olor += calcularVentilacion(habitacion304.getVentilacion(), "ducto", habitacion204.getVentilacion(), habitacion305.getVentilacion(), habitacion303.getVentilacion());
        habitabilidad[15][0] = temperatura+"";
        habitabilidad[15][1] = olor+"";
        if((temperatura<22 && temperatura>15)&&(olor<=77)){
            habitabilidad[15][2] = "verde";
        }else if((temperatura>22 || temperatura<15)&&(olor>77)){
            habitabilidad[15][2] = "rojo";
        }else{
            habitabilidad[15][2] = "anaranjado";
        }
        
        temperatura = 18;
        temperatura += calcularTemperaturaPiso(habitacion305.getSuelo(), habitacion205.getTecho());
        temperatura += calcularTemperaturaTecho(habitacion305.getTecho(), null);
        temperatura += calcularTemperaturaParedes(habitacion305.getParedes(), habitacion306.getParedes(), habitacion304.getParedes());
        olor = 70;
        olor += calcularVentilacion(habitacion305.getVentilacion(), "ducto", habitacion205.getVentilacion(), habitacion304.getVentilacion(), habitacion306.getVentilacion());
        habitabilidad[16][0] = temperatura+"";
        habitabilidad[16][1] = olor+"";
        if((temperatura<22 && temperatura>15)&&(olor<=77)){
            habitabilidad[16][2] = "verde";
        }else if((temperatura>22 || temperatura<15)&&(olor>77)){
            habitabilidad[16][2] = "rojo";
        }else{
            habitabilidad[16][2] = "anaranjado";
        }
        
        temperatura = 18;
        temperatura += calcularTemperaturaPiso(habitacion306.getSuelo(), habitacion206.getTecho());
        temperatura += calcularTemperaturaTecho(habitacion306.getTecho(), null);
        temperatura += calcularTemperaturaParedes(habitacion306.getParedes(), habitacion301.getParedes(), habitacion305.getParedes());
        olor = 70;
        olor += calcularVentilacion(habitacion306.getVentilacion(), "ducto", habitacion206.getVentilacion(), habitacion301.getVentilacion(), habitacion305.getVentilacion());
        habitabilidad[17][0] = temperatura+"";
        habitabilidad[17][1] = olor+"";
        if((temperatura<22 && temperatura>15)&&(olor<=77)){
            habitabilidad[17][2] = "verde";
        }else if((temperatura>22 || temperatura<15)&&(olor>77)){
            habitabilidad[17][2] = "rojo";
        }else{
            habitabilidad[17][2] = "anaranjado";
        }
        
        return habitabilidad;
    }
    static public double calcularTemperaturaPiso(String piso,String techo){
        double temperaturaAfectada = 18;
        double temperaturaPasada = 0; 
        double porcentaje =0;
        if(techo == null){
            temperaturaAfectada = 25;
            porcentaje += 47.5;
        }else if(techo == "pvc"){
            porcentaje += 45;
        }else if(techo == "cemento"){
            porcentaje += 47.5;
        }else if(techo == "sintetico"){
            porcentaje += 49;
        }
        if(piso == "pvc"){
            porcentaje += 45;
        }else if(piso == "cemento"){
            porcentaje += 47.5;
        }else if(piso == "sintetico"){
            porcentaje += 49;
        }
        
        temperaturaPasada = temperaturaAfectada - ((temperaturaAfectada*porcentaje)/100);
        
        return temperaturaPasada;
    }
    static public double calcularTemperaturaParedes(String paredes,String paredesVecino1, String paredesVecino2){
        double temperaturaAfectada = 18;
        double temperaturaPasada = 0; 
        double porcentaje =0;
        if(paredes == "carton"){
            porcentaje += 45;
        }else if(paredes == "cemento"){
            porcentaje += 47.5;
        }else if(paredes == "sintetico"){
            porcentaje += 49;
        }
        if(paredesVecino1 == "carton"){
            porcentaje += 45;
        }else if(paredesVecino1 == "cemento"){
            porcentaje += 47.5;
        }else if(paredesVecino1 == "sintetico"){
            porcentaje += 49;
        }
        
        temperaturaPasada += temperaturaAfectada - ((temperaturaAfectada*porcentaje)/100);
        
        porcentaje =0;
        if(paredes == "carton"){
            porcentaje += 45;
        }else if(paredes == "cemento"){
            porcentaje += 47.5;
        }else if(paredes == "sintetico"){
            porcentaje += 49;
        }
        if(paredesVecino2 == "carton"){
            porcentaje += 45;
        }else if(paredesVecino2 == "cemento"){
            porcentaje += 47.5;
        }else if(paredesVecino2 == "sintetico"){
            porcentaje += 49;
        }
        
        temperaturaPasada += temperaturaAfectada - ((temperaturaAfectada*porcentaje)/100);
        
        return temperaturaPasada;
    }
    static public double calcularTemperaturaTecho(String techo,String piso){
        double temperaturaAfectada = 18;
        double temperaturaPasada = 0; 
        double porcentaje =0;
        if(piso == null){
            temperaturaAfectada = -18;
            porcentaje += 47.5;
        }else if(piso == "pvc"){
            porcentaje += 45;
        }else if(piso == "cemento"){
            porcentaje += 47.5;
        }else if(piso == "sintetico"){
            porcentaje += 49;
        }
        if(techo == "pvc"){
            porcentaje += 45;
        }else if(techo == "cemento"){
            porcentaje += 47.5;
        }else if(techo == "sintetico"){
            porcentaje += 49;
        }
        
        temperaturaPasada = temperaturaAfectada - ((temperaturaAfectada*porcentaje)/100);
        
        return temperaturaPasada;
    }
    static public double calcularVentilacion(String venticacion,String venticacionVecinoArriba,String venticacionVecinoabajo,String venticacionVecino1,String venticacionVecino2){
        double olorafectado = 70;
        double olorPasado = 0; 
        double porcentaje =0;
        if(venticacion == "regillas"){
            porcentaje += 17;
        }else if(venticacion == "ducto"){
            porcentaje += 18;
        }else if(venticacion == "aireAcondicionado"){
            porcentaje += 19;
        }
        if(venticacionVecinoArriba == "regillas"){
            porcentaje += 17;
        }else if(venticacionVecinoArriba == "ducto"){
            porcentaje += 18;
        }else if(venticacionVecinoArriba == "aireAcondicionado"){
            porcentaje += 19;
        }
        if(venticacionVecinoabajo == "regillas"){
            porcentaje += 17;
        }else if(venticacionVecinoabajo == "ducto"){
            porcentaje += 18;
        }else if(venticacionVecinoabajo == "aireAcondicionado"){
            porcentaje += 19;
        }
        if(venticacionVecino1 == "regillas"){
            porcentaje += 17;
        }else if(venticacionVecino1 == "ducto"){
            porcentaje += 18;
        }else if(venticacionVecino1 == "aireAcondicionado"){
            porcentaje += 19;
        }
        if(venticacionVecino2 == "regillas"){
            porcentaje += 17;
        }else if(venticacionVecino2 == "ducto"){
            porcentaje += 18;
        }else if(venticacionVecino2 == "aireAcondicionado"){
            porcentaje += 19;
        }
        
        olorPasado = olorafectado - ((olorafectado*porcentaje)/100);
        
        return olorPasado;
    }
}
