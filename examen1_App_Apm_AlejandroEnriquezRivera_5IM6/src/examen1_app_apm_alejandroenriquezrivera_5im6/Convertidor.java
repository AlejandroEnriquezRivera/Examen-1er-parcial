package examen1_app_apm_alejandroenriquezrivera_5im6;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author Alejandro Enriquez Rivera
 */
public final class Convertidor extends JFrame implements ActionListener {

    JTextField texto;
    JButton punto;
    JButton cero;
    JButton uno;
    JButton dos;
    JButton tres;
    JButton cuatro;
    JButton cinco;
    JButton seis;
    JButton siete;
    JButton ocho;
    JButton nueve;
    JButton CE;
    JButton convertir;
    LayoutManager GridLayout;
    JPanel panel;

    public Convertidor() {

        InicializarComponentes();
        ConfigurarVentana();

    }

    public void ConfigurarVentana() {
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(GridLayout);
        setBounds(500, 500, 300, 300);
        setLocationRelativeTo(null);
    }

    public void InicializarComponentes() {

        panel = new JPanel();
        panel.setMaximumSize(new Dimension(300, 300));
        panel.setLayout(new GridLayout());

        texto = new JTextField();
        texto.setBounds(10, 3, 276, 40);
        add(texto);

        convertir = new JButton("Convertir");
        convertir.setBounds(165, 150, 120, 100);
        convertir.addActionListener(this);
        add(convertir);

        CE = new JButton("CE");
        CE.setBounds(165, 50, 120, 100);
        CE.addActionListener(this);
        add(CE);

        punto = new JButton(".");
        punto.setBounds(60, 200, 50, 50);
        punto.addActionListener(this);
        add(punto);

        cero = new JButton("0");
        cero.setBounds(10, 200, 50, 50);
        cero.addActionListener(this);
        add(cero);

        uno = new JButton("1");
        uno.setBounds(110, 150, 50, 50);
        uno.addActionListener(this);
        add(uno);

        dos = new JButton("2");
        dos.setBounds(60, 150, 50, 50);
        dos.addActionListener(this);
        add(dos);

        tres = new JButton("3");
        tres.setBounds(10, 150, 50, 50);
        tres.addActionListener(this);
        add(tres);

        cuatro = new JButton("4");
        cuatro.setBounds(110, 100, 50, 50);
        cuatro.addActionListener(this);
        add(cuatro);

        cinco = new JButton("5");
        cinco.setBounds(60, 100, 50, 50);
        cinco.addActionListener(this);
        add(cinco);

        seis = new JButton("6");
        seis.setBounds(10, 100, 50, 50);
        seis.addActionListener(this);
        add(seis);

        siete = new JButton("7");
        siete.setBounds(110, 50, 50, 50);
        siete.addActionListener(this);
        add(siete);

        ocho = new JButton("8");
        ocho.setBounds(60, 50, 50, 50);
        ocho.addActionListener(this);
        add(ocho);

        nueve = new JButton("9");
        nueve.setBounds(10, 50, 50, 50);
        nueve.addActionListener(this);
        add(nueve);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double cantidad;
        double resultado;
        String resultado2;
        if (e.getSource() == uno) {
            texto.setText(texto.getText() + "1");
        } else if (e.getSource() == dos) {
            texto.setText(texto.getText() + "2");
        } else if (e.getSource() == tres) {
            texto.setText(texto.getText() + "3");
        } else if (e.getSource() == cuatro) {
            texto.setText(texto.getText() + "4");
        } else if (e.getSource() == cinco) {
            texto.setText(texto.getText() + "5");
        } else if (e.getSource() == seis) {
            texto.setText(texto.getText() + "6");
        } else if (e.getSource() == siete) {
            texto.setText(texto.getText() + "7");
        } else if (e.getSource() == ocho) {
            texto.setText(texto.getText() + "8");
        } else if (e.getSource() == nueve) {
            texto.setText(texto.getText() + "9");
        } else if (e.getSource() == punto) {
            texto.setText(texto.getText() + ".");
        } else if (e.getSource() == cero) {
          texto.setText(texto.getText() + "0");
        } else if (e.getSource() == convertir) {
          cantidad = Double.parseDouble(texto.getText());
          resultado = cantidad/19;
          resultado2 = "$"+ resultado;
          texto.setText(resultado2);
        }
       
    }

}
