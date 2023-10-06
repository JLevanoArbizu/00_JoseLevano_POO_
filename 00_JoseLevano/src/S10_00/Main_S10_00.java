package S10_00;

import java.util.ArrayList;

/**
 *
 * @author joseLevanoArbizu
 */
public class Main_S10_00 {

    public static void main(String[] args) {
        
        
        futbolista_00 futbolista1 = new futbolista_00(9, "arquero", 1, "paolo", "guerrero", 42);
        masajista_00 masajista1  = new masajista_00("si", 15, 2, "raul", "Martines", 50);
        entrenador_00 RicardoGareca = new entrenador_00("uno", 1, "Ricardo", "Gareca", 65);
        
        //ENTRESNAR
        futbolista1.concentrarse();
        futbolista1.entrenar();
        
        masajista1.darMasaje();
        masajista1.concentrarse();
        
        
                
        
        
    }

}
