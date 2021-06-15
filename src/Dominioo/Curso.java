
package Dominioo;


public class Curso {
    
        private double [] notas;
        private double promedio;
        private int estudiantesEncimaPromedio;
    private int estudianEncimaPromedio;
        public Curso(){
            notas = new double[12];
        
       
        }

    public  void setNotas(double notas[]){
        this.notas = notas;
    }
    public void mostrarNotas(){
    for (int i=0;i<12;i++){
System.out.println(" Nro del estudiante: "+this.notas[i]);  
   }
    }
    public void setPromedio (){
        double promedio=0;
        for (int i=0;i<12;i++){
      this.notas[0]=this.notas[0]+this.notas[i];
    }
     this.promedio=this.notas[0]/12;
      }
            
  public void  setEstudianEncimaPromedio() {
      int estudiantes = 0;
      for (int i=0;i<12;i++){
          if(this.notas[i]<this.getPromedio()){
              estudiantes ++;
          }
      }
      this.estudianEncimaPromedio=estudiantes; 
     
  }
    public double getPromedio() {
        return this.promedio;
    }
     
    public int estudianEncimaPromedio() {
    return this.estudianEncimaPromedio;
    }
 
    public void setPromedio(double[] promedio) {
    }

    public String getnroEstudiantesEncimaPromedio(){
       
    }
    
}
