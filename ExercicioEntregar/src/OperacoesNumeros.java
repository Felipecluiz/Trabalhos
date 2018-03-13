import javax.swing.JOptionPane;

public class OperacoesNumeros {

	
	
	
	public int RetornaUmouZero() {
		
		int imp=0;
		int rec=Integer.parseInt(JOptionPane.showInputDialog("digite um valor qualquer "));
		if (rec > 0) {
			imp=1;
		}
		else if  (rec <= 0) {
		  imp=0;
		}
		
		return imp;
		
	}
	
	
	
	
	public int Rec2NumPara(int rec,int rec2) {
		
		int acumul=0;
		if (rec < rec2 ) {
			
			//acumul=rec;
			//se o numero for par
			
				while (rec < (rec2-1)) {
					
					
					rec++;
					acumul+=rec;
					
					//JOptionPane.showMessageDialog(null, rec);
						
					}

		}
		
	
		
		
		
		return acumul;
		
		
		
	}
	
	///rec3 é o a
	public int Rec3Numeros() {
		int rec, rec2,  rec3;
	
		//rec=b
		//rec2=c
		//rec3=a
		
		do {
		
		rec3=Integer.parseInt(JOptionPane.showInputDialog("digite o num A, em que ele deve ser > 1"));

		}while(rec3 <= 1);
		
		
		rec=Integer.parseInt(JOptionPane.showInputDialog("digite o num B"));

		rec2=Integer.parseInt(JOptionPane.showInputDialog("digite o num C"));
		
		

		int acumul=0;
		
		//rec=b rec2=c
		if (rec < rec2 ) {
			
			if (rec%2==0) {
				while (rec != (rec2+1)) {
					
					
					
					
					if (rec%rec3==0) {
					acumul+=rec;
					rec++;
					}
					else {
						rec++;
						}
					}
				
			}
			else if (rec%2==1) {
				
                     while (rec != (rec2+1)) {
					
					
					
					if (rec%rec3==0) {
					
					acumul+=rec;
					rec++;
					}
					else {
					rec++;
					}
						
					}
				
				
			}
			
			
			
			
			
			
			
		}
		

		/*//rec=b rec2=c
		else {
			
		if ((rec+rec2)%rec3 == 0)
			
				return rec+rec2;
			
		}*/
		
		
		
		return acumul;
		
		
		
		
	}
	
	
	
	
	
	//recebe segundos e transforma em horas, minutos e segundos
	public void MetConversor() {
		int seg=0,hours=0,min=0,segimp=0;
		
		
		seg=Integer.parseInt(JOptionPane.showInputDialog("digite quantos segundos preferir"));
		
		segimp=seg%60;
		
		if ((min=seg/60) > 60) {
			hours=min/60;
		}
		
		
		min=seg%60;
		
		
		
		
		JOptionPane.showMessageDialog(null, "hora:"+hours+" min:"+min+" seg:"+segimp);
		
		
	}
	
	
	
}



