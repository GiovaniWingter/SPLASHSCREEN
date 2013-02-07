package br.com.lab;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Principal extends JFrame{

	private static final long serialVersionUID = 1L;
	public int valorProg;
	JFrame frame;
	JPanel panel;
	
	
	public Principal(){
		 
		 frame = new JFrame("Principal");
		 panel = new JPanel();
		 
		 panel.setLayout(new GridLayout(4, 1));
		
		frame.getContentPane().add(panel,BorderLayout.CENTER);
		
		int width = 800;
		int height = 500;
				
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		
		int x = (screen.width - width)/2;
		int y = (screen.height - height)/2;
		
		frame.setBounds(x,y,width,height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		
	}
	
	public void initAplication(){
		frame.pack();
		frame.setVisible(true);
		frame.setSize(800, 500);
	}
	

	public static void main(String[] args) {
		//SplashScreen janelaInicial = new SplashScreen();
		//janelaInicial.initSplash();
		
		SplashBarProgressivo novaJanela = new SplashBarProgressivo();
		novaJanela.showSplashBar();
		for(int i = 0; i<= 5000000;i++){
				novaJanela.setProgresso(i);
		}
		
		Principal janela = new Principal();
		janela.initAplication();
		
		novaJanela.exitSplash();
		//janelaInicial.exitSplash();
		
	}

}
