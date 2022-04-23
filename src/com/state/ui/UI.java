package com.state.ui;

import javax.swing.*;
import java.awt.*;

public class UI {

    private Player player;
    private static JTextField textField = new JTextField();

    public UI(Player player) {
        this.player = player;
    }

    public void init() {
        JFrame frame = new JFrame("Teste tocador");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel context = new JPanel();
        context.setLayout(new BoxLayout(context, BoxLayout.Y_AXIS));
        frame.getContentPane().add(context);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        context.add(textField);
        context.add(buttons);

        // Delegados de contexto manipulando a entrada do usuário para um objeto de estado. Naturalmente,
        // o resultado dependerá de qual estado está ativo no momento, já que todos
        // os estados podem tratar a entrada de forma diferente.
        JButton play = new JButton("Tocar");
        play.addActionListener(e -> textField.setText(player.getState().onPlay()));
        JButton stop = new JButton("Parar");
        stop.addActionListener(e -> textField.setText(player.getState().onLock()));
        JButton next = new JButton("Prox");
        next.addActionListener(e -> textField.setText(player.getState().onNext()));
        JButton prev = new JButton("Ant");
        prev.addActionListener(e -> textField.setText(player.getState().onPrevious()));
        frame.setVisible(true);
        frame.setSize(300, 100);
        buttons.add(play);
        buttons.add(stop);
        buttons.add(next);
        buttons.add(prev);
    }
}
