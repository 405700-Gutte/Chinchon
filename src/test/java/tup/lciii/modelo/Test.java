package tup.lciii.modelo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import tup.lciii.modelo.enums.Palo;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


class JuegoChinchonTest {

    @Test
    void buscarCartaEnMano(){
    Mano mano = new Mano();
    Carta carta = mano.getMano().get(mano.getMano().size()-1);
    Carta cartabuscar = mano.buscarCartaEnMano(carta.getNumero(), carta.getPalo());
    assertEquals(carta,cartabuscar);

    }
    @Test
    void quitarCartaDeLaMesa(){
        Mesa mesa = new Mesa();
        Carta carta = new Carta(7, Palo.ORO);
        mesa.agregarCartaALaMesa(carta);
        ArrayList<Carta> cartas = mesa.getMesa();
        mesa.quitarCartaDeLaMesa();
        assertNotEquals(cartas.get(cartas.size() -1), mesa.getMesa().get(mesa.getMesa().size() -1));
    }
    @Test
    void descombinarTodasLasCartas(){
        Mazo mazo = new Mazo();
        mazo.generarMazo();
        mazo.mezclarMazo();
        ArrayList<Carta> mazoanterior = mazo.getMazo();
        mazo.descombinarTodasLasCartas();
        assertNotEquals(mazoanterior, mazo.getMazo());

    }
}
