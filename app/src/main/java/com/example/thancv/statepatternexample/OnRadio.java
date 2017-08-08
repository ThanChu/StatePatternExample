package com.example.thancv.statepatternexample;

/**
 * Created by ThanCV on 8/8/2017.
 */

public class OnRadio implements StateRadio {
    @Override
    public void actionSetSateRadio(Radio radio) {
        radio.setOpenRadio(true);
    }
}
