import javax.swing.*;
public class Login {
    public void show(){

    JFrame frame = new JFrame();
    frame.setSize(300, 250);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true); 
    
    JPanel panel = new JPanel();
    panel.setLayout(null);
    
    JLabel lblUsuario = new JLabel ("Usuario");
    lblUsuario.setBounds(10, 20, 80, 25);
    
    JTextField txtUsuario = new JTextField ();
    txtUsuario.setBounds(70, 20, 210, 25);
    
    JLabel lblSenha = new JLabel ("Senha");
    lblSenha.setBounds(10, 60, 80, 25);
     
    JPasswordField txtSenha = new  JPasswordField ();
    txtSenha.setBounds(70, 60, 210, 25);
    
    JButton btnEntrar = new JButton();
    btnEntrar.setText("Entrar");
    btnEntrar.setBounds(70,100,100,25);
    btnEntrar.addActionListener(e ->{
        String usuario = txtUsuario.getText();
        String senha = String.copyValueOf(txtSenha.getPassword());
        
        if("joao".equals(usuario)&& "123".equals(senha)){
            Jogo jogo = new Jogo();
            jogo.show();
            frame.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Usuario ou senha incorreta");
        }
    });
    
    
    panel.add(lblUsuario);
    panel.add(txtUsuario);
    panel.add(lblSenha);
    panel.add(txtSenha);
    panel.add(btnEntrar);
    
    frame.add(panel);
    frame.getRootPane().setDefaultButton(btnEntrar);
    frame.setVisible(true);
    }
}
