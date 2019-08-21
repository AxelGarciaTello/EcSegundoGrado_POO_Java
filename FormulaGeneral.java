
public class FormulaGeneral {
    
    private int coeficienteCuadratico,
                coeficienteLineal,
                terminoIndependiente,
                valorComprobacion;
    
    public int verificarSiTieneSolucion(int[] terminos){
        int coeficienteLinealCuadrado,
            multiplicacionTerminos,
            salida=0;
        coeficienteLinealCuadrado=terminos[1]*terminos[1];
        multiplicacionTerminos=4*terminos[0]*terminos[2];
        valorComprobacion=coeficienteLinealCuadrado-multiplicacionTerminos;
        if(valorComprobacion>=0){
            this.coeficienteCuadratico=terminos[0];
            this.coeficienteLineal=terminos[1];
            this.terminoIndependiente=terminos[2];
            salida=1;
        }
        return salida;
    }
    
    public String solucionarEcuacion(){
        float raiz,
              resultado1,
              resultado2;
        String mensajeRespuesta;
        raiz= (float) Math.sqrt(valorComprobacion);
        resultado1=(-coeficienteLineal+raiz)/(2*coeficienteCuadratico);
        mensajeRespuesta="El resultado es: \nx1="+resultado1+"\n";
        if(valorComprobacion!=0){
            resultado2=(-coeficienteLineal-raiz)/(2*coeficienteCuadratico);
            mensajeRespuesta=mensajeRespuesta+"x2="+resultado2+"\n";
        }
        return mensajeRespuesta;
    }
    
}
