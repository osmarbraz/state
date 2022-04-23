package com.state.states;

import com.state.ui.Player;

/**
 * Eles também podem acionar transições de estado no contexto.
 */
public class ReadyState extends State {

    public ReadyState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.changeState(new LockedState(player));
        return "Bloqueado...";
    }

    @Override
    public String onPlay() {
        String action = player.startPlayback();
        player.changeState(new PlayingState(player));
        return action;
    }

    @Override
    public String onNext() {
        return "Bloqueado...";
    }

    @Override
    public String onPrevious() {
        return "Bloqueado...";
    }
}
