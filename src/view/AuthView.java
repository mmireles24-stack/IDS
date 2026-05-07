package view;

import controllers.AuthController;
import controllers.HomeController;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.ConexionDB;

public class AuthView {

    public AuthView() {}

    public void loginView(AuthController controller) {

        JFrame ventana = new JFrame();

        ventana.setSize(1200, 1200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setMinimumSize(new Dimension(200, 200));
        ventana.setMaximumSize(new Dimension(800, 800));
        ventana.setTitle("Login");

        Toolkit logo_windows = Toolkit.getDefaultToolkit();
        Image icono = logo_windows.getImage("logoMJ.png");
        ventana.setIconImage(icono);

        ventana.setLayout(null);
        ventana.setLocation(200, 200);

        ventana.getContentPane().removeAll();

        JPanel contenedor = new JPanel();
        contenedor.setBackground(new Color(18, 22, 38));
        contenedor.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));
        contenedor.setBounds(20, 20, 1160, 610);
        contenedor.setLayout(null);
        ventana.add(contenedor);

        JLabel title_login = new JLabel("Bienvenido");
        title_login.setBounds(0, 40, 500, 50);
        title_login.setFont(new Font("Segoe UI", Font.BOLD, 38));
        title_login.setHorizontalAlignment(JLabel.CENTER);
        title_login.setForeground(Color.WHITE);
        contenedor.add(title_login);

        JLabel usuario = new JLabel("Usuario:");
        usuario.setBounds(100, 130, 200, 30);
        usuario.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        usuario.setForeground(new Color(180, 190, 210));
        contenedor.add(usuario);

        JTextField username = new JTextField();
        username.setBounds(100, 160, 300, 30);
        username.setBackground(new Color(30, 35, 55));
        username.setForeground(Color.WHITE);
        username.setCaretColor(new Color(0, 255, 200));
        username.setFont(new Font("Segoe UI", Font.BOLD, 22));
        username.setBorder(BorderFactory.createLineBorder(new Color(0, 255, 200), 1));
        contenedor.add(username);

        ImageIcon iconUser = new ImageIcon("ICON USER1.PNG");
        Image imgUser = iconUser.getImage().getScaledInstance(30, 20, Image.SCALE_SMOOTH);
        JLabel iconoUser = new JLabel(new ImageIcon(imgUser));
        iconoUser.setBounds(70, 165, 20, 20);
        contenedor.add(iconoUser);

        JLabel contraseña = new JLabel("Contraseña:");
        contraseña.setBounds(100, 220, 200, 30);
        contraseña.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        contraseña.setForeground(new Color(180, 190, 210));
        contenedor.add(contraseña);

        JPasswordField password = new JPasswordField();
        password.setBounds(100, 250, 300, 30);
        password.setBackground(new Color(30, 35, 55));
        password.setForeground(Color.WHITE);
        password.setCaretColor(new Color(0, 255, 200));
        password.setFont(new Font("Segoe UI", Font.BOLD, 22));
        password.setBorder(BorderFactory.createLineBorder(new Color(0, 255, 200), 1));
        contenedor.add(password);

        ImageIcon iconLock = new ImageIcon("ICON PASSWORD.png");
        Image imgLock = iconLock.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        JLabel iconoLock = new JLabel(new ImageIcon(imgLock));
        iconoLock.setBounds(70, 255, 20, 20);
        contenedor.add(iconoLock);

        JCheckBox recordar = new JCheckBox("Recordarme");
        recordar.setBounds(100, 290, 150, 30);
        recordar.setBackground(new Color(18, 22, 38));
        recordar.setForeground(new Color(180, 190, 210));
        contenedor.add(recordar);

        JButton acceder = new JButton("Acceder");
        acceder.setBounds(160, 360, 180, 45);
        acceder.setFont(new Font("Segoe UI", Font.BOLD, 22));
        acceder.setBackground(new Color(0, 255, 200));
        acceder.setForeground(new Color(18, 22, 38));
        acceder.setBorderPainted(false);
        contenedor.add(acceder);

        
        acceder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String username_val = username.getText();
                String password_val = new String(password.getPassword());

                if (controller.login(username_val, password_val)) {

                    JOptionPane.showMessageDialog(null, "Bienvenido");

                    username.setBorder(BorderFactory.createLineBorder(Color.green, 3, true));
                    password.setBorder(BorderFactory.createLineBorder(Color.green, 3, true));

                    ventana.dispose();
                    new HomeController().home();

                } else {

                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");

                    username.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));
                    password.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));
                }

                if (password_val.length() < 6 || password_val.contains(" ")) {
                    password.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));
                } else {
                    password.setBorder(BorderFactory.createLineBorder(Color.green, 3, true));
                }

                if (username_val.equals("") || username_val.contains(" ")) {
                    username.setBorder(BorderFactory.createLineBorder(Color.red, 3, true));
                } else {
                    username.setBorder(BorderFactory.createLineBorder(Color.green, 3, true));
                }
            }
        });

        ImageIcon login = new ImageIcon("login.jpeg");
        Image img = login.getImage().getScaledInstance(400, 460, Image.SCALE_SMOOTH);
        JLabel vista = new JLabel(new ImageIcon(img));
        vista.setBounds(480, 20, 400, 460);
        contenedor.add(vista);

        JButton registro = new JButton("¿Aún no tienes cuenta?");
        registro.setBounds(100, 460, 300, 50);
        contenedor.add(registro);

        registro.addActionListener(e -> {
            ventana.dispose();
            showRegister();
        });

        ventana.setVisible(true);
    }

    public void showRegister() {

        JFrame ventana = new JFrame();

        ventana.setSize(1200,800);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Registro");
        ventana.setLayout(null);

        JPanel register_container = new JPanel();
        register_container.setBackground(new Color(238, 242, 246));
        register_container.setBounds(650, 30, 500, 700);
        register_container.setLayout(null);
        ventana.add(register_container);

        JLabel registro = new JLabel("Registro");
        registro.setBounds(0, 20, 500, 50);
        registro.setFont(new Font("Segoe UI", Font.BOLD, 34));
        registro.setHorizontalAlignment(JLabel.CENTER);
        register_container.add(registro);

        // USUARIO
        JLabel nombre = new JLabel("Nombre de usuario:");
        nombre.setBounds(100, 85, 300, 25);
        register_container.add(nombre);

        JTextField username1 = new JTextField();
        username1.setBounds(100, 110, 300, 35);
        register_container.add(username1);

        // NOMBRE COMPLETO
        JLabel nombre_completo_label = new JLabel("Nombre completo:");
        nombre_completo_label.setBounds(100, 155, 300, 25);
        register_container.add(nombre_completo_label);

        JTextField nombre_completo = new JTextField();
        nombre_completo.setBounds(100, 180, 300, 35);
        register_container.add(nombre_completo);

        // PASSWORD
        JLabel password_label = new JLabel("Contraseña:");
        password_label.setBounds(100, 225, 300, 25);
        register_container.add(password_label);

        JPasswordField password = new JPasswordField();
        password.setBounds(100, 250, 300, 35);
        register_container.add(password);

        // BIO
        JLabel bio_tag = new JLabel("Biografía");
        bio_tag.setBounds(0, 295, 500, 30);
        bio_tag.setHorizontalAlignment(JLabel.CENTER);
        register_container.add(bio_tag);

        JTextArea bio = new JTextArea();
        bio.setBounds(100, 325, 300, 70);
        register_container.add(bio);

        // PREFERENCIAS
        JLabel preferences = new JLabel("Preferencias");
        preferences.setBounds(0, 405, 500, 30);
        preferences.setHorizontalAlignment(JLabel.CENTER);
        register_container.add(preferences);

        JCheckBox sweet_option = new JCheckBox("Dulce");
        sweet_option.setBounds(110, 435, 90, 25);
        sweet_option.setOpaque(false);
        register_container.add(sweet_option);

        JCheckBox salty_option = new JCheckBox("Salado");
        salty_option.setBounds(210, 435, 90, 25);
        salty_option.setOpaque(false);
        register_container.add(salty_option);

        JCheckBox healthy_option = new JCheckBox("Saludable");
        healthy_option.setBounds(310, 435, 110, 25);
        healthy_option.setOpaque(false);
        register_container.add(healthy_option);

        // TERMINOS
        JLabel terms_text = new JLabel("Términos");
        terms_text.setBounds(0, 465, 500, 30);
        terms_text.setHorizontalAlignment(JLabel.CENTER);
        register_container.add(terms_text);

        JRadioButton accept_terms = new JRadioButton("Acepto términos");
        accept_terms.setBounds(110, 495, 140, 25);
        accept_terms.setOpaque(false);
        register_container.add(accept_terms);

        JRadioButton reject_terms = new JRadioButton("Rechazo términos");
        reject_terms.setBounds(260, 495, 160, 25);
        reject_terms.setOpaque(false);
        register_container.add(reject_terms);

        ButtonGroup terms = new ButtonGroup();
        terms.add(accept_terms);
        terms.add(reject_terms);

        // COMBO
        String[] colonias = { "Camino Real", "La fuente", "Villas del encanto" };

        JComboBox list = new JComboBox(colonias);
        list.setBounds(100, 530, 300, 30);
        register_container.add(list);

        // BOTON CREAR
        JButton create_account = new JButton("Crear cuenta");
        create_account.setBounds(150, 575, 200, 40);
        register_container.add(create_account);

        create_account.addActionListener(e -> {

            String username1_val = username1.getText();
            String nombre_val = nombre_completo.getText();
            String password_val = new String(password.getPassword());
            String bio_val = bio.getText();

            // VALIDACIONES

            if (username1_val.equals("") || username1_val.contains(" ")) {

                username1.setBorder(BorderFactory.createLineBorder(Color.red, 3));

                JOptionPane.showMessageDialog(null,
                        "Usuario inválido");

                return;

            } else {

                username1.setBorder(BorderFactory.createLineBorder(Color.green, 3));
            }

            if (nombre_val.equals("")) {

                nombre_completo.setBorder(BorderFactory.createLineBorder(Color.red, 3));

                JOptionPane.showMessageDialog(null,
                        "Nombre requerido");

                return;

            } else {

                nombre_completo.setBorder(BorderFactory.createLineBorder(Color.green, 3));
            }

            if (password_val.length() < 6) {

                password.setBorder(BorderFactory.createLineBorder(Color.red, 3));

                JOptionPane.showMessageDialog(null,
                        "La contraseña debe tener mínimo 6 caracteres");

                return;

            } else {

                password.setBorder(BorderFactory.createLineBorder(Color.green, 3));
            }

            if (bio_val.equals("")) {

                bio.setBorder(BorderFactory.createLineBorder(Color.red, 3));

            } else {

                bio.setBorder(BorderFactory.createLineBorder(Color.green, 3));
            }

            if (!sweet_option.isSelected() &&
                !salty_option.isSelected() &&
                !healthy_option.isSelected()) {

                sweet_option.setForeground(Color.red);
                salty_option.setForeground(Color.red);
                healthy_option.setForeground(Color.red);

            } else {

                sweet_option.setForeground(Color.black);
                salty_option.setForeground(Color.black);
                healthy_option.setForeground(Color.black);
            }

            if (!accept_terms.isSelected()) {

                accept_terms.setForeground(Color.red);

                JOptionPane.showMessageDialog(null,
                        "Debes aceptar los términos");

                return;

            } else {

                accept_terms.setForeground(Color.black);
            }

            // CONEXION MYSQL

            Connection conn = ConexionDB.getConnection();

            try {

                // VALIDAR SI EL USUARIO YA EXISTE

                String checkQuery = "SELECT * FROM usuarios WHERE username = ?";

                PreparedStatement checkStatement =
                        conn.prepareStatement(checkQuery);

                checkStatement.setString(1, username1_val);

                ResultSet rs = checkStatement.executeQuery();

                if (rs.next()) {

                    JOptionPane.showMessageDialog(null,
                            "El usuario ya existe");

                    username1.setBorder(
                            BorderFactory.createLineBorder(Color.red, 3));

                    return;
                }

                // INSERTAR USUARIO

                String sql = "INSERT INTO usuarios (username, password, nombre_completo) VALUES (?, ?, ?)";

                PreparedStatement ps = conn.prepareStatement(sql);

                ps.setString(1, username1_val);
                ps.setString(2, password_val);
                ps.setString(3, nombre_val);

                int resultado = ps.executeUpdate();

                if (resultado > 0) {

                    JOptionPane.showMessageDialog(null,
                            "Usuario registrado correctamente");

                    username1.setText("");
                    nombre_completo.setText("");
                    password.setText("");
                    bio.setText("");

                    username1.setBorder(BorderFactory.createLineBorder(Color.green, 3));
                    nombre_completo.setBorder(BorderFactory.createLineBorder(Color.green, 3));
                    password.setBorder(BorderFactory.createLineBorder(Color.green, 3));
                }

                rs.close();
                checkStatement.close();
                ps.close();
                conn.close();

            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null,
                        "Error en la base de datos");

                ex.printStackTrace();
            }
        });

        // BOTON CANCELAR
        JButton cancelar = new JButton("Cancelar");
        cancelar.setBounds(150, 625, 200, 50);
        register_container.add(cancelar);

        cancelar.addActionListener(e -> {
            ventana.dispose();
            loginView(new AuthController());
        });

        ventana.setVisible(true);
    }
}