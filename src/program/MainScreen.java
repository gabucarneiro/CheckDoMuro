package program;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import entities.Bloco;
import entities.Muro;
import entities.Terreno;
import operations.ConstruirMuro;

public class MainScreen {

	private JFrame frmCalculandoAQuantidade;
	private JTextField etAlturaDoMuro;
	private JTextField etFrente;
	private JTextField etLadoEsquerdo;
	private JTextField etLadoDireito;
	private JTextField etFundo;
	private JTextField etLarguraDoBloco;
	private JTextField etAlturaDoBloco;
	private JTextField etBaseDoBloco;
	private JTextField etNomeDoBloco;
	private JTextField etValorBloco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
					window.frmCalculandoAQuantidade.setVisible(true);
					window.frmCalculandoAQuantidade.setLocation(1000, 300);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculandoAQuantidade = new JFrame();
		frmCalculandoAQuantidade.setResizable(false);
		frmCalculandoAQuantidade.getContentPane().setBackground(new Color(153, 255, 204));
		frmCalculandoAQuantidade.getContentPane().setForeground(Color.BLACK);
		frmCalculandoAQuantidade.setTitle("Calculando a quantidade de blocos para o muro");
		frmCalculandoAQuantidade.setForeground(Color.BLACK);
		frmCalculandoAQuantidade.setBackground(Color.YELLOW);
		frmCalculandoAQuantidade.setBounds(100, 100, 461, 695);
		frmCalculandoAQuantidade.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculandoAQuantidade.getContentPane().setLayout(null);
				
		
		etAlturaDoMuro = new JTextField();
		etAlturaDoMuro.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				etAlturaDoMuro.selectAll();
			}
		});
		etAlturaDoMuro.setText("2");
		etAlturaDoMuro.setHorizontalAlignment(SwingConstants.CENTER);
		etAlturaDoMuro.setToolTipText("Altura do muro");
		etAlturaDoMuro.setBounds(43, 262, 86, 20);
		frmCalculandoAQuantidade.getContentPane().add(etAlturaDoMuro);
		etAlturaDoMuro.setColumns(10);
		
		etFrente = new JTextField();
		etFrente.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				etFrente.selectAll();
			}
		});
		etFrente.setText("16");
		etFrente.setHorizontalAlignment(SwingConstants.CENTER);
		etFrente.setToolTipText("Apenas números");
		etFrente.setBounds(266, 221, 86, 20);
		frmCalculandoAQuantidade.getContentPane().add(etFrente);
		etFrente.setColumns(10);
		
		etLadoEsquerdo = new JTextField();
		etLadoEsquerdo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				etLadoEsquerdo.selectAll();
			}
		});
		etLadoEsquerdo.setText("25");
		etLadoEsquerdo.setToolTipText("Apenas números");
		etLadoEsquerdo.setHorizontalAlignment(SwingConstants.CENTER);
		etLadoEsquerdo.setColumns(10);
		etLadoEsquerdo.setBounds(10, 175, 86, 20);
		frmCalculandoAQuantidade.getContentPane().add(etLadoEsquerdo);
		
		etLadoDireito = new JTextField();
		etLadoDireito.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				etLadoDireito.selectAll();
			}
		});
		etLadoDireito.setText("25");
		etLadoDireito.setToolTipText("Apenas números");
		etLadoDireito.setHorizontalAlignment(SwingConstants.CENTER);
		etLadoDireito.setColumns(10);
		etLadoDireito.setBounds(303, 84, 86, 20);
		frmCalculandoAQuantidade.getContentPane().add(etLadoDireito);
		
		etFundo = new JTextField();
		etFundo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				etFundo.selectAll();
			}
		});
		etFundo.setText("16");
		etFundo.setToolTipText("Apenas números");
		etFundo.setHorizontalAlignment(SwingConstants.CENTER);
		etFundo.setColumns(10);
		etFundo.setBounds(89, 72, 86, 20);
		frmCalculandoAQuantidade.getContentPane().add(etFundo);
		
		JLabel tvLadoEsquerdo = new JLabel("Lado esquerdo");
		tvLadoEsquerdo.setHorizontalAlignment(SwingConstants.CENTER);
		tvLadoEsquerdo.setBounds(10, 159, 86, 14);
		frmCalculandoAQuantidade.getContentPane().add(tvLadoEsquerdo);
		
		JLabel lblFundo = new JLabel("Fundo");
		lblFundo.setHorizontalAlignment(SwingConstants.CENTER);
		lblFundo.setBounds(89, 57, 86, 14);
		frmCalculandoAQuantidade.getContentPane().add(lblFundo);
		
		JLabel lblFrente = new JLabel("Frente");
		lblFrente.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrente.setBounds(266, 208, 86, 14);
		frmCalculandoAQuantidade.getContentPane().add(lblFrente);
		
		JLabel lblLadoDireito = new JLabel("Lado direito");
		lblLadoDireito.setHorizontalAlignment(SwingConstants.CENTER);
		lblLadoDireito.setBounds(303, 68, 86, 14);
		frmCalculandoAQuantidade.getContentPane().add(lblLadoDireito);
		
		JLabel lblAlturaDoMuro = new JLabel("Altura do muro");
		lblAlturaDoMuro.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlturaDoMuro.setBounds(43, 247, 86, 14);
		frmCalculandoAQuantidade.getContentPane().add(lblAlturaDoMuro);
		
		JLabel tvValorBlocoLinha = new JLabel("R$ 0,00");
		tvValorBlocoLinha.setBounds(323, 560, 112, 14);
		frmCalculandoAQuantidade.getContentPane().add(tvValorBlocoLinha);
		
		JLabel tvValorBlocoTotal = new JLabel("R$ 0,00");
		tvValorBlocoTotal.setBounds(323, 584, 112, 14);
		frmCalculandoAQuantidade.getContentPane().add(tvValorBlocoTotal);
		
		JLabel tv_ValorPorLinha = new JLabel("Valor por linha:");
		tv_ValorPorLinha.setHorizontalAlignment(SwingConstants.RIGHT);
		tv_ValorPorLinha.setBounds(224, 560, 89, 14);
		frmCalculandoAQuantidade.getContentPane().add(tv_ValorPorLinha);
		
		JLabel tv_ValorTotal = new JLabel("Valor total:");
		tv_ValorTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		tv_ValorTotal.setBounds(224, 584, 89, 14);
		frmCalculandoAQuantidade.getContentPane().add(tv_ValorTotal);
		
		JLabel tv_BlocosPorLinha = new JLabel("Blocos por linha:");
		tv_BlocosPorLinha.setHorizontalAlignment(SwingConstants.RIGHT);
		tv_BlocosPorLinha.setBounds(10, 560, 102, 14);
		frmCalculandoAQuantidade.getContentPane().add(tv_BlocosPorLinha);
		
		JLabel tvQuantidadeBlocoLinha = new JLabel("0");
		tvQuantidadeBlocoLinha.setBounds(122, 560, 112, 14);
		frmCalculandoAQuantidade.getContentPane().add(tvQuantidadeBlocoLinha);
		
		JLabel tv_BlocosTotais = new JLabel("Blocos por linha:");
		tv_BlocosTotais.setHorizontalAlignment(SwingConstants.RIGHT);
		tv_BlocosTotais.setBounds(10, 584, 102, 14);
		frmCalculandoAQuantidade.getContentPane().add(tv_BlocosTotais);
		
		JLabel tvQuantidadeBlocoTotais = new JLabel("0");
		tvQuantidadeBlocoTotais.setBounds(122, 584, 112, 14);
		frmCalculandoAQuantidade.getContentPane().add(tvQuantidadeBlocoTotais);
		
		JLabel tv_Largura = new JLabel("Largura");
		tv_Largura.setHorizontalAlignment(SwingConstants.CENTER);
		tv_Largura.setBounds(266, 437, 86, 14);
		frmCalculandoAQuantidade.getContentPane().add(tv_Largura);
		
		etLarguraDoBloco = new JTextField();
		etLarguraDoBloco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				etLarguraDoBloco.selectAll();
			}
		});
		etLarguraDoBloco.setToolTipText("Apenas números decimais");
		etLarguraDoBloco.setText("0.24");
		etLarguraDoBloco.setHorizontalAlignment(SwingConstants.CENTER);
		etLarguraDoBloco.setColumns(10);
		etLarguraDoBloco.setBounds(266, 453, 86, 20);
		frmCalculandoAQuantidade.getContentPane().add(etLarguraDoBloco);
		
		JLabel tv_Altura = new JLabel("Altura");
		tv_Altura.setHorizontalAlignment(SwingConstants.CENTER);
		tv_Altura.setBounds(63, 371, 86, 14);
		frmCalculandoAQuantidade.getContentPane().add(tv_Altura);
		
		etAlturaDoBloco = new JTextField();
		etAlturaDoBloco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				etAlturaDoBloco.selectAll();
			}
		});
		etAlturaDoBloco.setToolTipText("Apenas números decimais");
		etAlturaDoBloco.setText("0.14");
		etAlturaDoBloco.setHorizontalAlignment(SwingConstants.CENTER);
		etAlturaDoBloco.setColumns(10);
		etAlturaDoBloco.setBounds(63, 384, 86, 20);
		frmCalculandoAQuantidade.getContentPane().add(etAlturaDoBloco);
		
		JLabel tv_Base = new JLabel("Base");
		tv_Base.setHorizontalAlignment(SwingConstants.CENTER);
		tv_Base.setBounds(92, 424, 86, 14);
		frmCalculandoAQuantidade.getContentPane().add(tv_Base);
		
		etBaseDoBloco = new JTextField();
		etBaseDoBloco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				etBaseDoBloco.selectAll();
			}
		});
		etBaseDoBloco.setToolTipText("Apenas números decimais");
		etBaseDoBloco.setText("0.115");
		etBaseDoBloco.setHorizontalAlignment(SwingConstants.CENTER);
		etBaseDoBloco.setColumns(10);
		etBaseDoBloco.setBounds(92, 440, 86, 20);
		frmCalculandoAQuantidade.getContentPane().add(etBaseDoBloco);
		
		etNomeDoBloco = new JTextField();
		etNomeDoBloco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				etNomeDoBloco.selectAll();
			}
		});
		etNomeDoBloco.setToolTipText("Nome para identificar o bloco");
		etNomeDoBloco.setText("Bloco de cerâmica de 9 furos - bloco baiano");
		etNomeDoBloco.setHorizontalAlignment(SwingConstants.LEFT);
		etNomeDoBloco.setColumns(30);
		etNomeDoBloco.setBounds(122, 493, 316, 20);
		frmCalculandoAQuantidade.getContentPane().add(etNomeDoBloco);
		
		JLabel tv_NomeBloco = new JLabel("Nome do bloco:");
		tv_NomeBloco.setHorizontalAlignment(SwingConstants.RIGHT);
		tv_NomeBloco.setBounds(10, 496, 102, 14);
		frmCalculandoAQuantidade.getContentPane().add(tv_NomeBloco);
		
		JLabel tv_ValorDoBloco = new JLabel("Valor: R$");
		tv_ValorDoBloco.setHorizontalAlignment(SwingConstants.RIGHT);
		tv_ValorDoBloco.setBounds(37, 521, 75, 14);
		frmCalculandoAQuantidade.getContentPane().add(tv_ValorDoBloco);
		
		etValorBloco = new JTextField();
		etValorBloco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				etValorBloco.selectAll();
			}
		});
		etValorBloco.setToolTipText("Apenas números");
		etValorBloco.setText("1.4");
		etValorBloco.setHorizontalAlignment(SwingConstants.LEFT);
		etValorBloco.setColumns(10);
		etValorBloco.setBounds(122, 518, 86, 20);
		frmCalculandoAQuantidade.getContentPane().add(etValorBloco);
		
		JLabel tv_Bloco = new JLabel("Bloco");
		tv_Bloco.setFont(new Font("Tahoma", Font.BOLD, 19));
		tv_Bloco.setHorizontalAlignment(SwingConstants.CENTER);
		tv_Bloco.setBounds(115, 293, 224, 31);
		frmCalculandoAQuantidade.getContentPane().add(tv_Bloco);
		
		JLabel tv_Terreno = new JLabel("Terreno");
		tv_Terreno.setHorizontalAlignment(SwingConstants.CENTER);
		tv_Terreno.setFont(new Font("Tahoma", Font.BOLD, 19));
		tv_Terreno.setBounds(115, 11, 224, 31);
		frmCalculandoAQuantidade.getContentPane().add(tv_Terreno);
		
		JButton btnCalculate = new JButton("Calcular");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<ConstruirMuro> listCMuro = new ArrayList<>();
				Bloco bloco = new Bloco();
				Terreno terreno = new Terreno();
				ConstruirMuro cm;
					
				double alturaDoMuro;
				try {
					alturaDoMuro = Double.parseDouble(etAlturaDoMuro.getText().toString());
					
					terreno.setFrente(Double.parseDouble(etFrente.getText().toString()));
					terreno.setLadoEsquerdo(Double.parseDouble(etLadoEsquerdo.getText().toString()));
					terreno.setFundo(Double.parseDouble(etFundo.getText().toString()));
					terreno.setLadoDireito(Double.parseDouble(etLadoDireito.getText().toString()));

				} catch (Exception ex) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null, "Favor inserir número válido", "Erro - número inválido", 0);
					alturaDoMuro = 0;
					terreno.setFrente(0.0);
					terreno.setLadoEsquerdo(0.0);
					terreno.setFundo(0.0);
					terreno.setLadoDireito(0.0);
				}
				System.out.println(terreno.toString());

				System.out.println();
				String nomeBloco = (etNomeDoBloco.getText().toString());
				System.out.println(" ----- " + nomeBloco + " ----- ");
				System.out.println();
				
				double valorBloco = Double.parseDouble(etValorBloco.getText().toString());
				bloco = new Bloco(nomeBloco, Double.parseDouble(etBaseDoBloco.getText().toString()), Double.parseDouble(etAlturaDoBloco.getText().toString()), Double.parseDouble(etLarguraDoBloco.getText().toString()), valorBloco);
				System.out.println(bloco.toString());
				System.out.println();
				
				Muro muro = new Muro(alturaDoMuro, bloco, terreno);

				cm = new ConstruirMuro(muro, muro.getValor(), alturaDoMuro);
				listCMuro.add(cm);
				System.out.println("-------------------");
				System.out.println(cm.toString());
				tvValorBlocoLinha.setText("R$" + Double.parseDouble(String.valueOf(Math.nextUp(cm.getValorLinha()))));
				tvValorBlocoTotal.setText("R$" + Math.nextUp(Double.parseDouble(String.valueOf(Math.nextUp(cm.getValorMuro())))));
				tvQuantidadeBlocoLinha.setText(String.valueOf(muro.quantidadeBlocosPorLinha()));
				tvQuantidadeBlocoTotais.setText(String.valueOf(muro.quantidadeBlocosAltura(alturaDoMuro)));

				System.out.println();
			}
		});
		

		btnCalculate.setBackground(new Color(255, 255, 204));
		btnCalculate.setBounds(177, 619, 89, 23);
		frmCalculandoAQuantidade.getContentPane().add(btnCalculate);
			
		
		JLabel imgTerreno = new JLabel("");
		imgTerreno.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/Contour-lines-grouped.jpg")).getImage();
		imgTerreno.setIcon(new ImageIcon(img));
		imgTerreno.setBounds(102, 35, 251, 242);
		frmCalculandoAQuantidade.getContentPane().add(imgTerreno);
		
		JLabel imgBloco = new JLabel("");
		imgBloco.setBounds(142, 335, 191, 120);
		imgBloco.setHorizontalAlignment(SwingConstants.CENTER);
		Image imgBlocoPng = new ImageIcon(this.getClass().getResource("/imgBloco.jpg")).getImage();
		imgBloco.setIcon(new ImageIcon(imgBlocoPng));
		frmCalculandoAQuantidade.getContentPane().add(imgBloco);
		
		
		
		
	}
}
