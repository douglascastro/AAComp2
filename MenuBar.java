package menu;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MenuPrincipal extends JMenuBar implements KeyListener, ActionListener{
	
	
	//barra de menu
		
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public static JMenuBar criaMenuPrincipal(){
		
//		setLayout(new FlowLayout());
//		setSize(800, 600);
//		setTitle("Piririco's Bank");
//		this.setBackground(new Color(0, 2, 2));
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		this.addKeyListener(this);

		JMenuBar menuBar;
		//     menu         submenu     submenu      menu
		JMenu menuArquivo,menuImportar,menuExportar,menuUtilitaros,menuRelatorios;
		//Itens de menu
		JMenuItem importarAgencia,importarConta,exportarAgencia,exportarConta,trocaAgencia,relatorioClientes,relatorioAgencias,exit;
		//criando o menu		
		menuBar = new JMenuBar();
		
		
		// definindo menus
		
		menuArquivo = new JMenu("Arquivo");
		//menuArquivo.addMenuListener(new thisMenuListener());
		menuBar.add(menuArquivo);

		menuUtilitaros = new JMenu("Utilitarios");
		menuBar.add(menuUtilitaros);

		// definindo menu exit
		//Obs mudar de menu para item
		exit = new JMenuItem("Sair");
		exit.setMnemonic(KeyEvent.VK_X);
		exit.addActionListener(new ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				System.out.println("Saiu");
			}
		});
		menuBar.add(exit);
		
		
		//definir submenus
		menuImportar = new JMenu("Importar");
		menuExportar = new JMenu("Exportar");
		//seeItRun.addMenuListener(new thisMenuListener());
		menuArquivo.add(menuImportar);
		menuArquivo.add(menuExportar);		
		
		trocaAgencia = new JMenuItem("Trocar Agencia");
		menuRelatorios =  new JMenu("Relatorios");
		
		menuUtilitaros.add(trocaAgencia);
		menuUtilitaros.add(menuRelatorios);
		
		
		//definir itens
		importarAgencia = new JMenuItem("Agencias",new ImageIcon("images/open_document_16.gif"));
		importarAgencia.addActionListener(new ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				System.out.println("Importou Agencia");
			}
		});
		
		importarConta = new JMenuItem("Contas",new ImageIcon("images/open_document_16.gif"));
		importarConta.addActionListener(new ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				System.out.println("Importou Conta");
			}
		});
		
		
		menuImportar.add(importarAgencia);
		menuImportar.add(importarConta);
		
		exportarAgencia = new JMenuItem("Agencias",new ImageIcon("images/open_document_16.gif"));
		exportarAgencia.addActionListener(new ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				System.out.println("Exportou Agencia");
			}
		});
		
		exportarConta = new JMenuItem("Contas",new ImageIcon("images/open_document_16.gif"));
		exportarConta.addActionListener(new ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				System.out.println("Exportou Conta");
			}
		});
		
		menuExportar.add(exportarAgencia);
		menuExportar.add(exportarConta);
		
		relatorioClientes = new JMenuItem("Relatorio de Clientes",new ImageIcon("images/open_document_16.gif"));
		relatorioClientes.addActionListener(new ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				System.out.println("Chamou o Relatorio de Clientes");
			}
		});
		
		relatorioAgencias= new JMenuItem("Relatorio de Agencias",new ImageIcon("images/open_document_16.gif"));
		relatorioAgencias.addActionListener(new ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				System.out.println("Chamou o Relatorio de Agencias");
			}
		});
		
		menuRelatorios.add(relatorioAgencias);
		menuRelatorios.add(relatorioClientes);

		return menuBar;
//
//		this.setJMenuBar(menuBar);		
//		this.setVisible(true);
	}
	
}
