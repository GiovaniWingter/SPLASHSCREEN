package br.com.lab;

import javax.swing.JWindow;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Font;

public class SplashBarProgressivo extends JWindow{
	private static final long serialVersionUID = 1L;

	JProgressBar progressBar = new JProgressBar();

	public SplashBarProgressivo() {
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblExemploDeSplashscreen = new JLabel("Exemplo de SplashScreen");
		lblExemploDeSplashscreen.setFont(new Font("Verdana", Font.BOLD, 16));
		lblExemploDeSplashscreen.setBounds(173, 49, 267, 25);
		getContentPane().add(lblExemploDeSplashscreen);
		
		JLabel lblUtilizandoJprogressbar = new JLabel("Utilizando JprogressBar");
		lblUtilizandoJprogressbar.setFont(new Font("Verdana", Font.BOLD, 12));
		lblUtilizandoJprogressbar.setBounds(173, 85, 175, 25);
		getContentPane().add(lblUtilizandoJprogressbar);
		progressBar.setMinimum(0);
		progressBar.setMaximum(5000000);
		progressBar.setString("Carregando...");
		progressBar.setStringPainted(true);
		progressBar.setBackground(Color.white);
		progressBar.setForeground(new Color(102, 204, 51));
		
		progressBar.setBounds(0, 275, 450, 25);
		getContentPane().add(progressBar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(SplashBarProgressivo.class.getResource("/br/com/lab/image/dukeGuitar.png")));
		lblNewLabel.setBounds(10, 15, 160, 144);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(SplashBarProgressivo.class.getResource("/br/com/lab/image/logoJava.png")));
		lblNewLabel_1.setBounds(302, 96, 138, 168);
		getContentPane().add(lblNewLabel_1);
	}
	
	public void showSplashBar(){
		setBounds(100, 100, 450, 300);
		setVisible(true);		
	}
	
	public void setProgresso(int i){
		progressBar.setValue(i);
		progressBar.setString("Carregando...."+i/50000+"%");
	}
	
	
	public void exitSplash(){
		this.dispose();
	}
}
