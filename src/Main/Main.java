package Main;

import javax.swing.*;

public class Main {

    public static void main(String[] args){
            try {
                ConnectionDB con = new ConnectionDB();
                con.toConnect();
                JOptionPane.showMessageDialog(null, "Conectou");
                con.disconnect();
                JOptionPane.showMessageDialog(null, "desconectou");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
    }
}
