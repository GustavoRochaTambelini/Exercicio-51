package II;


	import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

	public class ExercicioDoMuéla {
		    static Scanner teclado = new Scanner (System.in);
		    static Font letra = new Font ("Arial",Font.ITALIC,10);
			static JFrame Tela;
			static JPanel MenuTela;
			static JFrame Cadastro;
			static JFrame Atualizar;
			static JFrame Excluir;
			static JFrame Consultar;
			static JLabel Titulo;
			static JMenuBar BarraMenu;
			static JMenu menu = new JMenu("Menu");
			static JMenuItem informacao = new JMenuItem("Informações");
			static JMenuItem ajuda = new JMenuItem("Ajuda");
			static JButton Botao = new JButton("Cadastrar");
			static JButton Botao2 = new JButton("Atualizar");
			static JButton Botao3 = new JButton("Excluir");
			static JButton Botao4 = new JButton("Consultar");
			static JTextField Nome;
			static JTextField Sobrenome;
			static JTextField CPF;

			public static void main(String[] args) {
				Tela = new JFrame();
				BarraMenu = new JMenuBar();
				Tela();
				Menu();
				botao();
				}

			static void Tela() {

				Tela.setTitle("Cadastro de clientes");
				Tela.setSize(600, 400);
				Tela.setLocationRelativeTo(null);
				Tela.setResizable(false);
				Tela.setVisible(true);
				Tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				MenuTela = new JPanel();
			    MenuTela.setSize(600,400);
			    MenuTela.setLayout(new GridLayout(1,4));
				MenuTela.setVisible(true);
				MenuTela.add(Botao);
				MenuTela.add(Botao2);
				MenuTela.add(Botao3);
				MenuTela.add(Botao4);
				Titulo = new JLabel("Sistema de gerenciamento de clientes");
				Titulo.setFont(letra);
			    MenuTela.add(Titulo);
	            Tela.add(MenuTela);
				
			} 

			static void Menu() {

				Tela.setJMenuBar(BarraMenu);
				BarraMenu.add(menu);
				menu.add(informacao);
				menu.add(ajuda);
				informacao.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null,
								"Desenvolvido por Guilherme Maeda");
					}
				});
				ajuda.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null,
								"Sistema de cadastro, atualização, exclusão e consulta de clientes");
					}
				});
			}

			static void botao() {
				Botao.setBounds(0, 0, 150, 50);
				Botao2.setBounds(150, 0, 150, 50);
				Botao3.setBounds(300, 0, 150, 50);
				Botao4.setBounds(450, 0, 150, 50);
				

				Botao.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//MenuTela.setVisible(false);
						Cadastro();
						
						
					}
				});

				Botao2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//MenuTela.setVisible(false);
						Atualizar();
					}
				});

				Botao3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//MenuTela.setVisible(false);
						Excluir();
					}
				});
				Botao4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//MenuTela.setVisible(false);
						Consultar();
					}
				});
			}

			static void Cadastro() {
				Cadastro = new JFrame();
				Cadastro.setSize(600,400);
				Cadastro.setTitle("Cadastrar novo cliente");
				Cadastro.setLocationRelativeTo(null);
				Cadastro.setBackground(Color.BLUE);
				Cadastro.setLayout( new GridLayout(10,10,56,5));
				Cadastro.setVisible(true);
				JLabel nome = new JLabel ("Nome");
				nome.setVerticalTextPosition(SwingConstants.CENTER);
				Cadastro.add(nome);
				nome.setVisible(true);
				Nome = new JTextField(30);
				Cadastro.add(Nome);
				JLabel sobrenome = new JLabel ("Sobrenome");
				sobrenome.setVerticalTextPosition(SwingConstants.CENTER);
				Cadastro.add(sobrenome);
				sobrenome.setVisible(true);
				Sobrenome = new JTextField(30);
				Cadastro.add(Sobrenome);
				JLabel cpf = new JLabel ("CPF");
				sobrenome.setVerticalTextPosition(SwingConstants.CENTER);
				Cadastro.add(cpf);
				cpf.setVisible(true);
				CPF = new JTextField(30);
				Cadastro.add(CPF);
				
			}
		

			static void Atualizar() {
				Atualizar = new JFrame();
				Atualizar.setSize(600,400);
				Atualizar.setLocationRelativeTo(null);
				Atualizar.setBackground(Color.LIGHT_GRAY);
				Atualizar.setLayout(null);
				Atualizar.setVisible(true);
				}
			
			static void Excluir() {
				Excluir = new JFrame();
				Excluir.setSize(600,400);
				Excluir.setLocationRelativeTo(null);
				Excluir.setBackground(Color.RED);
				Excluir.setLayout(null);
				Excluir.setVisible(true);
				
			}
			static void Consultar() {
				Consultar = new JFrame();
				Consultar.setSize(600,400);
				Consultar.setLocationRelativeTo(null);
				Consultar.setBackground(Color.GRAY);
				Consultar.setLayout(null);
				Consultar.setVisible(true);
				
			}
			
		}


