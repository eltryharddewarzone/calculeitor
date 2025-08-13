    import java.awt.BorderLayout;
    import java.awt.GridLayout;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import javax.swing.ImageIcon;
    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JPanel;
    import javax.swing.JTextField;

    public class Calculadora implements ActionListener {

    JTextField pantalla; 
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    JButton Sumar, Restar, Multiplicar, Dividir, Igual, Borrar;
    int num1, num2;
    String operacion;



    public Calculadora() {
    pantalla = new JTextField();
    pantalla.setEditable(false);
    pantalla.setHorizontalAlignment(JTextField.LEFT);

    JFrame ventana = new JFrame();
    ventana.setLayout(new BorderLayout());
    ventana.add(pantalla, BorderLayout.NORTH);

    JPanel botones = new JPanel(new GridLayout(4, 4));

       
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");

       
        Sumar = new JButton("+");
        Restar = new JButton("-");
        Multiplicar = new JButton("*");
        Dividir = new JButton("/");
        Igual = new JButton("=");
        Borrar = new JButton("C");

        
        b0.addActionListener(this);
        b1.addActionListener(this); 
        b2.addActionListener(this);     
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        Sumar.addActionListener(this);
        Restar.addActionListener(this);
        Multiplicar.addActionListener(this);
        Dividir.addActionListener(this);
        Igual.addActionListener(this);
        Borrar.addActionListener(this);

        
        botones.add(b7);
        botones.add(b8);
        botones.add(b9);
        botones.add(Dividir);

        botones.add(b4); 
        botones.add(b5);
        botones.add(b6);
        botones.add(Multiplicar);

        botones.add(b1); 
        botones.add(b2); 
        
        botones.add(b3); 
        botones.add(Restar);
        botones.add(b0);
        botones.add(Borrar);
        botones.add(Igual); 
        botones.add(Sumar);

        ventana.add(botones, BorderLayout.CENTER);
        ventana.setSize(420, 420);
        ventana.setTitle("Calculadora");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);

        ImageIcon imagen = new ImageIcon("istockphoto-544462430-612x612.jpg");
        ventana.setIconImage(imagen.getImage());
    }

    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == b0) pantalla.setText(pantalla.getText() + "0");
        if (e.getSource() == b1) pantalla.setText(pantalla.getText() + "1");
        if (e.getSource() == b2) pantalla.setText(pantalla.getText() + "2");
        if (e.getSource() == b3) pantalla.setText(pantalla.getText() + "3");
        if (e.getSource() == b4) pantalla.setText(pantalla.getText() + "4");
        if (e.getSource() == b5) pantalla.setText(pantalla.getText() + "5");
        if (e.getSource() == b6) pantalla.setText(pantalla.getText() + "6");
        if (e.getSource() == b7) pantalla.setText(pantalla.getText() + "7");
        if (e.getSource() == b8) pantalla.setText(pantalla.getText() + "8");
        if (e.getSource() == b9) pantalla.setText(pantalla.getText() + "9");
       
      
      
    if (e.getSource() == Sumar) {
    num1 = Integer.parseInt(pantalla.getText()); 
    operacion = "+"; 
    pantalla.setText(""); 
    }

    if (e.getSource() == Restar) {
    num1 = Integer.parseInt(pantalla.getText()); 
    operacion = "-"; 
    pantalla.setText(""); 

    }

    if(e.getSource()== Multiplicar){
    num1= Integer.parseInt(pantalla.getText());
    operacion = "*";
    pantalla.setText("");
    }
     if(e.getSource()== Dividir){
    num1= Integer.parseInt(pantalla.getText());
    operacion = "/";
    pantalla.setText("");
    }


    if (e.getSource() == Igual) {
    num2 = Integer.parseInt(pantalla.getText()); // 
    int resultado = 0;

    if (operacion.equals("+")) resultado = num1 + num2;
    if (operacion.equals("-")) resultado = num1 - num2;
    if (operacion.equals("*")) resultado = num1 * num2;
    if (operacion.equals("/")) resultado = num1 / num2;

    pantalla.setText(String.valueOf(resultado)); 
}


        if (e.getSource() == Borrar) pantalla.setText("");



    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
