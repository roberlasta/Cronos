/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronosfmt;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;


/**
 *
 * @author roberto.salinas
 */
public class fichadasDataSource implements JRDataSource{

    private int indiceFichada = -1;    
    private Persona persona;

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    @Override
    public Object getFieldValue(JRField jrField) throws JRException
    { 
        Object valor = null;  

        if("nombre".equals(jrField.getName())) 
        { 
            valor = persona.getNombre(); 
        } 
        else if("horasNormales".equals(jrField.getName())) 
        { 
            valor = persona.getHorasNormales(); 
        }            
        else if("horasExcedentes".equals(jrField.getName())) 
        { 
            valor = persona.getHorasExcedentes(); 
        }      
        else if("legajo".equals(jrField.getName())) 
        { 
            valor = persona.getLegajo(); 
        } 
        else if("tarjeta".equals(jrField.getName())) 
        { 
            valor = persona.getTarjeta(); 
        }            
        else if("horaIngreso".equals(jrField.getName())) 
        { 
            valor = persona.getHoraIngreso(); 
        }           
        else if("horaSalida".equals(jrField.getName())) 
        { 
            valor = persona.getHoraSalida(); 
        }        
        else if("dia".equals(jrField.getName())) 
        { 
            valor = persona.listaFichadas.get(indiceFichada).getDia(); 
        }         
        else if("entra1".equals(jrField.getName())) 
        { 
            valor = persona.listaFichadas.get(indiceFichada).getEntra1(); 
        }        
        else if("sale1".equals(jrField.getName())) 
        { 
            valor = persona.listaFichadas.get(indiceFichada).getEntra1(); 
        }         
        else if("entra2".equals(jrField.getName())) 
        { 
            valor = persona.listaFichadas.get(indiceFichada).getEntra2(); 
        }        
        else if("sale2".equals(jrField.getName())) 
        { 
            valor = persona.listaFichadas.get(indiceFichada).getEntra2(); 
        }           
        else if("entra3".equals(jrField.getName())) 
        { 
            valor = persona.listaFichadas.get(indiceFichada).getEntra3(); 
        }        
        else if("sale3".equals(jrField.getName())) 
        { 
            valor = persona.listaFichadas.get(indiceFichada).getEntra3(); 
        }            
        else if("entra4".equals(jrField.getName())) 
        { 
            valor = persona.listaFichadas.get(indiceFichada).getEntra4(); 
        }        
        else if("sale4".equals(jrField.getName())) 
        { 
            valor = persona.listaFichadas.get(indiceFichada).getEntra4(); 
        }           
        else if("entra5".equals(jrField.getName())) 
        { 
            valor = persona.listaFichadas.get(indiceFichada).getEntra5(); 
        }        
        else if("sale5".equals(jrField.getName())) 
        { 
            valor = persona.listaFichadas.get(indiceFichada).getEntra5(); 
        }           
        else if("normal".equals(jrField.getName())) 
        { 
            valor = persona.listaFichadas.get(indiceFichada).getNormal(); 
        }         
        else if("excedidas".equals(jrField.getName())) 
        { 
            valor = persona.listaFichadas.get(indiceFichada).getExcedidas(); 
        }         
        else if("observaciones".equals(jrField.getName())) 
        { 
            valor = persona.listaFichadas.get(indiceFichada).getObservaciones(); 
        }         
        return valor; 
    }
    
    @Override
    public boolean next() throws JRException
    {
        return ++indiceFichada < persona.listaFichadas.size();
    }    
    
    
}
