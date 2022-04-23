package com.state.states;

import com.state.ui.Player;

/**
 * Interface comum para todos os estados.
 *
 * A classe de estado base declara métodos que todos os estados concretos devem
 * implementar e também fornece uma referência anterior ao objeto de contexto
 * associado com o estado. Estados podem usar a referência anterior para
 * realizar a transição contexto para outro estado.
 */
public abstract class State {

    protected Player player;

    /**
     * O contexto passa por si mesmo pelo construtor de estado. Isso pode ajudar
     * um estado para buscar alguns dados de contexto úteis, se necessário.
     */
    public State(Player player) {
        this.player = player;
    }

    public abstract String onLock();

    public abstract String onPlay();

    public abstract String onNext();

    public abstract String onPrevious();
}
