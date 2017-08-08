package com.example.thancv.statepatternexample;

/**
 * Created by ThanCV on 8/8/2017.
 */

public class Radio {
    private boolean openRadio;

    public boolean isOpenRadio() {
        return openRadio;
    }

    public void setOpenRadio(boolean openRadio) {
        this.openRadio = openRadio;
    }

    public void setStateRadio(StateRadio stateRadio) {
        stateRadio.actionSetSateRadio(this);
    }
}
