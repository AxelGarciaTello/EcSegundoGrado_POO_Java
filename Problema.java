public class Problema {
    
    private EcuacionSegundoGrado ecuacion;
    private FormulaGeneral formula;
    
    public void solucionarProblema(){
        ecuacion = new EcuacionSegundoGrado();
        formula = new FormulaGeneral();
        int[] terminos=ecuacion.pedirEcuacion();
        int comprobacion=formula.verificarSiTieneSolucion(terminos);
        if(comprobacion==0){
            System.out.println("La solucion tiene numeros complejos.");
        }
        else{
            String resultado=formula.solucionarEcuacion();
            System.out.println(resultado);
        }
    }

}
