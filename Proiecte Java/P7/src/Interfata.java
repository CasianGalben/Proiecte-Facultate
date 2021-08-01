import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

public class Interfata extends JFrame {
	
	int pozitie;
	JLabel l_titlu, l_interpret, l_durata;
	JTextField t_titlu, t_interpret;
	JSpinner s_durata;
	JButton b_first, b_previous, b_next, b_last, b_add, b_delete;
	List <Melodie> lista;
	
	
	public Interfata() {
		
		super("Gestiune melodii");
		
		lista = new ArrayList<>();
		pozitie = 0;
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setSize(350, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		l_titlu = new JLabel("Titlu");
		l_titlu.setPreferredSize(new Dimension(60, 12));
		l_titlu.setHorizontalAlignment(SwingConstants.RIGHT);
		
		l_interpret = new JLabel("Interpret");
		l_interpret.setPreferredSize(new Dimension(60, 12));
		l_interpret.setHorizontalAlignment(SwingConstants.RIGHT);
		
		l_durata = new JLabel("Durata");
		l_durata.setPreferredSize(new Dimension(60, 12));
		l_durata.setHorizontalAlignment(SwingConstants.RIGHT);
		
		t_titlu = new JTextField(22);
		t_interpret = new JTextField(22);
		s_durata = new JSpinner(new SpinnerNumberModel(90, 60, 200, 1));
		
		
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.setPreferredSize(new Dimension(350, 100));
		
		top.add(l_titlu);
		top.add(t_titlu);
		top.add(l_interpret);
		top.add(t_interpret);
		top.add(l_durata);
		top.add(s_durata);
		
		add(top);
		
		b_first = new JButton("First");
		b_previous = new JButton("Previous");
		b_next = new JButton("Next");
		b_last = new JButton("Last");
		b_add = new JButton("Add");
		b_delete = new JButton("Delete");
		
		JPanel mij = new JPanel(new FlowLayout(FlowLayout.LEFT));
		mij.setPreferredSize(new Dimension(350, 45));
		
		mij.add(b_first);
		mij.add(b_previous);
		mij.add(b_next);
		mij.add(b_last);
		
		add(mij);
		
		JPanel jos = new JPanel(new BorderLayout());
		jos.setPreferredSize(new Dimension(300, 45));
		JPanel left = new JPanel(new FlowLayout());
		JPanel right = new JPanel(new FlowLayout());
		
		left.add(b_add);
		right.add(b_delete);
		
		jos.add(left, BorderLayout.WEST);
		jos.add(right, BorderLayout.EAST);
		
		add(jos);
		
		
		b_add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				lista.add(new Melodie(t_titlu.getText(), t_interpret.getText(), (int) s_durata.getValue()));
				pozitie = lista.size() - 1;
				
			}
			
		});
		
		b_delete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				
				if(lista.size() != 0) {

					lista.remove(pozitie);
					pozitie--;
					t_titlu.setText(null);
					t_interpret.setText(null);
					s_durata.setValue(90);
				}
			}
			
		});
		
		
		b_last.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				if(lista.size() != 0) {
					
					pozitie = lista.size() - 1;
					t_titlu.setText(lista.get(pozitie).getTitlu());
					t_interpret.setText(lista.get(pozitie).getInterpret());
					s_durata.setValue(lista.get(pozitie).getDurata());
				}
			}
			
		});
		
		b_first.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				if(lista.size() != 0) {
					
					pozitie = 0;
					t_titlu.setText(lista.get(pozitie).getTitlu());
					t_interpret.setText(lista.get(pozitie).getInterpret());
					s_durata.setValue(lista.get(pozitie).getDurata());
				}
			}
			
		});
		
		b_next.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				if(lista.size() != 0) {
					if(pozitie != lista.size() - 1) {
						
						pozitie++;
						t_titlu.setText(lista.get(pozitie).getTitlu());
						t_interpret.setText(lista.get(pozitie).getInterpret());
						s_durata.setValue(lista.get(pozitie).getDurata());
						
					}
				}
			}
			
		});
		
		b_previous.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				if(lista.size() != 0) {
					if(pozitie != 0) {

						pozitie--;
						t_titlu.setText(lista.get(pozitie).getTitlu());
						t_interpret.setText(lista.get(pozitie).getInterpret());
						s_durata.setValue(lista.get(pozitie).getDurata());
						
					}
				}
			}
			
		});
	}
	
	
}
