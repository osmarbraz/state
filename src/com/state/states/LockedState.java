package com.state.states;

import com.state.ui.Player;

/**
 * Os estados concretos fornecem a implementação especial para todos os métodos
 * de interface.
 */
public class LockedState extends State {

    /**
     * Quando você desbloqueia um jogador bloqueado, ele vai assumir um dos dois
     * estados.
     */
    public LockedState(Player player) {
        super(player);
        player.setPlaying(false);
    }

    @Override
    public String onLock() {
        if (player.isPlaying()) {
            player.changeState(new ReadyState(player));
            return "Parar musica";
        } else {
            return "Bloqueado...";
        }
    }

    @Override
    public String onPlay() {
        player.changeState(new ReadyState(player));
        return "Pronto";
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
