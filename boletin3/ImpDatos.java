

package boletin3;

public class ImpDatos {
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
    private float ceur;
    private float lmed;

    public ImpDatos (){};
    public ImpDatos (float km, float litros, float vMed, float pGas){
    this.km=km;
    this.litros=litros;
    this.vMed=vMed;
    this.pGas=pGas;
    }
    public float getTempo() {
    float tem= km/vMed;
    return tem;
    }
    public float consumoMedio (){
    float cmed =litros/km*100;
    return cmed;
    }
    public float consumoEuros (){
    float cmed =litros/km*100;
    float eur = pGas*cmed; 
    return eur;
    }
    public float vMed (){
    float vmed=vMed;
    return vmed;}
    public void setkm(float km){
    this.km=km;
    }
    public float getKms(){
    return km;
    }
    public void setLitros (float lit){
    this.litros= lit;
    }
    public float getLitros(){
    return litros;
    }
    public void setpGas (float pGas){
    this.pGas=pGas;
    }
    public float getpGas (){
    return pGas;
    }
            }  
    
