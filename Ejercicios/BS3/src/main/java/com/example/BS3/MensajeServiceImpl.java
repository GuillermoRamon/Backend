package com.example.BS3;

import org.springframework.stereotype.Service;

@Service
public class MensajeServiceImpl implements MensajeService{

    SegundaClase cs = new SegundaClase();

    @Override
    public String getMensajes() {

        return cs.mostrarMensaje();
    }
}
