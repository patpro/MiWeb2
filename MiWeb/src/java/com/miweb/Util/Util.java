/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miweb.Util;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author Igor
 */
public class Util {


    public static boolean getBoolean(int valor) {
        return (valor == 0) ? false : true;
    }

    public static int getInt(boolean valor) {
        return (valor == true ? 1 : 0);
    }

    /**
     * Obtener el objeto Calendar de un campo fecha
     * @param fecha Date, la fecha que se tiene que convertir
     * @return la fecha en un objeto Calendar
     */
    public static Calendar getCalendar(Date fecha) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        return calendar;
    }

    /**
     * Obtener el año actual
     * @return el año actual
     */
    public static int getYearActual() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR);
    }

    /**
     * Obtener el mes actual
     * @return el mes actual
     */
    public static int getMonthActual() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.MONTH) + 1;
    }

    public static int getFechaActual() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.DATE);
    }

    /**
     * Obtener el dia actual
     * @return el dia actual
     */
    public static int getDayActual() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    public static boolean validaDouble(String Valor) {
        try {
            Double.parseDouble(Valor);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean validaEntero(String Valor) {
        try {
            Integer.parseInt(Valor);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
//Inicio Agregado por CAREI

    public static boolean validaBigDecimal(String valor) {
        try {
            new BigDecimal(valor);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
//Fin Agregado por CAREI

    public static boolean validaFloat(String Valor) {
        try {
            Float.parseFloat(Valor);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static double convertDouble(String Valor) {
        double db = 0;
        try {
            db = Double.parseDouble(Valor);
            return db;
        } catch (Exception e) {
            return db;
        }
    }

    public static int convertEntero(String Valor) {
        int in = 0;
        try {
            in = Integer.parseInt(Valor);
            return in;
        } catch (Exception e) {
            return in;
        }
    }
//Inicio Agregado por CAREI

    public static BigDecimal convetBigDecimal(String Valor) {
        BigDecimal bd = new BigDecimal(0);
        try {
            bd = new BigDecimal(Valor);
            return bd;
        } catch (Exception e) {
            return bd;
        }

    }

    public static String convetEnteroToString(int valor) {
        String cad = "";
        try {
            cad = String.valueOf(valor);
            return cad;
        } catch (Exception e) {
            return cad;
        }
    }

    public static String convetBigDecimalToString(BigDecimal valor) {
        String cad = "";
        try {
            cad = String.valueOf(valor);
            return cad;
        } catch (Exception e) {
            return cad;
        }
    }

    public static boolean validarCaracteres(String valor) {
        for (int i = 0; i < valor.length(); i++) {
            if (Character.isDigit(valor.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static BigDecimal getRedondeo(double valor, int decimales) {
        BigDecimal big = new BigDecimal(valor);
        if (valor != 0) {
            big = big.setScale(decimales, RoundingMode.HALF_UP);
        }
        return big;
    }
    /*
     * Retorna fecha en date
     */

    public static Date getFechaDate(int dia, int mes, int anio) {

        Date fecha = null;
        String strFecha = "";
        try {
            if (dia < 10) {
                strFecha = strFecha + "0".concat(String.valueOf(dia));
            } else {
                strFecha = strFecha.concat(String.valueOf(dia));
            }
            strFecha = strFecha.concat("/");
            if (mes < 10) {
                strFecha = strFecha + "0".concat(String.valueOf(mes));
            } else {
                strFecha = strFecha.concat(String.valueOf(mes));
            }
            strFecha = strFecha.concat("/");
            strFecha = strFecha.concat(String.valueOf(anio));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            fecha = simpleDateFormat.parse(strFecha);

        } catch (ParseException ex) {
            fecha = new Date();
        }
        return fecha;
    }
    /*Devuelve la fecha dd/MM/yyyy en yyyy-MM-dd
     * @param pFecha String
     */

    public static String getFechaDB2(String pFecha) {
        String fecha = "";
        Date d = null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            d = simpleDateFormat.parse(pFecha);
            SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
            fecha = formateador.format(d);
        } catch (ParseException ex) {
            d = new Date();
            SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
            fecha = formateador.format(d);
        }
        return fecha;
    }

    public static boolean isValidDate(Date d) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            sdf.format(d);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static long convertLong(String Valor) {
        long lo = 0;
        try {
            lo = Long.parseLong(Valor);
            return lo;
        } catch (Exception e) {
            return lo;
        }
    }

    public static float convertFloat(String Valor) {
        float fl = 0;
        try {
            fl = Float.parseFloat(Valor);
            return fl;
        } catch (Exception e) {
            return fl;
        }
    }

    public static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static boolean validaLong(String Valor) {
        try {
            Long.parseLong(Valor);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    /*
     * Metodo para comparar dos fechas
     * @author      Ivzap
     * @param       fecha1    fecha1 de tipo Calendar
     * @param       fecha2    fecha2 de tipo Calendar
     * @return      -1  si fecha1<fecha2
     *               0  si fecha1=fecha2
     *               1  si fecha1>fecha2
     */

    public static int compare(Calendar Fecha1, Calendar Fecha2) {
        int dia1 = Fecha1.get(Calendar.DAY_OF_MONTH);
        int mes1 = Fecha1.get(Calendar.MONTH);
        int anio1 = Fecha1.get(Calendar.YEAR);
        int dia2 = Fecha2.get(Calendar.DAY_OF_MONTH);
        int mes2 = Fecha2.get(Calendar.MONTH);
        int anio2 = Fecha2.get(Calendar.YEAR);

        if (anio1 < anio2) {
            return -1;
        } else if (anio1 > anio2) {
            return 1;
        } else {
            if (mes1 < mes2) {
                return -1;
            } else if (mes1 > mes2) {
                return 1;
            } else {
                if (dia1 < dia2) {
                    return -1;
                } else if (dia1 > dia2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }

    /*
     * Metodo para Obtener solo la fecha
     */
    public static Calendar getOnlyFecha(Calendar fecha) {
        Calendar fec = (Calendar) fecha.clone();
        fec.set(Calendar.HOUR, 0);
        fec.set(Calendar.MINUTE, 0);
        fec.set(Calendar.SECOND, 0);
        fec.set(Calendar.MILLISECOND, 0);
        return fec;
    }
    /*
     * Metodo para saber si la fecha actual esta dentro
     * de un rango de fechas
     * @author      Ivzap
     * @param       fecIni    fecha de inicio de tipo Calendar
     * @param       fecFin    fecha de fin de tipo Calendar
     * @return      true      si fecha actual esta dentro del rango de fechas
     *              false     fecha actual no esta dentro del rango de fechas
     */

    public static boolean betweenFechas(Calendar fecIni, Calendar fecFin) {
        Calendar fecActual = Calendar.getInstance();
        if ((compare(fecActual, fecIni) == 0 || compare(fecActual, fecIni) > 0)
                && (compare(fecActual, fecFin) == 0 || compare(fecActual, fecFin) < 0)) {
            return true;
        }
        return false;
    }

    public static String formatearFechaBaseDatos(Calendar fecha) {
        return (fecha == null ? "" : new SimpleDateFormat("dd.MM.yyyy").format(fecha.getTime()));
    }

    public static String formatearFecha(Calendar fecha) {
        return (fecha == null ? "" : new SimpleDateFormat("dd/MM/yyyy").format(fecha.getTime()));
    }

}
