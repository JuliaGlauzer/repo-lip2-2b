import javax.swing.JOptionPane;

public class CriaUsuario {

	public static void main(String[] args) {
		int rm = 82655;
		String nome = "Julia";
		String username = nome+ "_"+rm;
		
		JOptionPane.showMessageDialog(null, 
				"Rm:" + rm + "\n" +
				"Nome: "+ nome +"\n "+
				"Usuário: " + username);
		

	}

}
