package br.imd.visao;

import javax.swing.*;

import br.imd.modelo.Cliente;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Formulario extends JFrame implements ActionListener{
	
	private ArrayList<Cliente> listaClientes;
	
	private JLabel lblNome, lblIdade, lblCPF, lblRG;
	private JTextField txtNome, txtIdade, txtCPF, txtRG;
	private JButton btnSubmeter, btnLimpar, btnListar;
	private Container ct;
		
	private void initComponents(){
		ct = this.getContentPane();
		lblNome = new JLabel("Nome: ");
		lblIdade = new JLabel("Idade: ");
		lblCPF = new JLabel("CPF...: ");
		lblRG = new JLabel("RG....: ");
		txtNome = new JTextField();
		txtIdade = new JTextField();
		txtCPF = new JTextField();
		txtRG = new JTextField();
		btnSubmeter = new JButton("Submeter");
		btnLimpar = new JButton("Limpar");
		btnListar = new JButton("Listar");
		
	}
	
	private void initLayout(){
		
		ct.setLayout(null);
		
		lblNome.setBounds(10,10,100,30);
		txtNome.setBounds(55,15,200,25);
		
		lblIdade.setBounds(10,40,100,30);
		txtIdade.setBounds(55,45,22,25);
		
		lblCPF.setBounds(10,70,100,30);
		txtCPF.setBounds(55,75,100,25);
		
		lblRG.setBounds(10,100,100,30);
		txtRG.setBounds(55,105,60,25);
		
		btnSubmeter.setBounds(10,140,130,30);
		btnLimpar.setBounds(150,140,130,30);
		btnListar.setBounds(290, 140, 130, 30);
		
		ct.add(lblNome);
		ct.add(txtNome);
		ct.add(lblIdade);
		ct.add(txtIdade);
		ct.add(lblCPF);
		ct.add(txtCPF);
		ct.add(lblRG);
		ct.add(txtRG);
		ct.add(btnSubmeter);
		ct.add(btnLimpar);
		ct.add(btnListar);

	}
	
	public Formulario(){
		initComponents();
		initLayout();
				
		setSize(430,200);
		
		setTitle("Formulário");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
		
	public static void main(String[] args) {
		Formulario form = new Formulario();
		form.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
