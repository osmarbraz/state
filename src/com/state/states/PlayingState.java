package com.state.states;

import com.state.ui.Player;

public class PlayingState extends State {

    public PlayingState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.changeState(new LockedState(player));
        player.setCurrentTrackAfterStop();
        return "Tocador parado";
    }

    @Override
    public String onPlay() {
        player.changeState(new ReadyState(player));
        return "Pausado...";
    }

    @Override
    public String onNext() {
        return player.nextTrack();
    }

    @Override
    public String onPrevious() {
        return player.previousTrack();
    }
}
