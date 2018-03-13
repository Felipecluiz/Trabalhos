import javax.swing.JOptionPane;

public class Controle {

	public static void main(String[] args) {
		
		
		
		int rec=-1;
		OperacoesNumeros obj = new OperacoesNumeros();
		
		do {
			
			rec=Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para negativo ou positivo; 2 para soma de 2 nms positivos entre eles;"+"\n"
					+ "3 para receber 3 numeros inteiros, que soma b e c que sao divisiveis por a;"+"\n"
					+ " 4 para converter segundos para h/m/s; 0 para sair"));
			
			
			
			switch (rec) {
			case 1:{
				JOptionPane.showMessageDialog(null,"valor "+obj.RetornaUmouZero());

				break;
				
				
			}
			case 2:{
				int rec2=0,rec3=0;
				rec2=Integer.parseInt(JOptionPane.showInputDialog("digite o numero menor"));
				rec3=Integer.parseInt(JOptionPane.showInputDialog("digite o numero maior"));
				
				JOptionPane.showMessageDialog(null,"soma "+obj.Rec2NumPara(rec2, rec3));

				break;
				
			}
			case 3:{
				JOptionPane.showMessageDialog(null,"resultado "+obj.Rec3Numeros());

				
				break;
				
			}
			case 4:{
				obj.MetConversor();
				break;
				
			}
			
			
			
			}
			
			
			
			
		}while(rec!=0);
		
		
		
	}

}
