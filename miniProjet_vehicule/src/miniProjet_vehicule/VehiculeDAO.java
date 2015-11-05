package miniProjet_vehicule;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VehiculeDAO implements Serializable  {
	private static final long serialVersionUID = 1L;
	Statement st ;
	Connection cnx = null ;
	private int code;
	public Vehicule getV() {
		return v;
	}
	public void setV(Vehicule v) {
		this.v = v;
	}
	Vehicule v=new Vehicule();
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Statement Connexion() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		 cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/accidents","root","");
		 st = cnx.createStatement();
		
		return st ;
		
	}
public String insert() throws SQLException, ClassNotFoundException{
		
		st=Connexion() ;
		String req = "insert into vehicule values ("+v.getNb_vehicule()+",'"+v.getGenre_vehicule()+"','"+v.getNationnalite()+
				"','"+v.getProp_vehicule()+"','"+v.getProb_vehicule()+"','"+v.getScan_vehicule()+"')";
		st.executeUpdate(req) ;
		
	
   return null;}
	public String modif(){
		String a=null;
		try {
			st=Connexion();
		st.executeUpdate("update vehicule set nb_vehicule="+v.getNb_vehicule()+",genre_vehicule='"+v.getGenre_vehicule()+
				"',nationnalite='"+v.getNationnalite()+"', prop_vehicule='"+v.getProp_vehicule()+"', prob_vehicule='"+
				v.getProb_vehicule()+"', scan_vehicule='"+v.getScan_vehicule()+"' where id="+code);
		a="modifier avec succces";
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}
	public String supp(){
		String a=null;
		try {
			st=Connexion();
			if (this.recherche()!=0){
			st.executeUpdate("delete from vehicule where id="+code);
			System.out.print("Suppression avec succes");}
			else
				System.out.print("vehicule invalide");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}
	public int recherche(){
		int a=0;
		try {
			ResultSet rs=st.executeQuery("select * from vehicule where id="+code);
			while(rs.next()){
				a++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}
}
