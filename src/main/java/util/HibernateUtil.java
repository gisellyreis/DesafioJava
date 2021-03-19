package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.hibernate.Session;


public class HibernateUtil {
	public static Session pegarSessao() {
        return HibernateConfig.getSessionFactory().getCurrentSession();
    }

  
    public static Connection pegarConexao() {

        Connection conexao = null;

        try {
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
            }
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/giselly",
                    "giselly",
                    "root");
        } catch (SQLException ex) {
        }
        return conexao;
    }

}
